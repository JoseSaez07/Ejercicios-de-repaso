import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        int numero = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("--MENÚ--");
            System.out.println("1.Hola");
            System.out.println("2.Hora");
            System.out.println("3.Adiós");
            try {
                numero = sc.nextInt();
                switch (numero) {
                    case 1 -> System.out.println("Hola");
                    case 2 -> {
                        String hora = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                        System.out.println(hora);
                    }
                    case 3 -> System.out.println("Gracias por usarme");
                }
            } catch (InputMismatchException e) {
                System.out.println("Opcion invalida");
                sc.nextLine();
            }
        } while (numero != 3);
        sc.close();

    }
}
