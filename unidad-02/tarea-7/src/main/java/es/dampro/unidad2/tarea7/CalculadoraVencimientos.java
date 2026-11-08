package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase para calcular fechas de vencimiento aplicando anos, meses y dias.
 *
 * @author admugo
 * @version 1.0.0
 */
public final class CalculadoraVencimientos {
    private CalculadoraVencimientos() { }

    /**
     * Calcula un vencimiento aplicando primero anos, luego meses y finalmente dias en ese orden.
     * Admite desplazamientos negativos y delega los ajustes de fin de mes a LocalDate.
     *
     * @param fecha LocalDate la fecha base de partida
     * @param dias int el numero de dias a sumar o restar
     * @param meses int el numero de meses a sumar o restar
     * @param anios int el numero de anos a sumar o restar
     * @return LocalDate la fecha de vencimiento resultante
     */
    public static LocalDate calcularVencimiento(LocalDate fecha, int dias, int meses, int anios) {
        return fecha.plusYears(anios)
                .plusMonths(meses)
                .plusDays(dias);
    }
}