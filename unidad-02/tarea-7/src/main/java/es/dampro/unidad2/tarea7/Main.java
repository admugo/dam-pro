package es.dampro.unidad2.tarea7;

import java.time.*;

/**
 * Clase para ejemplos de los diez algoritmos de fechas.
 *
 * @author admugo
 * @version 1.0.0
 */
public class Main {

    /**
     * Punto de entrada para las comprobaciones manuales.
     *
     * @param args String[] los argumentos pasados por linea de comandos
     */
    public static void main(String[] args) {
        System.out.println("AnalizadorFecha: " + AnalizadorFecha.analizarFecha(LocalDate.of(2026, 11, 8)));
        System.out.println("CalculadoraEdad: " + CalculadoraEdad.calcularEdad(LocalDate.of(1995, 5, 10), LocalDate.of(2026, 11, 8)));
        System.out.println("CalculadoraVencimientos: " + CalculadoraVencimientos.calcularVencimiento(LocalDate.of(2026, 11, 8), 10, 2, 1));
        System.out.println("ValidadorFechas: " + ValidadorFechas.validarFecha("25/12/2026"));
        System.out.println("CuentaAtrasEvento: " + CuentaAtrasEvento.calcularDiasRestantes(LocalDate.of(2026, 11, 8), LocalDate.of(2026, 12, 25)));
        System.out.println("CalculadoraJornada: " + CalculadoraJornada.calcularTiempoTrabajado(LocalTime.of(14, 30), LocalTime.of(20, 30), 30));
        System.out.println("CalculadoraViaje: " + CalculadoraViaje.calcularLlegada(LocalDateTime.of(2026, 11, 8, 10, 0), 2, 30));
        System.out.println("ComprobadorReservas: " + ComprobadorReservas.haySolapamiento(LocalDateTime.of(2026, 11, 8, 10, 0), LocalDateTime.of(2026, 11, 8, 12, 0), LocalDateTime.of(2026, 11, 8, 11, 0), LocalDateTime.of(2026, 11, 8, 13, 0)));
        System.out.println("ProximoCumpleanios: " + ProximoCumpleanios.calcularProximoCumpleanios(LocalDate.of(2005, 7, 26), LocalDate.of(2026, 11, 8)));
        System.out.println("ConversorZonasHorarias: " + ConversorZonasHorarias.convertirZona(LocalDateTime.parse("2026-11-08T23:00").atZone(ZoneId.of("Atlantic/Canary")),ZoneId.of("Europe/Madrid")));
    }
}