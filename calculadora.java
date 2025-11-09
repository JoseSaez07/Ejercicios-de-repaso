
import java.util.Scanner;

public class calculadora {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Dime el primer número");
    int numeroA = sc.nextInt();
    System.out.println("Dime el segundo número");
    int numeroB = sc.nextInt();
    int suma = numeroA + numeroB;
    int resta = numeroA - numeroB;
    int multiplicacion = numeroA * numeroB;
    int division = numeroA / numeroB;
    int modulo = numeroA % numeroB;
    double divisionDecimal = numeroA / numeroB;
    System.out.println("El resultado de la suma e " + suma);
    System.out.println("El resultado de laresta es " + resta);
    System.out.println("El resultado de la multiplicacion es " + multiplicacion);
    System.out.println("El resultado de la division es " + division);
    System.out.println("El resultado del modulo es " + modulo);
    System.out.println("El resultado de la division decimal es " + divisionDecimal);
  }
}
