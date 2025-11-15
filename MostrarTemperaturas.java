
/**
 * La clase {@code IntroduccionArrays} sirve como ejemplo básico para introducir
 * el uso de <b>arrays unidimensionales</b> en Java.
 * <p>
 * En este ejemplo se muestra cómo:
 * <ul>
 * <li>Declarar y crear un array de tipo {@code int}.</li>
 * <li>Asignar valores a cada elemento del array.</li>
 * <li>Pasar un array como argumento a un método.</li>
 * <li>Recorrer y mostrar su contenido por pantalla.</li>
 * </ul>
 * </p>
 *
 * <p>
 * El programa imprime las temperaturas máximas registradas durante una semana.
 * </p>
 *
 * @author Iván Corrales
 * @version 12/10/2025
 */
public class MostrarTemperaturas {

    /**
     * Muestra por consola la temperatura máxima correspondiente a cada día de la
     * semana.
     * <p>
     * Ejemplo de salida esperada:
     * </p>
     * 
     * <pre>
     * Lunes: 22º
     * Martes: 25º
     * Miércoles: 24º
     * ...
     * Domingo: 18º
     * </pre>
     *
     * @param temperaturas array de enteros que contiene las temperaturas máximas
     *                     correspondientes a los días de la semana, en orden.
     *                     Debe tener exactamente 7 elementos.
     */
    public void maxTemperaturas(int[] temperaturas) {
        String[] diasSemana = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println(diasSemana[i] + ": " + temperaturas[i] + "ª");
        }

    }

    /**
     * Método principal del prosola.
     *
     * @param args argumentos de línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {
        int[] temperaturas = { 22, 23, 24, 24, 23, 21, 20 };
        MostrarTemperaturas argumento = new MostrarTemperaturas();
        argumento.maxTemperaturas(temperaturas);

    }
}
