package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase para comprobar si existen solapamientos entre reservas temporales.
 *
 * @author admugo
 * @version 1.0.0
 */
public final class ComprobadorReservas {
    private ComprobadorReservas() { }

    /**
     * Comprueba si dos reservas del tipo [inicio, fin) se cruzan.
     * Cada fin debe ser posterior a su inicio, en caso contrario, lanza IllegalArgumentException.
     * Dos reservas que solo se tocan en un extremo no solapan.
     *
     * @param inicio1 LocalDateTime la fecha y hora de inicio de la primera reserva
     * @param fin1 LocalDateTime la fecha y hora de fin de la primera reserva
     * @param inicio2 LocalDateTime la fecha y hora de inicio de la segunda reserva
     * @param fin2 LocalDateTime la fecha y hora de fin de la segunda reserva
     * @return boolean resultado de la comprobacion
     */
    public static boolean haySolapamiento(LocalDateTime inicio1, LocalDateTime fin1, LocalDateTime inicio2, LocalDateTime fin2) {
        if (!fin1.isAfter(inicio1) || !fin2.isAfter(inicio2)) {
            throw new IllegalArgumentException("El fin de cada reserva debe ser posterior a su inicio.");
        }
        return inicio1.isBefore(fin2) && inicio2.isBefore(fin1);
    }
}