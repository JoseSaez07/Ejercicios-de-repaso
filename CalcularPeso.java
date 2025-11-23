import java.util.Scanner;

public class CalcularPeso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso;
        Double altura;
        System.out.print("Introduce tu peso (KG): ");
        peso = sc.nextDouble();
        System.out.print("Introduce tu altura en (M): ");
        altura = sc.nextDouble();
        sc.close();
        double imc = peso / (altura * altura);
        System.out.printf("Tu imc es %.2f", imc);
        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc <= 25 && imc >= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30) {
            System.out.println("Obesidad");
        }
    }

}
