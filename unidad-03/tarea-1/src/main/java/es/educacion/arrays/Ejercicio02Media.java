package es.educacion.arrays;

/**
 * Clase para calcular la media aritmetica de un array.
 *
 * @author admugo
 * @version 1.0.0
 */
public final class Ejercicio02Media {
    private Ejercicio02Media() { }

    public static void main(String[] args) {
        int [] notas = {8,7,3,2,10};
        double resultado = media(notas);

        System.out.println("Resultado = " + resultado);
    }

    /**
     * Funcion que calcula la media aritmetica con decimales de un array.
     *
     * @param notas int[] que contiene las notas
     * @return double la media aritmetica del array
     * @exception IllegalArgumentException si el array es nulo o vacio
     */
    public static double media(int[] notas) {
        if (notas == null || notas.length == 0){
            throw new IllegalArgumentException("El array es nulo o vacio");
        }

        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }

        return suma / notas.length;
    }
}
