package jose.a;

import java.util.Scanner;

public class examenfinal {
public static void main(String[] args) {
int numero;
Scanner sc = new Scanner(System.in);
System.out.print("Introduce un numero: ");
if (numero > 0) {
    System.out.println("El numero es positivo");
} else if(numero == 0){
    System.out.println("El numero es 0");
} else if(numero < 0){
    System.out.println("El numero es negativo");
} else {
    System.out.println("Introduce un numero");
}
}
