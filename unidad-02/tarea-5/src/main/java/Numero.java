import java.util.Scanner;

/**
 * @author admugo
 * @version 1.0.0
 */
public class Numero {
    /**
     * Programa principal
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        int numero1 = teclado.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int numero2 = teclado.nextInt();

        boolean iguales = igual(numero1, numero2);
        int mayor = mayor(numero1, numero2);
        int menor = menor(numero1, numero2);
        System.out.println("Son iguales: " + iguales);
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }

    /**
     * Funcion que devuelve el numero mayor entre dos numeros
     * @param numero1 int primer numero
     * @param numero2 int segundo numero
     * @return int numero mayor
     */
    static int mayor(int numero1, int numero2) {
        if (numero1 > numero2){
            return numero1;
        }
        return numero2;
    }

    /**
     * Funcion que devuelve el numero menor entre dos numeros
     * @param numero1 int primer numero
     * @param numero2 int segundo numero
     * @return int numero menor
     */
    static int menor(int numero1, int numero2) {
        if (numero1 < numero2){
            return numero1;
        }
        return numero2;
    }


    /**
     * Funcion que devuelve si dos numeros son iguales
     * @param numero1 int primer numero
     * @param numero2 int segundo numero
     * @return boolean resultado
     */
    static boolean igual(int numero1, int numero2) {
        if (numero1 == numero2){
            return true;
        }
        return false;
    }
}
