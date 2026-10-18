package ies.puerto;

import java.util.Scanner;

/**
 * @author admugo
 * @version 1.0.0
 */
public class Ahorro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("       SIMULADOR DE AHORRO");
        System.out.println("====================================");
        System.out.println(" ");

        System.out.print("Introduce tu nombre: ");
        String nombre = teclado.nextLine();

        float ahorroInicial = 0f;
        do {
            System.out.print("¿Cuánto dinero tienes ahorrado? ");
            ahorroInicial = teclado.nextFloat();
            if (ahorroInicial < 0) {
                System.out.println("El ahorro inicial no puede ser negativo. Inténtalo de nuevo.");
            }
        } while (ahorroInicial < 0);
        System.out.println(" ");


        System.out.println("Hola, " + nombre + ".");

        int contador = 0;
        float ahorroActual = 0.0f;
        float totalAportado = 0.0f;
        boolean salir = false;

        do {
            float aportacion = 0.0f;
            do {
                System.out.print("Introduce una cantidad para ahorrar: ");
                aportacion = teclado.nextFloat();
                if (aportacion <= 0) {
                    System.out.println("La aportación debe ser mayor que cero. Inténtalo de nuevo.");
                }
            } while (aportacion <= 0);

            totalAportado += aportacion;
            contador++;

            ahorroActual =  ahorroInicial + totalAportado;
            System.out.println("Aportación registrada. Ahorro actual: " + ahorroActual + " euros");
            System.out.println("");

            String respuesta = "";
            do {
                teclado.nextLine();
                System.out.print("¿Deseas realizar otra aportación? (S/N): ");
                respuesta = teclado.nextLine();
            } while (!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N"));

            salir = respuesta.equalsIgnoreCase("N");
        } while (!salir);
        System.out.println(" ");

        System.out.println("====================================");
        System.out.println("         RESUMEN DEL AHORRO");
        System.out.println("====================================");
        System.out.println("Usuario: " + nombre);
        System.out.println("Ahorro inicial: " + ahorroInicial + " euros");
        System.out.println("Aportaciones realizadas: " + contador);
        System.out.println("Total aportado: " + totalAportado + " euros");
        System.out.println("Ahorro final: " + ahorroActual + " euros");

        teclado.close();
    }
}
