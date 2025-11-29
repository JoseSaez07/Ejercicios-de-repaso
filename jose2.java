public class jose2 {
    public static int[][] crearMatrices(int[][] A, int[][] B) {
        int fila = A.length;
        int columna = A[0].length;
        int C[][] = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (A[i][j] > B[i][j]) {
                    C[i][j] = A[i][j];
                } else {
                    C[i][j] = B[i][j];
                }
            }
        }
        return C;
    }

    public static void recibirMatriz(int[][] jose) {
        for (int i = 0; i < jose.length; i++) {
            for (int j = 0; j < jose[i].length; j++) {
                System.out.print(jose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = {
                { 1, 4, 2 },
                { 5, 2, 3 },
                { 6, 8, 1 }
        };
        int[][] B = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 9, 1 }
        };
        int[][] C = crearMatrices(A, B);
        recibirMatriz(C);

    }
}