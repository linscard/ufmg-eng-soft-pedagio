package com.exemplo.pedagio;

import java.util.Random;

public class SistemaIdentificacao {
    private String identificacao;

    public void identificarVeiculo() {
        Random random = new Random();
        boolean sucesso = random.nextBoolean();
        if (sucesso) {
            identificacao = "Veículo identificado com sucesso: ABC-1234";
        } else {
            identificacao = "Falha na identificação do veículo.";
        }
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }
}
