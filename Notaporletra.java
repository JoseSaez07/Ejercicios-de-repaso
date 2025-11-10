import java.util.Scanner;

public class Notaporletra {
    public String notaLetra(String nota) {
        return switch (nota.toUpperCase()) {
            case "A" -> "Sobresaliente";
            case "B" -> "Notable";
            case "C" -> "Bien";
            case "D" -> "Suficiente";
            case "F" -> "Insuficiente";
            default -> "Letra inválida";
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Notaporletra producto = new Notaporletra();
        System.out.print("Dime una letra: ");
        String nota = sc.nextLine();
        String resultado = producto.notaLetra(nota);
        System.out.println(resultado);
        sc.close();
    }
}
