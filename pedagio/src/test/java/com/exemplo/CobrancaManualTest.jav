package com.exemplo.pedagio;package com.exemplo.pedagio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CobrancaManualTest {

    @Test
    public void testCobrarManualment() {
        CobrancaManual cobrancaManual = new CobrancaManual();
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        cobrancaManual.cobrarManualment();

        assertEquals("Simulando a cobrança manual\n", outContent.toString());

        System.setOut(null);
    }
}
