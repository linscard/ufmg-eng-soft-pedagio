package com.exemplo.pedagio;

import java.util.Random;

public class SistemaPagamento {
    private String statusTransacao;

    public void processarTransacao() {
        Random random = new Random();
        boolean sucesso = random.nextBoolean();
        if (sucesso) {
            statusTransacao = "Transação processada com sucesso.";
        } else {
            statusTransacao = "Falha ao processar a transação.";
        }
    }

    public String getStatusTransacao() {
        return statusTransacao;
    }

    public void setStatusTransacao(String statusTransacao) {
        this.statusTransacao = statusTransacao;
    }
}
