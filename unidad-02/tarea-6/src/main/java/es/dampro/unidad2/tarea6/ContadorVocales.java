package es.dampro.unidad2.tarea6;

/**
 * Clase que cuenta a, e, i, o, u, vocales con tilde y ü, en ambas cajas; ignora el resto.
 *
 * @author admugo
 * @version 1.0.0
 */
public final class ContadorVocales {
    private ContadorVocales() { }

    /**
     * Funcion que cuenta a, e, i, o, u, vocales con tilde y ü, en ambas cajas; ignora el resto.
     * @param texto Dato de entrada que debe cumplir el contrato del enunciado.
     * @return Numero entero que contiene el recuento total de las vocales.
     */
    public static int contarVocales(String texto) {
        if (texto == null || texto.isEmpty()) {
            throw new IllegalArgumentException("La cadena de texto no puede ser nula");
        }

        int resultado = 0;

        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            switch (caracter) {
                case 'a', 'e', 'i', 'o', 'u',
                     'á', 'é', 'í', 'ó', 'ú',
                     'ü':
                    resultado++;
                    break;
                default:
                    break;
            }
        }

        return resultado;
    }
}
