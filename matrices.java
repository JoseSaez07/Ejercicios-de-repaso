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

public class matrices {

    /**
     * Muestra toda la serie: una lectura por línea usando toString().
     */
    public static void listar(Lectura[] l) {
        for (int i = 0; i < l.length; i++)
            System.out.println(l[i]);

    }

    /**
     * Devuelve el índice del día buscado (coincidencia EXACTA de texto, ignorando
     * mayúsculas).
     * Si no existe, -1.
     */
    public static int buscarDia(Lectura[] m, String dia) {
        for (int i = 0; i < m.length; i++) {
            Lectura valora = m[i];
            if (valora.getDia().equalsIgnoreCase(dia)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Devuelve un NUEVO array con las lecturas cuya temperatura máxima >= umbral.
     * Mantén el orden y no toques el array original.
     */
    public static Lectura[] diasCalurosos(Lectura[] m, int umbralMax) {
        // 1. Contar cuántos días cumplen la condición
        int temperaturas = 0;
        for (int i = 0; i < m.length; i++) {
            Lectura valora = m[i];
            if (valora.getMax() >= umbralMax) {
                temperaturas++;
            }
        }

        // 2. Crear array nuevo del tamaño exacto
        Lectura[] resultado = new Lectura[temperaturas];

        // 3. Rellenarlo manteniendo el orden
        int index = 0;
        for (int i = 0; i < m.length; i++) {
            Lectura valora = m[i];
            if (valora.getMax() >= umbralMax) {
                resultado[index] = valora;
                index++;
            }
        }

        return resultado;
    }

    /**
     * Calcula una “temperatura típica del periodo”:
     * Para cada lectura, saca el punto medio (max+min)/2.0; luego divide la suma
     * entre el nº de días.
     * Si no hay lecturas, devuelve 0.0.
     */
    public static double temperaturaTipicaPeriodo(Lectura[] l) {
        // TODO
        return 0.0;
    }

    /**
     * Devuelve el índice del día con MAYOR amplitud (max - min).
     * En empate, el primero. Si el array está vacío, -1.
     */
    public static int indiceMayorAmplitud(Lectura[] l) {
        // TODO
        return -1;
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
                new Lectura("Vie", 27, 15)
        };
        // Demo si quieres probar rápidamente
        listar(semana);
        System.out.println("Buscar 'Jue': " + buscarDia(semana, "jue"));
        System.out.println("Calurosos >=27: " + Arrays.toString(diasCalurosos(semana, 27)));
        System.out.printf(Locale.US, "Temp. típica: %.1f%n", temperaturaTipicaPeriodo(semana));
        System.out.println("Mayor amplitud idx: " + indiceMayorAmplitud(semana));
        System.out.println("Rango [1,4): " + Arrays.toString(rango(semana, 1, 4)));
    }
}