import java.util.Scanner;

public class Semaforo {

    public String accionSemaforoIf(String color) {
        if (color.equalsIgnoreCase("Rojo")) {
            return "Para";
        } else if (color.equalsIgnoreCase("Amarillo")) {
            return "Cuidao";
        } else if (color.equalsIgnoreCase("Verde")) {
            return "Pasa";
        } else {
            return "Invalido";
        }
    }

    public String accionSemaforoSwitch(String color) {
        return switch (color) {
            case "Rojo" -> "Para";
            case "Amarillo" -> "Cuidao";
            case "Verde" -> "Pasa";
            default -> "Invalido";
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Semaforo semaforo = new Semaforo();
        System.out.print("El color del semaforo es: ");
        String color = sc.nextLine();
        System.out.println("Ejercicio 1");
        String resto = semaforo.accionSemaforoIf(color);
        System.out.println(resto);
        System.out.println("Ejercicio 2");
        String restoSwitch = semaforo.accionSemaforoSwitch(color);
        System.out.println(restoSwitch);
        sc.close();

        // Pedir color al usuario usando Scanner
        // Llamar a método accionSemaforoIf
        // Mostrar por pantalla (System.out) el resultado
        // Llamar a método accionSemaforoSwitch
        // Mostrar por pantalla (System.out) el resultado

    }
}