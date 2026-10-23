package ies.puerto.es;

import java.util.Scanner;

/**
 * @author admugo
 * @version 1.0.0
 */
public class AnalizadorContrasena {

    /**
     * Programa principal
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca la cadena: ");
        String sCadena = teclado.nextLine();
        String resultado = generarInforme(sCadena);
        System.out.println(resultado);
    }

    /**
     * Funcion que cuenta el numero de mayusculas de una cadena
     * @param sCadena String cadena de texto
     * @return int numero de mayusculas
     */
    static int contarMayuscula(String sCadena){
        int numero = 0;
        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);
            if (Character.isAlphabetic(caracter) && Character.isUpperCase(caracter)){
                numero++;
            }
        }
        return numero;
    }

    /**
     * Funcion que cuenta el numero de minusculas de una cadena
     * @param sCadena String cadena de texto
     * @return int numero de minusculas
     */
    static int contarMinusculas(String sCadena){
        int numero = 0;
        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);
            if (Character.isAlphabetic(caracter) && Character.isLowerCase(caracter)){
                numero++;
            }
        }
        return numero;
    }


    /**
     * Funcion que cuenta el numero de digitos de una cadena
     * @param sCadena String cadena de texto
     * @return int numero de digitos
     */
    static int contarDigitos(String sCadena){
        int numero = 0;
        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);
            if (Character.isDigit(caracter)){
                numero++;
            }
        }
        return numero;
    }

    /**
     * Funcion que cuenta el numero de simbolos de una cadena
     * @param sCadena String cadena de texto
     * @return int numero de simbolos
     */
    static int contarSimbolos(String sCadena){
        int numero = 0;
        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);
            if (!Character.isLetterOrDigit(caracter)){
                numero++;
            }
        }
        return numero;
    }

    /**
     * Funcion que comprueba el requisito de longitud
     * @param sCadena String cadena de texto
     * @return boolean respuesta
     */
    static boolean tieneLongitudMinima(String sCadena){
        if (sCadena.length() < 8){
            return false;
        }
        return true;
    }

    /**
     * Funcion que comprueba todos los requisitos
     * @param sCadena String cadena de texto
     * @return boolean respuesta
     */
    static boolean esContrasenaValida(String sCadena){
        if (!tieneLongitudMinima(sCadena)){
            return false;
        }
        if (contarMayuscula(sCadena) < 1){
            return false;
        }
        if (contarMinusculas(sCadena) < 1){
            return false;
        }
        if (contarDigitos(sCadena) < 1){
            return false;
        }
        return true;
    }


    /**
     * Funcion que genera un informe de texto con la longitud, los cuatro contadores y el resultado de la validación
     * @param sCadena String cadena de texto
     * @return String informe
     */
    static String generarInforme (String sCadena){
        String informe = "Digitos: " + contarDigitos(sCadena)
                + "\nResultado: " + esContrasenaValida(sCadena);

        return informe;
    }
}
