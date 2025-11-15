
public class BusquedaArtistas {

    static class Artista {
        private final String nombre;
        private final int seguidoresMiles;

        public Artista(String nombre, int seguidoresMiles) {
            this.nombre = nombre;
            this.seguidoresMiles = seguidoresMiles;
        }

        public String getNombre() {
            return nombre;
        }

        public int getSeguidoresMiles() {
            return seguidoresMiles;
        }

        @Override
        public String toString() {
            return String.format("%s (%,dK seguidores)", nombre, seguidoresMiles);
        }
    }

    // ------------------------------------------------------------
    // MÉTODOS implementados
    // ------------------------------------------------------------

    public static int indiceDe(Artista[] cartel, String nombreBuscado) {
        for (int i = 0; i < cartel.length; i++) {
            if (cartel[i].getNombre().equalsIgnoreCase(nombreBuscado)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean existe(Artista[] cartel, String nombreBuscado) {
        return indiceDe(cartel, nombreBuscado) != -1;
    }

    public static int[] indicesDeTodos(Artista[] cartel, String nombreBuscado) {
        // 1️⃣ Contar coincidencias
        int count = 0;
        for (Artista a : cartel) {
            if (a.getNombre().equalsIgnoreCase(nombreBuscado))
                count++;
        }

        // 2️⃣ Crear array del tamaño adecuado
        int[] indices = new int[count];
        int idx = 0;
        for (int i = 0; i < cartel.length; i++) {
            if (cartel[i].getNombre().equalsIgnoreCase(nombreBuscado)) {
                indices[idx++] = i;
            }
        }

        return indices;
    }

    public static int[] indicesPorInicial(Artista[] cartel, char inicial) {
        char inicialLower = Character.toLowerCase(inicial);

        // 1️⃣ Contar coincidencias
        int count = 0;
        for (Artista a : cartel) {
            if (!a.getNombre().isEmpty() && Character.toLowerCase(a.getNombre().charAt(0)) == inicialLower) {
                count++;
            }
        }

        // 2️⃣ Crear array
        int[] indices = new int[count];
        int idx = 0;
        for (int i = 0; i < cartel.length; i++) {
            if (!cartel[i].getNombre().isEmpty() &&
                    Character.toLowerCase(cartel[i].getNombre().charAt(0)) == inicialLower) {
                indices[idx++] = i;
            }
        }

        return indices;
    }

    public static int[] indicesPorInicialYSeguidores(Artista[] cartel, char inicial, int minSeguidoresMiles,
            int maxSeguidoresMiles) {
        char inicialLower = Character.toLowerCase(inicial);

        // 1️⃣ Contar coincidencias
        int count = 0;
        for (int i = 0; i < cartel.length; i++) {
            String nombre = cartel[i].getNombre();
            int seguidores = cartel[i].getSeguidoresMiles();
            if (!nombre.isEmpty() && Character.toLowerCase(nombre.charAt(0)) == inicialLower &&
                    seguidores >= minSeguidoresMiles && seguidores <= maxSeguidoresMiles) {
                count++;
            }
        }

        // 2️⃣ Crear array y rellenar
        int[] indices = new int[count];
        int idx = 0;
        for (int i = 0; i < cartel.length; i++) {
            String nombre = cartel[i].getNombre();
            int seguidores = cartel[i].getSeguidoresMiles();
            if (!nombre.isEmpty() && Character.toLowerCase(nombre.charAt(0)) == inicialLower &&
                    seguidores >= minSeguidoresMiles && seguidores <= maxSeguidoresMiles) {
                indices[idx++] = i;
            }
        }

        return indices;
    }

    public static void mostrarArtistas(Artista[] cartel, int[] indices) {
        for (int idx : indices) {
            System.out.println(" - [" + idx + "] " + cartel[idx]);
        }
    }

    // ------------------------------------------------------------
    // MAIN de pruebas
    // ------------------------------------------------------------
    public static void main(String[] args) {
        Artista[] cartel = {
                new Artista("Aitana", 1200),
                new Artista("Quevedo", 2500),
                new Artista("Bad Gyal", 900),
                new Artista("Rosalía", 3100),
                new Artista("Bizarrap", 5400),
                new Artista("Lola Índigo", 850),
                new Artista("Rels B", 2000),
                new Artista("Saiko", 1500),
                new Artista("Feid", 4200),
                new Artista("Karol G", 6800),
                new Artista("Rauw Alejandro", 3600),
                new Artista("Morad", 2700)
        };

        final String BUSCAR_UNO = "Rosalía";
        final String BUSCAR_TODOS = "Rels B";
        final char INICIAL = 'R';
        final char INICIAL2 = 'R';
        final int MIN = 2000;
        final int MAX = 4000;

        System.out.println("=== Demo rápida ===");

        // 1) Primera coincidencia
        int pos = indiceDe(cartel, BUSCAR_UNO);
        if (pos >= 0) {
            System.out.println("✔ " + BUSCAR_UNO + " actúa. Índice: " + pos);
            System.out.println("  Detalles: " + cartel[pos]);
        } else {
            System.out.println("✘ " + BUSCAR_UNO + " no actúa en el festival.");
        }

        // 2) Todas las coincidencias
        int[] todos = indicesDeTodos(cartel, BUSCAR_TODOS);
        System.out.println("\nCoincidencias de \"" + BUSCAR_TODOS + "\": " + todos.length);
        mostrarArtistas(cartel, todos);

        // 3) Por inicial
        int[] porInicial = indicesPorInicial(cartel, INICIAL);
        System.out
                .println("\nArtistas que empiezan por '" + Character.toUpperCase(INICIAL) + "': " + porInicial.length);
        mostrarArtistas(cartel, porInicial);

        // 4) Inicial + rango seguidores
        int[] filtrados = indicesPorInicialYSeguidores(cartel, INICIAL2, MIN, MAX);
        System.out.println("\nArtistas que empiezan por '" + Character.toUpperCase(INICIAL2)
                + "' y tienen entre " + MIN + "K y " + MAX + "K seguidores:");
        if (filtrados.length > 0) {
            mostrarArtistas(cartel, filtrados);
        } else {
            System.out.println("  (ninguno)");
        }
    }
}