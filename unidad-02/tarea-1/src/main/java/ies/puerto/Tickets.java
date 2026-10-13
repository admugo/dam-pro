package ies.puerto;

import java.util.Scanner;

/**
 * @author admugo
 * @version 1.0.0
 *
 */
public class Tickets {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int productos = 0;
        float suma = 0;

        System.out.println("==============================");
        System.out.println("        TIENDA DAM-PRO");
        System.out.println("==============================");
        System.out.println(" ");

        System.out.print("Introduce tu nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("¿Cuántos productos vas a comprar? ");
        productos = teclado.nextInt();
        System.out.println(" ");

        for (int i = 1; i <= productos; i++) {
            System.out.println("Producto " + i);
            teclado.nextLine();
            System.out.print("Nombre: ");
            String nombreProducto = teclado.nextLine();
            System.out.print("Precio: ");
            float precioProducto = teclado.nextFloat();
            System.out.println(nombreProducto + " - " + precioProducto + " euros");
            suma += precioProducto;
            System.out.println(" ");
        }

        System.out.println("==============================");
        System.out.println("       TOTAL DEL TICKET");
        System.out.println("==============================");
        System.out.println("Cliente: " + nombre);
        System.out.println("Productos comprados: " + productos);
        System.out.println("TOTAL: " + suma + " euros");
        System.out.println("Gracias por tu compra, " + nombre + ".");

        teclado.close();
    }
}
