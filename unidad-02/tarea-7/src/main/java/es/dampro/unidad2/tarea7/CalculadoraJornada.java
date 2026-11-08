package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase para calcular el tiempo trabajado en una jornada laboral dentro del mismo dia.
 *
 * @author admugo
 * @version 1.0.0
 */
public final class CalculadoraJornada {
    private CalculadoraJornada() { }

    /**
     * Calcula el tiempo trabajado restando el descanso a la duracion entre la entrada y la salida.
     * La salida debe ser estrictamente posterior a la entrada, el descanso no puede ser negativo
     * y no debe exceder la duracion total. En caso contrario, lanza IllegalArgumentException.
     *
     * @param entrada LocalTime la hora de entrada al trabajo
     * @param salida LocalTime la hora de salida del trabajo
     * @param descansoMinutos int los minutos de descanso disfrutados
     * @return Duration la duracion neta del tiempo trabajado
     */
    public static Duration calcularTiempoTrabajado(LocalTime entrada, LocalTime salida, int descansoMinutos) {
        if (!salida.isAfter(entrada)) {
            throw new IllegalArgumentException("La salida debe ser estrictamente posterior a la entrada.");
        }
        if (descansoMinutos < 0) {
            throw new IllegalArgumentException("El descanso no puede ser negativo.");
        }
        Duration duracionTotal = Duration.between(entrada, salida);
        if (descansoMinutos > duracionTotal.toMinutes()) {
            throw new IllegalArgumentException("El descanso no puede exceder la duracion total de la jornada.");
        }
        return duracionTotal.minusMinutes(descansoMinutos);
    }
}