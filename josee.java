public class josee {
    public static String[] ciudadesOriginal() {
        String[] ciudades = new String[] { "Malaga", "Lugo", "Fuelteal", "Girona", "Parla" };
        for (int i = 0; i < ciudades.length; i++) {
            System.out.println(ciudades[i]);
        }
        return ciudades;
    }

    public static void ciudadesCopiar(String[] original) {
        String[] copia = new String[original.length];
        for (int i = 0; i < original.length; i++) {
            copia[i] = original[i].toUpperCase();
        }
        for (int i = 0; i < copia.length; i++) {
            System.out.println(copia[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Minuscula");
        String[] lista = ciudadesOriginal();
        System.out.println();
        System.out.println("Mayuscula ");
        ciudadesCopiar(lista);
    }
}