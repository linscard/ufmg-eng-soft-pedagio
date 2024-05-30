package com.exemplo.pedagio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CobrancaAutomaticaTest {

    @Test
    public void testCobrarAutomaticamente() {
        CobrancaAutomatica cobrancaAutomatica = new CobrancaAutomatica();
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        cobrancaAutomatica.cobrarAutomaticamente();

        assertEquals("Simulando a cobrança automática\n", outContent.toString());

        System.setOut(null);
    }
}
