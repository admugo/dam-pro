package es.educacion.arrays;

/**
 * Clase para localizar la primera posicion que aparece un valor.
 *
 * @author admugo
 * @version 1.0.0
 */
public final class Ejercicio05Buscar {
    private Ejercicio05Buscar() { }

    /**
     * Funcion que devuelve la primera posicion en que aparece un valor de un array.
     *
     * @param numeros int[] conjunto en el cual se busca el objetivo
     * @param objetivo int valor que se busca
     * @return int primer indice o posicion en la que aparece el objetivo o -1 si esta ausente
     * @exception IllegalArgumentException si el array es nulo
     */
    public static int buscar(int[] numeros, int objetivo) {
        if (numeros == null) {
            throw new IllegalArgumentException("El array es nulo");
        }

        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            if (numero == objetivo) {
                return i;
            }
        }

        return -1;
    }
}
