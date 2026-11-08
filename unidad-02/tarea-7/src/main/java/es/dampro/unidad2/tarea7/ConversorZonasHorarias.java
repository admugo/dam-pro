package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase para convertir una fecha y hora con zona horaria a otra zona distinta.
 *
 * @author admugo
 * @version 1.0.0
 */
public final class ConversorZonasHorarias {
    private ConversorZonasHorarias() { }

    /**
     * Convierte una fecha y hora con zona horaria a otra zona distinta manteniendo el mismo instante temporal.
     * Si alguno de los parametros es nulo, lanza IllegalArgumentException.
     *
     * @param fechaOrigen ZonedDateTime la fecha y hora con su zona horaria de origen
     * @param zonaDestino ZoneId la zona horaria de destino a la que se desea convertir
     * @return ZonedDateTime la fecha y hora resultante en la zona horaria de destino
     */
    public static ZonedDateTime convertirZona(ZonedDateTime fechaOrigen, ZoneId zonaDestino) {
        if (fechaOrigen == null || zonaDestino == null) {
            throw new IllegalArgumentException("La fecha de origen y la zona de destino no pueden ser nulas.");
        }
        return fechaOrigen.withZoneSameInstant(zonaDestino);
    }
}