package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase para calcular la edad exacta entre dos fechas.
 *
 * @author admugo
 * @version 1.0.0
 */
public final class CalculadoraEdad {
    private CalculadoraEdad() { }

    /**
     * Calcula la edad exacta en anos, meses y dias mediante Period para una fecha de referencia.
     * Si el nacimiento es posterior a dicha fecha, lanza IllegalArgumentException.
     *
     * @param nacimiento LocalDate la fecha de nacimiento
     * @param fechaActual LocalDate la fecha de referencia actual
     * @return Period el periodo de tiempo exacto que representa la edad
     */
    public static Period calcularEdad(LocalDate nacimiento, LocalDate fechaActual) {
        if (nacimiento.isAfter(fechaActual)) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser posterior a la fecha actual.");
        }
        return Period.between(nacimiento, fechaActual);
    }
}