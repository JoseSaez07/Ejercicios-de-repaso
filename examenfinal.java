
import java.util.Scanner;

public class examenfinal {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        numero = sc.nextInt();
        sc.close();
        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else if (numero == 0) {
            System.out.println("El numero es 0");
        } else {
            System.out.println("El numero es negativo");
        }
    }
}
