import java.util.Scanner;

public class ParImparMultiplo3 {
    public static String esqyere(double numero) {
        boolean numeroPar = (numero % 2 == 0);
        boolean numeroMultiplo = (numero % 3 == 0);
        if (numeroPar && numeroMultiplo) {
            return "Es par y multiplo de 3";

        } else if (!numeroPar && numeroMultiplo) {
            return "Es numero impar y multiplo de 3";

        } else if (numeroPar) {
            return "Es numero par";

        } else {
            return "Es impar";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero:");
        int numero = sc.nextInt();
        String resultado = esqyere(numero);
        System.out.println(resultado);
        sc.close();
    }
}
