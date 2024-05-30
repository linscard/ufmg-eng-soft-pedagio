package com.exemplo.pedagio;

public class Pedagio {
    public void passarPeloPedagio(Veiculo veiculo) {
        if (veiculo != null && veiculo.getPlaca() != null && !veiculo.getPlaca().isEmpty()) {
            System.out.println("Veículo " + veiculo.getPlaca() + " passou pelo pedágio.");
        } else {
            System.out.println("Erro: Dados do veículo são inválidos.");
        }
    }

    public double calcularTarifa(Veiculo veiculo) {
        if (veiculo.getTipo().equalsIgnoreCase("Caminhão")) {
            return 20.0;
        } else if (veiculo.getTipo().equalsIgnoreCase("Carro")) {
            return 10.0;
        } else {
            return 5.0;
        }
    }
}
