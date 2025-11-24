import java.util.Arrays;
import java.util.Locale;

/** NO MODIFICAR: modelo simple de lectura diaria */
class Lectura {
    private final String dia; // "Lun", "Mar", ...
    private final int tMax;
    private final int tMin;

    public Lectura(String d, int max, int min) {
        dia = d;
        tMax = max;
        tMin = min;
        
    }

    public String getDia() {
        return dia;
    }

    public int getMax() {
        return tMax;
    }

    public int getMin() {
        return tMin;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "%s max:%d min:%d", dia, tMax, tMin);
    }
}

public class AB {

    /**
     * Muestra toda la serie: una lectura por línea usando toString().
     */
    public static void listar(Lectura[] l) {
        for (int i = 0; i < l.length; i++) {
            System.out.println(l[i]);
        }
    }

    /**
     * Devuelve el índice del día buscado (coincidencia EXACTA de texto, ignorando
     * mayúsculas).
     * Si no existe, -1.
     */
    public static int buscarDia(Lectura[] l, String dia) {
        for (int i = 0; i < l.length; i++) {
            Lectura lectura = l[i];
            if (lectura.getDia().equalsIgnoreCase(dia)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Devuelve un NUEVO array con las lecturas cuya temperatura máxima >= umbral.
     * Mantén el orden y no toques el array original.
     */
    public static Lectura[] diasCalurosos(Lectura[] l, int umbralMax) {
        // 1. Calcula el numero de elementos que cumplen la condición
        // Total de lecturas que cumplen la condición. Temperatura max >= umbralMax
        int contador = 0;
        for (int i = 0; i < l.length; i++) {
            Lectura lectura = l[i];
            if (lectura.getMax() >= umbralMax) {
                contador++;
            }
        }
        // 2. Crea un array del tamaño necesario (número de elementos que cumplen la
        // condición)
        Lectura[] salida = new Lectura[contador];

        // 3. Rellenar el array de salida con los elements que cumplen la condición
        // indice utilizado para poner valores en salida
        int j = 0;
        for (int i = 0; i < l.length; i++) {
            Lectura lectura = l[i];
            if (lectura.getMax() >= umbralMax) {
                salida[j] = lectura;
                j++;
            }
        }

        // 4. Devuelve el array de salida
        return salida;
    }

    /**
     * Devuelve el índice del día con MAYOR amplitud (max - min).
     * En empate, el primero. Si el array está vacío, -1.
     */
    public static int indiceMayorAmplitud(Lectura[] l) {
        int indice = 0;
        int mayorAmplitud = l[0].getMax() - l[0].getMin();
        for (int i = 1; i < l.length; i++) {
            Lectura lectura = l[i];
            int amplitud = lectura.getMax() - lectura.getMin();
            if (amplitud > mayorAmplitud) {
                indice = i;
                mayorAmplitud = amplitud;
            }
        }

        return indice;
    }

    /**
     * Devuelve el índice del día con menor temperatura.
     * En empate, el primero. Si el array está vacío, -1.
     */
    public static int indiceMenorMinTemperatura(Lectura[] l) {
        int indice = 0;
        int menorTemperatura = l[0].getMin();
        for (int i = 1; i < l.length; i++) {
            Lectura lectura = l[i];
            if (lectura.getMin() < menorTemperatura) {
                indice = i;
                menorTemperatura = lectura.getMin();
            }
        }
        return indice;
    }

    /**
     * Devuelve un subarray [from, to) de lecturas (to excluido).
     * Ajusta límites si llegan mal: 0..length; si from>to, iguala from=to.
     */
    public static Lectura[] rango(Lectura[] l, int from, int to) {
        // TODO
        return new Lectura[0];
    }

    public static void main(String[] args) {
        Lectura[] semana = {
                new Lectura("Lun", 24, 12),
                new Lectura("Mar", 28, 14),
                new Lectura("Mié", 21, 10),
                new Lectura("Jue", 30, 17),
                new Lectura("Vie", 27, 15),
                new Lectura("Sab", 23, 12)
        };
        // Demo si quieres probar rápidamente
        listar(semana);
        System.out.println("Buscar 'Mié': " + buscarDia(semana, "mié"));

        System.out.println("Calurosos >=27: " + Arrays.toString(diasCalurosos(semana, 27)));

        System.out.println("Mayor amplitud idx: " + indiceMayorAmplitud(semana));
        System.out.println("Minima temperatura idx: " + indiceMenorMinTemperatura(semana));
        /**
         * System.out.println("Rango [1,4): " + Arrays.toString(rango(semana, 1, 4)));
         **/
    }
}