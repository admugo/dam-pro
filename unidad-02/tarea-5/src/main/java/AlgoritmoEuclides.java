import java.util.Scanner;

/**
 * @author admugo
 * @version 1.0.0
 */
public class AlgoritmoEuclides {
    /**
     * Programa principal
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        int numero1 = teclado.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int numero2 = teclado.nextInt();
        int resultado = calcularMCD(numero1, numero2);
        System.out.println("MCD: "  + resultado);
    }

    /**
     * Funcion que cacula el MCD de dos numeros
     * @param numero1 int primer numero
     * @param numero2 int segudo numero
     * @return int resultado
     */
    static int calcularMCD(int numero1, int numero2) {
        numero1 = Math.abs(numero1);
        numero2 = Math.abs(numero2);

        while (numero2 != 0) {
            int resto = numero1 % numero2;
            numero1 = numero2;
            numero2 = resto;
        }

        return numero1;
    }

}
