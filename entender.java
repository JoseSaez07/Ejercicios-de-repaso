import java.util.Arrays;

public class entender {

    // --- Declaraciones (impleméntalas tú según el enunciado) ---
    public static boolean validar(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                int valor = m[i][j];

                if (valor < -10 || valor > 45) {
                    return false; // si alguno NO cumple → no es válido
                }
            }
        }
        return true; // si todos cumplen → es válido
    }

    public static double[] mediasDiarias(int[][] m) {
        int dias = m.length;
        int franja = m[0].length;
        double[] resultado = new double[dias];
        for (int i = 0; i < dias; i++) {
            int suma = 0; // Empezmos la suma desde el dia 0.
            for (int j = 0; j < franja; j++) {
                suma += m[i][j]; // Sumamos el valor de la franja al total del dia actual
            }
            resultado[i] = (double) suma / franja;
        }
        return resultado;
    }

    public static int[] maximosPorFranja(int[][] m) {
        int franja = m[0].length;
        int[] resultado = new int[franja];
        for (int j = 0; j < franja; j++) {
            int max = m[0][j];
            for (int i = 0; i < m.length; i++) {
                if (max < m[i][j]) {
                    max = m[i][j];
                }
            }
            resultado[j] = max;
        }
        return resultado;
    }

    public static double[] mediasPorFranja(int[][] m) {
        int dias = m.length;
        int franja = m[0].length;
        double[] resultado = new double[franja];
        for (int j = 0; j < franja; j++) {
            int suma = 0; // Empezmos la suma desde el dia 0.
            for (int i = 0; i < dias; i++) {
                suma += m[i][j]; // Sumamos el valor de la franja al total del dia actual
            }
            resultado[j] = (double) suma / dias;
        }
        return resultado;
    }

    public static void imprimirPorDia(int[][] m) {

    }

    public static void main(String[] args) {
        // Matriz 7x3 ya rellena (días × [mañana, tarde, noche])
        int[][] m = {
                { 15, 22, 18 },
                { 20, 25, 19 },
                { 12, 17, 16 },
                { 28, 30, 26 },
                { 10, 14, 13 },
                { 21, 23, 20 },
                { 18, 27, 24 }
        };

        // Llamadas a los métodos (debes tenerlos implementados)
        if (!validar(m)) {
            System.out.println("Hay valores fuera de [-10, 45].");
            return;
        }

        double[] mediasDia = mediasDiarias(m);
        int[] maxFranjas = maximosPorFranja(m); // [maxMañana, maxTarde, maxNoche]
        double[] mediasFranjas = mediasPorFranja(m); // [mediaMañanas, mediaTardes, mediaNoches]

        imprimirPorDia(m);

        System.out.println("Medias por día: " + Arrays.toString(mediasDia));
        System.out.println("Máximos por franja [mañana, tarde, noche]: " + Arrays.toString(maxFranjas));
        System.out.println("Medias por franja [mañanas, tardes, noches]: " + Arrays.toString(mediasFranjas));
    }

}
