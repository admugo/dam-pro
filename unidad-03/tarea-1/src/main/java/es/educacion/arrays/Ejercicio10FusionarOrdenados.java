package es.educacion.arrays;

/**
 * Clase para combinar dos arrays ya ordenados en un tercero ordenado ascendentemente.
 *
 * @author admugo
 * @version 1.0.0
 */
public final class Ejercicio10FusionarOrdenados {
    private Ejercicio10FusionarOrdenados() { }

    /**
     * Fusiona dos arrays ordenados ascendentemente en un nuevo array ordenado.
     *
     * @param primerArray int[] primer array ordenado
     * @param segundoArray int[] segundo array ordenado
     * @return int[] nuevo array fusionado y ordenado
     * @exception IllegalArgumentException si alguno de los arrays es nulo
     */
    public static int[] fusionar(int[] primerArray, int[] segundoArray) {
        if (primerArray == null || segundoArray == null) {
            throw new IllegalArgumentException("Uno o mas arrays son nulos");
        }
        if (primerArray.length == 0 && segundoArray.length == 0) {
            return new int[0];
        }

        int[] tercerArray = new int[primerArray.length + segundoArray.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < primerArray.length && j < segundoArray.length) {
            if (primerArray[i] <= segundoArray[j]) {
                tercerArray[k] = primerArray[i++];
            } else {
                tercerArray[k] = segundoArray[j++];
            }
            k++;
        }

        while (i < primerArray.length) {
            tercerArray[k] = primerArray[i++];
            k++;
        }

        while (j < segundoArray.length) {
            tercerArray[k] = segundoArray[j++];
            k++;
        }

        return tercerArray;
    }
}