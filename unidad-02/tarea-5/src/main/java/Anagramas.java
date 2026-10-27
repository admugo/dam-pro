import java.util.Scanner;

/**
 * @author admugo
 * @version 1.0.0
 */
public class Anagramas {
    /**
     * Programa principal
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la primera palabra: ");
        String sPalabra1 = teclado.nextLine();
        System.out.print("Introduce la segunda palabra: ");
        String sPalabra2 = teclado.nextLine();
        boolean bAnagrama = esAnagrama(sPalabra1, sPalabra2);
        System.out.println("Las palabras son anagrama = " + bAnagrama);
    }

    /**
     * Funcion que verifica si dos palabras son anagramas
     * @param sPalabra1 String primera palabra
     * @param sPalabra2 String segunda palabra
     * @return boolean del resultado
     */
    static boolean esAnagrama(String sPalabra1, String sPalabra2){
        if (sPalabra1 == null || sPalabra1.isEmpty()){
            return false;
        }
        if (sPalabra2 == null || sPalabra2.isEmpty()){
            return false;
        }

        sPalabra1 = sPalabra1.toLowerCase();
        sPalabra2 = sPalabra2.toLowerCase();
        sPalabra1 = sPalabra1.replace(" ", "");
        sPalabra2 = sPalabra2.replace(" ", "");

        if (sPalabra1.length() != sPalabra2.length()){
            return false;
        }

        for (int i = 0; i < sPalabra1.length(); i++) {
            char letraPalabra1 = sPalabra1.charAt(i);
            char letraPalabra2 = sPalabra2.charAt(sPalabra1.length() - 1 - i);

            if (letraPalabra1 != letraPalabra2){
                return false;
            }
        }

        return true;
    }
}
