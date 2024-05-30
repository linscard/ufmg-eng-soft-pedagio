package com.exemplo.pedagio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RelatorioTest {

    @Test
    public void testGerarRelatorio() {
        Relatorio relatorio = new Relatorio();
        relatorio.setTipo("Financeiro");
        relatorio.setParametros("Ano=2024");

        relatorio.gerarRelatorio();
        assertEquals("Relatório do tipo Financeiro gerado com parâmetros: Ano=2024", relatorio.getDados());

        relatorio.setTipo("");
        relatorio.gerarRelatorio();
        assertEquals("Erro: Tipo de relatório não especificado.", relatorio.getDados());
    }

    @Test
    public void testImprimirRelatorio() {
        Relatorio relatorio = new Relatorio();
        relatorio.setDados("Relatório de Teste");

        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        relatorio.imprimirRelatorio();
        assertEquals("Relatório de Teste\n", outContent.toString());

        outContent.reset();

        relatorio.setDados("");
        relatorio.imprimirRelatorio();
        assertEquals("Erro: Nenhum dado de relatório disponível para impressão.\n", outContent.toString());

        System.setOut(null);
    }
}
