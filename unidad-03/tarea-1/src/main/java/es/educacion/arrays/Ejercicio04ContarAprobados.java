package es.educacion.arrays;

/**
 * Clase para contar los aprobados de un array.
 *
 * @author admugo
 * @version 1.0.0
 */
public final class Ejercicio04ContarAprobados {
    private Ejercicio04ContarAprobados() { }

    public static void main(String[] args) {
        int[] notas = {5, 2, 1, 10, 8};
        int[] notas2 = null;
        int aprobados = contarAprobados(notas);
        int suspensos = contarSuspensos(notas2);

        System.out.println("Numero de aprobados = " + aprobados);
        System.out.println("Numero de suspensos = " + suspensos);
    }

    /**
     * Funcion que cuenta la cantidad de notas iguales o superiores a un cinco en un array.
     *
     * @param notas int[] conjunto de notas
     * @return int cantidad de aprobados
     * @exception IllegalArgumentException si el array es nulo
     */
    public static int contarAprobados(int[] notas) {
        if (notas == null){
            throw new IllegalArgumentException("El array es nulo");
        }
        if (notas.length == 0) {
            return 0;
        }

        int aprobados = 0;
        for (int nota : notas) {
            if (nota >= 5) {
                aprobados++;
            }
        }

        return aprobados;
    }

    /**
     * Funcion que cuenta la cantidad de notas inferiores a un cinco en un array.
     *
     * @param notas int[] conjunto de notas
     * @return int cantidad de suspensos
     */
    public static int contarSuspensos(int[] notas){
        return -contarAprobados(notas) + notas.length;
    }
}
