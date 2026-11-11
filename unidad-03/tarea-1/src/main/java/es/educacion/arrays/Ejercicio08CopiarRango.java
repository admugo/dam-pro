package es.educacion.arrays;

import java.util.Arrays;

/**
 * Clase para extraer un intervalo de posiciones de un array.
 *
 * @author admugo
 * @version 1.0.0
 */
public final class Ejercicio08CopiarRango {
    private Ejercicio08CopiarRango() { }

    /**
     * Funcion que devuelve una copia de un array desde una posicion inicial hasta una final.
     *
     * @param numeros int[] array original del que se extrae el rango
     * @param inicio int posicion inicial
     * @param fin int posicion final
     * @return int[] nuevo array con el rango copiado
     * @exception IllegalArgumentException si el intervalo es invalido o el array es nulo
     */
    public static int[] copiarRango(int[] numeros, int inicio, int fin) {
        if (numeros == null || inicio < 0 || fin < inicio || fin > numeros.length) {
            throw new IllegalArgumentException("El intervalo es invalido o el array nulo");
        }

        return Arrays.copyOfRange(numeros, inicio, fin);
    }
}