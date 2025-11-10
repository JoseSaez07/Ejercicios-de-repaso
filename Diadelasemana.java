import java.util.Scanner;

public class Diadelasemana {
    public String diaSemana(int numero) {
        if (numero == 1) {
            return "Lunes";
        } else if (numero == 2) {
            return "Martes";
        } else if (numero == 3) {
            return "Miercoles";
        } else if (numero == 4) {
            return "Jueves";
        } else if (numero == 5) {
            return "Viernes";
        } else if (numero == 6) {
            return "Sabado";
        } else if (numero == 7) {
            return "Domingo";
        } else {
            return "Numero invalido";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Diadelasemana producto = new Diadelasemana();
        System.out.print("Dime un numero ");
        int numeroValor = sc.nextInt();
        String resultado = producto.diaSemana(numeroValor);
        System.out.println(resultado);
        sc.close();
    }
}
