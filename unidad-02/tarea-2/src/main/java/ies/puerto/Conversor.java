package ies.puerto;

import java.util.Scanner;

/**
 * @author admugo
 * @version 1.0.0
 */
public class Conversor {
    public static void main(String[] args) {
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

            System.out.println("1. Kilómetros a metros");
            System.out.println("2. Metros a centímetros");
            System.out.println("3. Kilómetros a millas");
            System.out.println("4. Salir");
            System.out.println(" ");

            System.out.print("Selecciona una opción: ");
            opcion = teclado.nextInt();

            float distancia = 0;
            float resultado = 0;

            switch (opcion) {
                case 1:
                    System.out.print("Introduce los kilómetros: ");
                    distancia = teclado.nextFloat();
                    while (distancia < 0) {
                        System.out.println("Error: La distancia no puede ser negativa.");
                        System.out.print("Introduce un valor igual o mayor a cero: ");
                        distancia = teclado.nextFloat();
                    }
                    resultado = distancia * 1000;
                    System.out.println("Resultado: " + resultado + " metros");
                    break;
                case 2:
                    System.out.print("Introduce los metros: ");
                    distancia = teclado.nextFloat();
                    while (distancia < 0) {
                        System.out.println("Error: La distancia no puede ser negativa.");
                        System.out.print("Introduce un valor igual o mayor a cero: ");
                        distancia = teclado.nextFloat();
                    }
                    resultado = distancia * 100;
                    System.out.println("Resultado: " + resultado + " centímetros");
                    break;
                case 3:
                    System.out.print("Introduce los kilómetros: ");
                    distancia = teclado.nextFloat();
                    while (distancia < 0) {
                        System.out.println("Error: La distancia no puede ser negativa.");
                        System.out.print("Introduce un valor igual o mayor a cero: ");
                        distancia = teclado.nextFloat();
                    }
                    resultado = distancia * 0.621371f;
                    System.out.println("Resultado: " + resultado + " millas");
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no valida.");
                    break;
            }

            if (opcion >= 1 && opcion <= 3) {
                contador++;
                System.out.println("Conversión realizada correctamente.");
            }
            System.out.println(" ");
        }

        System.out.println("====================================");
        System.out.println("Usuario: " + nombre);
        System.out.println("Conversiones realizadas: " + contador);
        System.out.println("Gracias por utilizar DAM-PRO.");
        System.out.println("====================================");

        teclado.close();
    }
}
