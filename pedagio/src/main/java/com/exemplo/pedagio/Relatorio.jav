package com.exemplo.pedagio;

public class Relatorio {
    private int idRelatorio;
    private String tipo;
    private String parametros;
    private String dados;

    public void gerarRelatorio() {
        if (tipo != null && !tipo.isEmpty()) {
            dados = "Relatório do tipo " + tipo + " gerado com parâmetros: " + parametros;
        } else {
            dados = "Erro: Tipo de relatório não especificado.";
        }
    }

    public void imprimirRelatorio() {
        if (dados != null && !dados.isEmpty()) {
            System.out.println(dados);
        } else {
            System.out.println("Erro: Nenhum dado de relatório disponível para impressão.");
        }
    }

    // Getters e Setters
    public int getIdRelatorio() {
        return idRelatorio;
    }

    public void setIdRelatorio(int idRelatorio) {
        this.idRelatorio = idRelatorio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getParametros() {
        return parametros;
    }

    public void setParametros(String parametros) {
        this.parametros = parametros;
    }

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }
}
