package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase para validar e interpretar cadenas de texto como fechas bajo un estilo estricto.
 *
 * @author admugo
 * @version 1.0.0
 */
public final class ValidadorFechas {
    private ValidadorFechas() { }

    /**
     * Interpreta estrictamente un texto con formato dd/MM/uuuu usando ResolverStyle.STRICT.
     * Si la fecha es imposible o el formato de entrada es incorrecto, lanza DateTimeParseException.
     *
     * @param texto String la cadena de texto con la fecha que se desea validar
     * @return LocalDate la fecha analizada y validada correctamente
     */
    public static LocalDate validarFecha(String texto) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
        return LocalDate.parse(texto, formato);
    }
}