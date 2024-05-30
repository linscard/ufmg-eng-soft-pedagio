package com.exemplo.pedagio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedagioTest {

    @Test
    public void testPassarPeloPedagio() {
        Pedagio pedagio = new Pedagio();
        Veiculo veiculoValido = new Veiculo("ABC-1234", "Carro");
        Veiculo veiculoInvalido = new Veiculo("", "Moto");

        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        pedagio.passarPeloPedagio(veiculoValido);
        assertEquals("Veículo ABC-1234 passou pelo pedágio.\n", outContent.toString().trim());

        outContent.reset();

        pedagio.passarPeloPedagio(veiculoInvalido);
        assertEquals("Erro: Dados do veículo são inválidos.", outContent.toString().trim());

        System.setOut(null);
    }

    @Test
    public void testCalcularTarifa() {
        Pedagio pedagio = new Pedagio();
        Veiculo caminhao = new Veiculo("DEF-5678", "Caminhão");
        Veiculo carro = new Veiculo("GHI-9101", "Carro");
        Veiculo moto = new Veiculo("JKL-1121", "Moto");

        assertEquals(20.0, pedagio.calcularTarifa(caminhao));
        assertEquals(10.0, pedagio.calcularTarifa(carro));
        assertEquals(5.0, pedagio.calcularTarifa(moto));
    }
}
