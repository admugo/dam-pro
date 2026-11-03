package es.dampro.unidad2.tarea6;

/**
 * Clase que invierte todos los caracteres, conservando espacios y mayusculas.
 *
 * @author admugo
 * @version 1.0.0
 */
public final class InvertirCadena {

    private InvertirCadena() {
        // Clase de algoritmos estáticos.
    }

    /**
     * Funcion que invierte todos los caracteres, conservando espacios y mayusculas.
     * @param texto Dato de entrada que debe cumplir el contrato del enunciado.
     * @return Cadena invertida, conservando espacios y mayúsculas.
     */
    public static String invertir(String texto) {
        StringBuilder resultado = new StringBuilder();
        if (texto == null || texto.isEmpty()) {
            throw new IllegalArgumentException("La cadena de texto no puede ser nula");
        }
        for (int i = texto.length() - 1; i >= 0; i--) {
            char caracter = texto.charAt(i);
            resultado.append(caracter);
        }
        return resultado.toString();
    }
}
