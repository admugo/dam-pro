package es.dampro.unidad2.tarea6;

/**
 * Clase que suma los digitos de un entero positivo indicado como texto.
 *
 * @author admugo
 * @version 1.0.0
 */
public final class SumaDigitos {

    private SumaDigitos() {
        // Clase de algoritmos estáticos.
    }

    /**
     * Funcion que suma los digitos de un entero positivo indicado como texto.
     * @param numero Dato de entrada que debe cumplir el contrato del enunciado.
     * @return Suma numérica de sus dígitos.
     */
    public static int sumarDigitos(String numero) {
        if (numero == null || numero.isEmpty()){
            throw new IllegalArgumentException("La cadena de texto no puede ser nula");
        }

        int suma = 0;

        for (int i = 0; i < numero.length(); i++) {
            char caracter = numero.charAt(i);
            if (Character.isDigit(caracter)) {
                suma += Integer.parseInt(String.valueOf(caracter));
            }
        }

        return suma;
    }
}
