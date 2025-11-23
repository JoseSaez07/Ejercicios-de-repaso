import java.util.Scanner;

public class jose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime tu edad actual: ");
        int edadActual = sc.nextInt();

        System.out.print("Dime tu edad de jubilacion: ");
        int edadJubilacion = sc.nextInt();
        sc.close();

        if (edadJubilacion < edadActual) {
            System.out.println("Error tu edad de jubilacion debe de ser mayor a tu edad actual.");
            return;
        }

        int jubilacion = edadJubilacion - edadActual;
        System.out.println("Te quedan " + jubilacion + " años para tu jubilacion.");
        if (edadActual >= edadJubilacion) {
            System.out.println("Ya has alcanzado la edad de jubilación");
        } else {
            System.out.println("Sigue esperando para la jubilación");
        }
    }
}
