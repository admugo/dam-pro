package es.dampro.unidad2.tarea6;

/**
 * Clase que comprueba si se lee igual de ambos lados; ignora espacios y mayusculas, no signos ni tildes; texto vacio no es palindromo.
 *
 * @author admugo
 * @version 1.0.0
 */
public final class Palindromo {

    private Palindromo() {
        // Clase de algoritmos estáticos.
    }

    /**
     * Funcion que comprueba si se lee igual de ambos lados; ignora espacios y mayusculas, no signos ni tildes; texto vacio no es palindromo.
     * @param texto Dato de entrada que debe cumplir el contrato del enunciado.
     * @return Resultado de la comprobación sin distinguir mayúsculas ni espacios.
     */
    public static boolean esPalindromo(String texto) {
        if (texto == null || texto.isEmpty()){
            throw new IllegalArgumentException("La cadena de texto no puede ser nula");
        }

        texto = texto.toLowerCase();
        texto = texto.replace(" ", "");

        for (int i = 0; i < texto.length(); i++) {
            char letraIzq = texto.charAt(i);
            char letraDer = texto.charAt(texto.length() - 1 - i);
            if (letraIzq != letraDer){
                return false;
            }
        }

        return true;
    }
}
