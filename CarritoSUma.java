import java.util.Scanner;

public class CarritoSUma {

    static class Producto {
        private final String nombre;
        private final double precio;

        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }

        @Override
        public String toString() {
            return String.format("%s - %.2f €", nombre, precio);
        }
    }

    public static double totalCarrito(Producto[] carrito) {
        double total = 0.0;
        for (Producto t : carrito) {
            total += t.getPrecio();
        }
        return total;
    }

    public static void main(String[] args) {
        // Carrito fijo
        Producto[] carrito = {
                new Producto("Teclado", 24.99),
                new Producto("Ratón", 15.50),
                new Producto("Auriculares", 39.90)
        };

        // Calculamos total
        double total = totalCarrito(carrito);

        // Mostramos total por pantalla
        System.out.printf("Total del carrito: %.2f €\n", total);
    }
}
