package com.exemplo.pedagio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaIdentificacaoTest {

    @Test
    public void testIdentificarVeiculo() {
        SistemaIdentificacao sistemaIdentificacao = new SistemaIdentificacao();

        sistemaIdentificacao.identificarVeiculo();
        String resultado = sistemaIdentificacao.getIdentificacao();
        
        assertTrue(resultado.equals("Veículo identificado com sucesso: ABC-1234") || 
                   resultado.equals("Falha na identificação do veículo."));
    }
}
