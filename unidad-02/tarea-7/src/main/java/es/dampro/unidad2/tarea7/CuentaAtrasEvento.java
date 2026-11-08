package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase para calcular los dias naturales restantes hasta un evento.
 *
 * @author admugo
 * @version 1.0.0
 */
public final class CuentaAtrasEvento {
    private CuentaAtrasEvento() { }

    /**
     * Calcula dias naturales con signo hasta un evento: positivo si falta,
     * cero si es hoy, o negativo si ya sucedio.
     *
     * @param hoy LocalDate la fecha actual de referencia
     * @param evento LocalDate la fecha en la que ocurre el evento
     * @return long el numero de dias restantes con su signo correspondiente
     */
    public static long calcularDiasRestantes(LocalDate hoy, LocalDate evento) {
        return ChronoUnit.DAYS.between(hoy, evento);
    }
}