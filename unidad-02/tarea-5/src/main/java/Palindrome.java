import java.util.Scanner;

/**
 * @author admugo
 * @version 1.0.0
 */
public class Palindrome {
    /**
     * Programa principal
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la palabra o frase a analizar: ");
        String sFrase = teclado.nextLine();
        boolean bPalindrome = esPalindrome(sFrase);
        System.out.println("La palabra/frase es palindrome = " + bPalindrome);
    }

    /**
     * Funcion que recibe una palabra o frase y verifica si es palindrome
     * @param frase String palabra o frase a verificar
     * @return boolean del resultado
     */
    static boolean esPalindrome(String frase){
        if (frase == null || frase.isEmpty()){
            return false;
        }

        frase = frase.toLowerCase(); // Transforma a minuscula
        frase = frase.replace(" ", ""); // Elimina los espacios

        for (int i = 0; i < frase.length(); i++) {
            char letraIzq = frase.charAt(i);
            char letraDer = frase.charAt(frase.length() - 1 - i);
            if (letraIzq != letraDer){
                return false;
            }
        }

        return true;
    }
}
