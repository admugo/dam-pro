package ies.puerto.es;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author admugo
 * @version 1.0.0
 */
public class GestorCalificaciones {
    /**
     * Programa principal
     */
    static void main() {
        List<Double> notas = new ArrayList<>();
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);
        do {
            Double nota = solicitarNotaValida();
            notas.add(nota);
            System.out.print("Deseas continuar (true/false): ");
            String sSalir = teclado.nextLine();
            salir = Boolean.parseBoolean(sSalir);
        } while (salir);

        System.out.println("Lista de notas: " + notas);
        double media = calcularMedia(notas);
        System.out.println("La nota media es: " + media);
        double minimo = obtenerMinima(notas);
        System.out.println("El valor minimo es: " + minimo);
        double maximo = obtenerMaxima(notas);
        System.out.println("El valor maximo es: " + maximo);
    }

    /**
     * Funcion que transforma una cadena en numero entero (int)
     * @param sNumero String cadena de texto
     * @return int numero entero
     */
    static int convertirNumeroNotas(String sNumero){
        if (sNumero == null || sNumero.isEmpty()){
            return 0;
        }
        return Integer.parseInt(sNumero);
    }

    /**
     * Funcion que transforma una cadena en numero decimal (double)
     * @param sNumero String cadena de texto
     * @return double numero entero
     */
    static double convertirNota(String sNumero){
        if (sNumero == null || sNumero.isEmpty()){
            return 0;
        }
        return Double.parseDouble(sNumero);
    }

    /**
     * Funcion que comprueba si una nota esta dentro del intervalo permitido
     * @param dNumero Double nota
     * @return boolean resultado
     */
    static boolean esNotaValida(Double dNumero){
        if (dNumero == null){
            return false;
        }
        if (dNumero < 0 || dNumero > 10){
            return false;
        }
        return true;
    }

    /**
     * Funcion que se encarga de solicitar una nota valida
     * @return Double la nota validada
     */
    static Double solicitarNotaValida(){
        Scanner teclado = new Scanner(System.in);
        Double dNumero = null;
        boolean bValida = false;
        do {
            System.out.print("Introduce una nota: ");
            String sNota = teclado.nextLine();

            try {
                dNumero = convertirNota(sNota);

            } catch (NumberFormatException e) {
                throw new RuntimeException("El numero insertado es incorrecto");
            }

            bValida = esNotaValida(dNumero);
        } while (!bValida);


        return dNumero;
    }

    /**
     * Funcion que calcula el promedio de las notas en una lista
     * @param dNotas List<Double> que contiene las notas
     * @return double promedio
     */
    static double calcularMedia (List<Double> dNotas){
        double suma = 0;
        for (int i = 0; i < dNotas.size(); i++) {
            suma += dNotas.get(i);
        }

        double media = suma / dNotas.size();

        return media;
    }

    /**
     * Funcion maximo
     * @param lNotas
     * @return
     */
    static double obtenerMaxima(List<Double> lNotas){
        double maximo = lNotas.get(0);
        for (int i = 1; i < lNotas.size(); i++) {
            if (maximo == 10) {
                return maximo;
            }
            if (lNotas.get(i) > maximo) {
                maximo = lNotas.get(i);
            }
        }
        return maximo;
    }

    /**
     * Funcion minimo
     * @param lNotas
     * @return
     */
    static double obtenerMinima(List<Double> lNotas){
        double minimo = lNotas.get(0);
        for (int i = 1; i < lNotas.size(); i++) {
            if (minimo == 0) {
                return minimo;
            }
            if (lNotas.get(i) < minimo) {
                minimo = lNotas.get(i);
            }
        }
        return minimo;
    }
}
