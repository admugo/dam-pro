package es.educacion.arrays;

/**
 * Clase para obtener la secuencia de un array en orden inverso.
 *
 * @author admugo
 * @version 1.0.0
 */
public final class Ejercicio06Invertir {
    private Ejercicio06Invertir() { }

    /**
     * Funcion que devuelve un nuevo array en orden inverso.
     *
     * @param numeros int[] que se quiere invertir
     * @return int[] array invertido
     * @exception IllegalArgumentException si el array es nulo
     */
    public static int[] invertir(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("El array es nulo");
        }

        int[] invertido = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            invertido[i] = numeros[numeros.length - 1 - i];
        }

        return invertido;
    }
}