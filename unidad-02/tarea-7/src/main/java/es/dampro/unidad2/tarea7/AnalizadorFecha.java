package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase de utilidad para analizar propiedades temporales de una fecha.
 *
 * @author admugo
 * @version 1.0.0
 */
public final class AnalizadorFecha {
    private AnalizadorFecha() { }

    /**
     * Analiza una fecha indicando su formato ISO, dia de la semana,
     * posicion en el ano, si es bisiesto y la longitud del mes.
     *
     * @param fecha LocalDate la fecha local que se desea analizar
     * @return String una cadena con el formato AAAA-MM-DD|DAY_OF_WEEK|DIA_DEL_ANIO|true/false|DIAS_MES
     */
    public static String analizarFecha(LocalDate fecha) {
        return fecha.toString() + "|" +
                fecha.getDayOfWeek().name() + "|" +
                fecha.getDayOfYear() + "|" +
                fecha.isLeapYear() + "|" +
                fecha.lengthOfMonth();
    }
}