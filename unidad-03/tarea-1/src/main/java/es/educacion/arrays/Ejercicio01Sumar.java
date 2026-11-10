package es.educacion.arrays;

/**
 * Clase para calcular la suma de todos los numeros de un array.
 *
 * @author admugo
 * @version 1.0.0
 */
public final class Ejercicio01Sumar {
    private Ejercicio01Sumar() { }

    public static void main(String[] args) {
        int [] elementos = new int[6]; // |0|0|0|0|0|0|
        elementos[0] = 7;
        elementos[1] = 8;
        elementos[2] = 2;
        elementos[3] = 3;
        elementos[4] = 414;
        elementos[5] = 280;

        int [] numeros = {7,8,2,3,414,280};

        int sumaElementos = sumar(elementos);
        System.out.println("Total = " + sumaElementos);
    }

    /**
     * Funcion que calcula la suma de todos los numeros de un array.
     *
     * @param numeros int[] que contiene los numeros
     * @return int suma total
     * @exception IllegalArgumentException si el array es nulo
     */
    public static int sumar(int[] numeros) {
        if (numeros == null){
            throw new IllegalArgumentException("El array es nulo");
        }
        if (numeros.length == 0) {
            return 0;
        }

        int suma = 0;
        for (int numero:numeros){
            suma += numero;
        }

        return suma;
    }
}
