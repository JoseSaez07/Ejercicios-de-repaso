import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = 0;
        do {
            System.out.println("--MENÚ--");
            System.out.println("1.Hola");
            System.out.println("2.Hora");
            System.out.println("3. Salir");

            try {
                valor = sc.nextInt();
                switch (valor) {
                    case 1 -> System.out.println("Hola " + valor);
                    case 2 -> {
                        String hora = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                        System.out.println(hora);
                    }
                    case 3 -> System.out.println("Adiós");
                    default -> System.out.println("Opción no valida");
                }

            } catch (Exception e) {
                System.out.println("⚠️ Error: introduce un número válido.");
                sc.nextLine();
            }

        } while (valor != 3);

        sc.close();
    }
}