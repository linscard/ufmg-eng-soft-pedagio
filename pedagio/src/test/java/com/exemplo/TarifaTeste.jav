package com.exemplo.pedagio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TarifaTest {

    @Test
    public void testDefinirTarifa() {
        Tarifa tarifa = new Tarifa();
        tarifa.definirTarifa("Carro", 15.0);

        assertEquals("Carro", tarifa.getTipoVeiculo());
        assertEquals(15.0, tarifa.getValor());
    }

    @Test
    public void testAjustarTarifa() {
        Tarifa tarifa = new Tarifa();
        tarifa.definirTarifa("Caminhão", 20.0);

        tarifa.ajustarTarifa(25.0);
        assertEquals(25.0, tarifa.getValor());

        tarifa.ajustarTarifa(-5.0);
        assertNotEquals(-5.0, tarifa.getValor());
        assertEquals(25.0, tarifa.getValor());
    }

	 @Test
    public void testCalcularTarifa() {
        Tarifa tarifa = new Tarifa();

        tarifa.calcularTarifa("Caminhão");
        assertEquals(20.0, tarifa.getValor());

        tarifa.calcularTarifa("Carro");
        assertEquals(10.0, tarifa.getValor());

        tarifa.calcularTarifa("Moto");
        assertEquals(5.0, tarifa.getValor());

        tarifa.calcularTarifa("Bicicleta");
        assertEquals(0.0, tarifa.getValor());
    }
}
