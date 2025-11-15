import java.util.Scanner;

/**
 * La clase {@code RellenarArray} contiene métodos para crear y mostrar
 * un array de frutas introducidas por el usuario a través de consola.
 *
 * <p>
 * Ejemplo de uso:
 * 
 * <pre>{@code
 * Scanner sc = new Scanner(System.in);
 * String[] frutas = RellenarArray.crearArrayFrutas(sc);
 * RellenarArray.mostrarArrayFrutas(frutas);
 * sc.close();
 * }</pre>
 * </p>
 *
 * @author Iván Corrales
 * @version 1.0
 */
public class RellenarArray {

    /**
     * Crea un array de frutas solicitando al usuario que introduzca los nombres
     * por teclado.
     *
     * @param scanner objeto {@link Scanner} utilizado para leer la entrada del
     *                usuario.
     * @return un array de {@code String} con los nombres de las frutas
     *         introducidas.
     */
    public static String[] crearArrayFrutas(Scanner scanner) {
        String[] frutas = new String[5];
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Dime los nombres de la fruta: " + (i + 1));
            frutas[i] = scanner.nextLine();
        }
        return frutas;
    }

    /**
     * Muestra por consola las frutas almacenadas en el array recibido.
     *
     * @param frutas array de {@code String} que contiene los nombres de las frutas
     *               a mostrar.
     */
    public static void mostrarArrayFrutas(String[] frutas) {
        System.out.println("Tus frutas son: ");
        for (int i = 0; i < frutas.length; i++) {
            System.out.println((i + 1) + " Fruta " + frutas[i]);
        }

    }

    /**
     * Método principal que ejecuta el programa. Crea un array de frutas
     * y lo muestra en consola.
     *
     * @param args argumentos de línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] frutas = crearArrayFrutas(sc);
        mostrarArrayFrutas(frutas);
        sc.close();
    }
}