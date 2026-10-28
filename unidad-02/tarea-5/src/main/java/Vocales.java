import java.util.Locale;
import java.util.Scanner;

/**
 * @author admugo
 * @version 1.0.0
 */
public class Vocales {
    /**
     * Programa principal
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la cadena de texto: ");
        String cadena = teclado.nextLine();
        int resultado = contarVocales(cadena);
        System.out.println("El numero de vocales es: " + resultado);
    }

    static int contarVocales(String cadena){
        if (cadena == null || cadena.isEmpty()) {
            return 0;
        }

        int resultado = 0;

        cadena = cadena.toLowerCase();

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' ||
                    caracter == 'o' || caracter == 'u' ) {
                resultado++;
            }
        }

        return resultado;
    }

    static int contarVocales2(String cadena){
        if (cadena == null || cadena.isEmpty()) {
            return 0;
        }

        int resultado = 0;

        cadena = cadena.toLowerCase();

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            switch (caracter) {
                case 'a', 'e', 'i', 'o', 'u', 'á', 'é', 'í', 'ó', 'ú':
                    resultado = resultado+1;
            }
        }

        return resultado;
    }

}
