import java.util.Scanner;

/**
 * @author admugo
 * @version 1.0.0
 */
public class ClaveSecreta {
    /**
     * Programa principal
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String sPalabra = teclado.nextLine();
        String sClave = generarClaveSegura(sPalabra);
        System.out.println("Tu clave es: " + sClave);
    }

    /**
     * Funcion que genera una clave a partir de una cadena de texto
     * @param sPalabra String que recibe
     * @return String clave
     */
    static String generarClaveSegura(String sPalabra){
        if (sPalabra == null || sPalabra.isEmpty()){
            return "";
        }
        String sClave = "";

        sPalabra.replace("a|A", "?");
        sPalabra.replace("e|E", "=");
        sPalabra.replace("i|I", ")");
        sPalabra.replace("o|O", "(");
        sPalabra.replace("u|U", "/");

        sClave = sPalabra;

        return sClave;
    }
}
