package es.educacion.arrays;

import java.util.Arrays;

/**
 * Clase para ordenar los elementos de un array en uno nuevo de forma ascendente.
 *
 * @author admugo
 * @version 1.0.0
 */
public final class Ejercicio07Ordenar {
    private Ejercicio07Ordenar() { }

    /**
     * Funcion que devuelve un nuevo array ordenado de mayor a menor.
     *
     * @param numeros int[] el array que se quiere ordenar
     * @return int[] una copia del array ordenado ascendentemente
     * @exception IllegalArgumentException si el array es nulo
     */
    public static int[] ordenar(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("El array es nulo");
        }

        int[] ordenado = Arrays.copyOf(numeros, numeros.length);
        Arrays.sort(ordenado);

        return ordenado;
    }
}