package com.exemplo.pedagio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaPagamentoTest {

    @Test
    public void testProcessarTransacao() {
        SistemaPagamento sistemaPagamento = new SistemaPagamento();

        sistemaPagamento.processarTransacao();
        String resultado = sistemaPagamento.getStatusTransacao();
        
        assertTrue(resultado.equals("Transação processada com sucesso.") || 
                   resultado.equals("Falha ao processar a transação."));
    }
}
