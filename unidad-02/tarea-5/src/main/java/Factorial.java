import java.util.Scanner;

/**
 * @author admugo
 * @version 1.0.0
 */
public class Factorial {
    /**
     * Programa principal
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();
        int resultado = calcular(numero);
        System.out.println("Factorial: " + resultado);
    }

    /**
     * Funcion que calcula el factorial de un numero dado
     * @param numero int para el calculo del factorial
     * @return int con el resultado
     */
    static int calcular(int numero) {
        if (numero <= 0) {
            return 1;
        }
        int resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
