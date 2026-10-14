package ies.puerto;

import java.util.Scanner;

/**
 * @author admugo
 * @version 1.0.0
 */
public class Conversor {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        boolean salir = false;
        int contador = 0;

        System.out.println("==============================");
        System.out.println("       CONVERSOR DAM-PRO");
        System.out.println("==============================");
        System.out.println(" ");

        System.out.print("Introduce tu nombre: ");
        String nombre = teclado.nextLine();
        System.out.println(" ");

        System.out.println("Bienvenido/a, " + nombre +".");
        System.out.println(" ");

        while (!salir) {
            float resultado = 0;

            System.out.println("1. Kilómetros a metros");
            System.out.println("2. Metros a centímetros");
            System.out.println("3. Kilómetros a millas");
            System.out.println("4. Salir");

            System.out.print("Selecciona una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    //km a m
                    break;
                case 2:
                    // m a cm
                    break;
                case 3:
                    // km a millas
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no valida.");
                    break;
            }
            System.out.println("Conversión realizada correctamente.");
            System.out.println(" ");

            contador++;
        }

        System.out.println("====================================");
        System.out.println("Usuario: " + nombre);
        System.out.println("Conversiones realizadas: " + contador);
        System.out.println("Gracias por utilizar DAM-PRO.");
        System.out.println("====================================");

        teclado.close();
    }
}
