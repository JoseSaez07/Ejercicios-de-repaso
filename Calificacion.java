import java.util.Scanner;

public class Calificacion {
    public String obtenerCalificacion(double valor) {
        if (valor >= 0 && valor <= 4) {
            return "Insuficiente";
        } else if (valor == 5) {
            return "Aprobado";
        } else if (valor == 6) {
            return "Bien";
        } else if (valor >= 7 && valor <= 8) {
            return "Notable";
        } else if (valor >= 9 && valor <= 10.0) {
            return "Sobresaliente";
        } else {
            return "Nota Invalida";
        }
    }

    public String obtenerCalificacionSwich(int valor) {
        return switch (valor) {
            case 0, 1, 2, 3, 4 -> "Insuficiente";
            case 5 -> "Aprobado";
            case 6 -> "Bien";
            case 7, 8 -> "Notable";
            case 9, 10 -> "Sobresaliente";
            default -> "Nota invalida";
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calificacion programa = new Calificacion();
        System.out.println("Parte 1");
        System.out.print("Que nota has sacado: ");
        double nota = sc.nextDouble();
        String resultado = programa.obtenerCalificacion(nota);
        System.out.println(resultado);
        System.out.println("Parte 2");
        System.out.println("Que nota as sacado");
        int notaa = sc.nextInt();
        String notaA = programa.obtenerCalificacionSwich(notaa);
        System.out.println(notaA);
        sc.close();

    }
}
