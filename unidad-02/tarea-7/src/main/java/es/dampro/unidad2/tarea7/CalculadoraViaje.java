package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase para calcular la fecha y hora de llegada de un viaje sumando una duracion.
 *
 * @author admugo
 * @version 1.0.0
 */
public final class CalculadoraViaje {
    private CalculadoraViaje() { }

    /**
     * Suma una duracion no negativa en horas y minutos a una fecha y hora de salida.
     * Si alguna cantidad de horas o minutos es negativa, lanza IllegalArgumentException.
     *
     * @param salida LocalDateTime la fecha y hora de salida
     * @param horas long el numero de horas de duracion del viaje
     * @param minutos long el numero de minutos de duracion del viaje
     * @return LocalDateTime la fecha y hora de llegada calculada
     */
    public static LocalDateTime calcularLlegada(LocalDateTime salida, long horas, long minutos) {
        if (horas < 0 || minutos < 0) {
            throw new IllegalArgumentException("Las horas y los minutos no pueden ser negativos.");
        }
        return salida.plusHours(horas).plusMinutes(minutos);
    }
}