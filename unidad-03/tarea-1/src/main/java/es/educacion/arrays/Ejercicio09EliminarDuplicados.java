package es.educacion.arrays;

import java.util.Arrays;

/**
 * Clase para eliminar los elementos duplicados de un array preservando el orden.
 *
 * @author admugo
 * @version 1.0.0
 */
public final class Ejercicio09EliminarDuplicados {
    private Ejercicio09EliminarDuplicados() { }

    /**
     * Funcion que elimina los elementos repetidos de un array preservando la primera aparicion.
     *
     * @param numeros int[] array original
     * @return int[] nuevo array sin duplicados
     * @exception IllegalArgumentException si el array es nulo
     */
    public static int[] sinDuplicados(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("El array es nulo");
        }

        int[] unicos = new int[numeros.length];
        int contadorUnicos = 0;

        for (int numero : numeros) {
            boolean esDuplicado = false;
            for (int i = 0; i < contadorUnicos; i++) {
                if (unicos[i] == numero) {
                    esDuplicado = true;
                    break;
                }
            }
            if (!esDuplicado) {
                unicos[contadorUnicos] = numero;
                contadorUnicos++;
            }
        }

        return Arrays.copyOf(unicos, contadorUnicos);
    }
}