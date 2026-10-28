import java.util.Scanner;

/**
 * @author admugo
 * @version 1.0.0
 */
public class PalabraInversa {
    /**
     * Programa principal
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String sPalabra = teclado.nextLine();
        String sInvertida = reverse(sPalabra);
        System.out.println("Palabra invertida: " + sInvertida);
    }

    /**
     * Funcion que crea una palabra o texto invertida a la original
     * @param palabra String cadena de texto original
     * @return String cadena invertida
     */
    static String reverse(String palabra) {
        StringBuilder resultado = new StringBuilder();
        if (palabra == null || palabra.isEmpty()) {
            return resultado.toString();
        }
        for (int i = palabra.length() - 1; i >= 0; i--) {
            char caracter = palabra.charAt(i);
            resultado.append(caracter);
        }
        return resultado.toString();
    }

    static String reverse2(String palabra) {
        StringBuilder resultado = new StringBuilder(palabra);
        return resultado.reverse().toString();
    }
}
