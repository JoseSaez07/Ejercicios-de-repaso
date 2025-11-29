import java.util.Arrays;
import java.text.DecimalFormat;

public class s {

    // --- Media por alumno ---
    public static double[] mediasPorAlumno(int[][] m) {
        int alumno = m.length;
        int asignatura = m[0].length;
        double[] medias = new double[alumno];
        for (int i = 0; i < alumno; i++) {
            int suma = 0;
            for (int j = 0; j < asignatura; j++) {
                suma += m[i][j];
            }
            medias[i] = (double) suma / asignatura;

        }
        return medias;
    }

    // --- Media general ---
    public static double mediaGeneral(int[][] m) {
        int alumno = m.length;
        int asignatura = m[0].length;
        int suma = 0;
        for (int i = 0; i < alumno; i++) {
            for (int j = 0; j < asignatura; j++) {
                suma += m[i][j];
            }
        }
        return (double) suma / (alumno * asignatura);
    }

    // --- Máxima nota ---
    public static int maximo(int[][] m) {
        int max = m[0][0];

        for (int[] fila : m) {
            for (int nota : fila) {
                if (nota > max) {
                    max = nota;
                }
            }
        }
        return max;
    }

    // --- Contar suspensos ---
    public static int contarSuspensos(int[][] m) {
        int susp = 0;

        for (int[] fila : m) {
            for (int nota : fila) {
                if (nota < 5) {
                    susp++;
                }
            }
        }
        return susp;
    }

    // --- Mostrar matriz ---
    public static void imprimirMatriz(int[][] m) {
        for (int[] fila : m) {
            for (int nota : fila) {
                System.out.printf("%4d", nota);
            }
            System.out.println();
        }
    }

    // --- MAIN ---
    public static void main(String[] args) {

        int[][] m = {
                { 7, 5, 3, 8 },
                { 9, 6, 5, 4 },
                { 2, 3, 1, 5 },
                { 10, 9, 8, 7 },
                { 6, 6, 6, 6 }
        };

        double[] mediasAlu = mediasPorAlumno(m);
        double mediaGrp = mediaGeneral(m);
        int max = maximo(m);
        int suspensos = contarSuspensos(m);

        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.println("Notas:");
        imprimirMatriz(m);

        System.out.println("Medias por alumno: " + Arrays.toString(
                Arrays.stream(mediasAlu).mapToObj(df::format).toArray()));

        System.out.println("Media general: " + df.format(mediaGrp));
        System.out.println("Nota máxima: " + max);
        System.out.println("Suspensos totales: " + suspensos);
    }
}
