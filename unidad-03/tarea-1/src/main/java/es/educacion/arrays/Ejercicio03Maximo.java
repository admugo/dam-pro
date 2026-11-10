package es.educacion.arrays;

/**
 * Clase para encontrar el valor maximo de un array.
 *
 * @author admugo
 * @version 1.0.0
 */
public final class Ejercicio03Maximo {
    private Ejercicio03Maximo() { }

    public static void main(String[] args) {
        int[] numeros = {8, 7, 13, 2, 10};
        int resultado = maximo(numeros);

        System.out.println("Resultado = " + resultado);
    }

    /**
     * Funcion que obtiene el mayor valor de un array.
     *
     * @param numeros int[] que contiene los numeros
     * @return int el valor maximo del array
     * @exception IllegalArgumentException si el array es nulo o vacio
     */
    public static int maximo(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("El array es nulo o vacio");
        }

        int mayor = numeros[0];
        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
        }

        return mayor;
    }
}