package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase para calcular la fecha del proximo cumpleanios a partir de una fecha de nacimiento y una fecha actual.
 *
 * @author admugo
 * @version 1.0.0
 */
public final class ProximoCumpleanios {
    private ProximoCumpleanios() { }

    /**
     * Calcula la fecha en la que ocurrira el proximo cumpleanios.
     * Si la fecha de nacimiento es posterior a la fecha actual, lanza IllegalArgumentException.
     *
     * @param nacimiento LocalDate la fecha de nacimiento de la persona
     * @param hoy LocalDate la fecha actual de referencia
     * @return LocalDate la fecha exacta del proximo cumpleanios
     */
    public static LocalDate calcularProximoCumpleanios(LocalDate nacimiento, LocalDate hoy) {
        if (nacimiento.isAfter(hoy)) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser posterior a la fecha actual.");
        }
        LocalDate proximo = nacimiento.withYear(hoy.getYear());
        if (proximo.isBefore(hoy)) {
            proximo = nacimiento.withYear(hoy.getYear() + 1);
        }
        return proximo;
    }
}