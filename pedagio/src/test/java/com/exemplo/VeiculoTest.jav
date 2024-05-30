package com.exemplo.pedagio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VeiculoTest {

    @Test
    public void testValidarPlaca() {
        Veiculo veiculoValido = new Veiculo("ABC-1234", "Carro");
        assertTrue(veiculoValido.validarPlaca());

        Veiculo veiculoInvalido = new Veiculo("AB-12345", "Moto");
        assertFalse(veiculoInvalido.validarPlaca());

        Veiculo veiculoSemPlaca = new Veiculo(null, "Caminhão");
        assertFalse(veiculoSemPlaca.validarPlaca());
    }

    @Test
    public void testGettersAndSetters() {
        Veiculo veiculo = new Veiculo("DEF-5678", "Caminhão");
        
        assertEquals("DEF-5678", veiculo.getPlaca());
        assertEquals("Caminhão", veiculo.getTipo());

        veiculo.setPlaca("XYZ-9876");
        veiculo.setTipo("Carro");

        assertEquals("XYZ-9876", veiculo.getPlaca());
        assertEquals("Carro", veiculo.getTipo());
    }
}
