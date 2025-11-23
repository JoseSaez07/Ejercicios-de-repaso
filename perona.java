import java.util.Scanner;

public class perona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String apellido;
        int numeroSuerte;
        String contraseña;
        while (true) {
            System.out.print("Dime tu nombre: ");
            nombre = sc.nextLine();
            if (nombre.length() >= 3) {
                break;
            } else {
                System.out.println("Introduce al menos 3 caracteres");
            }
        }
        while (true) {
            System.out.print("Dime tu apellido: ");
            apellido = sc.nextLine();
            if (apellido.length() >= 2) {
                break;
            } else {
                System.out.println("Introduce al menos 2 caracteres");
            }
        }
        System.out.print("Dime tu numero de la suerte: ");
        numeroSuerte = sc.nextInt();
        contraseña = nombre.substring(0, 3) + numeroSuerte + apellido.substring(apellido.length() - 2);
        System.out.println("Tu contraseña es " + contraseña);

    }
}
