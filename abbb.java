public class abbb {
    public static void main(String[] args) {
        int[][] A = {
                { 1, 4, 2 },
                { 5, 0, 3 },
                { 2, 2, 9 }
        };
        int[][] B = {
                { 3, 1, 2 },
                { 2, 7, 3 },
                { 2, 5, 4 }
        };

        int[][] Csum = suma(A, B);
        int[][] Crest = resta(A, B);
        int[][] Cmul = productoElemento(A, B);
        int[][] Cmax = maximos(A, B);
        int[][] Ccmp = comparativa(A, B);
        double[][] Cavg = medias(A, B);

        System.out.println("Suma:");
        imprimir(Csum);
        System.out.println("Resta:");
        imprimir(Crest);
        System.out.println("Producto elemento:");
        imprimir(Cmul);
        System.out.println("Maximos:");
        imprimir(Cmax);
        System.out.println("Comparativa (-1,0,1):");
        imprimir(Ccmp);
        System.out.println("Medias:");
        imprimir(Cavg);
    }

    // ---- Stubs (impleméntalos tú) ----
    static int[][] suma(int[][] A, int[][] B) {
        int filas = A.length;
        int columnas = A[0].length;
        int C[][] = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }

        }
        return C;
    }

    static int[][] resta(int[][] A, int[][] B) {
        int filas = A.length;
        int columnas = A[0].length;
        int C[][] = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                C[i][j] = A[i][j] - B[i][j];

            }
        }
        return C;
    }

    static int[][] productoElemento(int[][] A, int[][] B) {
        return new int[0][0];
    }

    static int[][] maximos(int[][] A, int[][] B) {
        int filas = A.length;
        int columnas = A[0].length;
        int C[][] = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (A[i][j] > B[i][j]) {
                    C[i][j] = A[i][j];
                } else {
                    C[i][j] = B[i][j];
                }

            }
        }
        return C;
    }

    static int[][] comparativa(int[][] A, int[][] B) {
        return new int[0][0];
    }

    static double[][] medias(int[][] A, int[][] B) {
        return new double[0][0];
    }

    static void imprimir(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void imprimir(double[][] M) {

    }
}