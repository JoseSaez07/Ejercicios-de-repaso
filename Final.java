public class Final {
    public static int[][] crearMatrizes(int A[][], int B[][]) {
        int filas = A.length;
        int columnas = A[0].length;
        int[][] resultado = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (A[i][j] > B[i][j]) {
                    resultado[i][j] = B[i][j];
                } else {
                    resultado[i][j] = A[i][j];
                }
            }
        }
        return resultado;
    }

    public static void imprimirMatrices(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void imprimirNumero(double n) {
        System.out.printf("Media general: %.2f%n", n);
    }

    public static void imprimirVector(double[] v) {
        System.out.print("Media: ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    public static double[] mediaA(int A[][]) {
        int filas = A.length;
        int columnas = A[0].length;
        double[] resultado = new double[filas];
        for (int i = 0; i < filas; i++) {
            int suma = 0;
            for (int j = 0; j < columnas; j++) {
                suma += A[i][j];
            }
            resultado[i] = (double) suma / columnas;
        }
        return resultado;
    }

    public static double mediaGeneral(int A[][]) {
        int filas = A.length;
        int columnas = A[0].length;
        int suma = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma += A[i][j];
            }
        }
        return (double) suma / (filas * columnas);
    }

    public static void main(String[] args) {
        int[][] A = {
                { 1, 2, 3 },
                { 4, 2, 3 },
                { 5, 2, 9 }
        };
        int[][] B = {
                { 1, 4, 1 },
                { 1, 3, 1 },
                { 1, 4, 3 }
        };
        int[][] C = crearMatrizes(A, B);
        imprimirMatrices(C);

        double[] K = mediaA(A);
        imprimirVector(K);

        double BM = mediaGeneral(A);
        imprimirNumero(BM);
    }
}
