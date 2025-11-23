import java.util.Scanner;

public class jose2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String apellido;

        while (true) {
            System.out.print("Dime tu nombre: ");
            nombre = sc.nextLine();
            if (nombre.length() >= 3) {
                break;
            } else {
                System.out.println("Error introuce almenos 3 letras");
            }

        }

        while (true) {
            System.out.print("Dime el nombre del apellido: ");
            apellido = sc.nextLine();
            if (apellido.length() >= 2) {
                break;
            } else {
                System.out.println("Error introuce almenos 2 letras");
            }
        }
    }
}