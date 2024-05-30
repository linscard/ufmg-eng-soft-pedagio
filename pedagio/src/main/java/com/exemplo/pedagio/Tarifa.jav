package com.exemplo.pedagio;

public class Tarifa {
    private int idTarifa;
    private String tipoVeiculo;
    private double valor;

    public void calcularTarifa(String tipoVeiculo) {
        if (tipoVeiculo.equalsIgnoreCase("Caminhão")) {
            valor = 20.0;
        } else if (tipoVeiculo.equalsIgnoreCase("Carro")) {
            valor = 10.0;
        } else if (tipoVeiculo.equalsIgnoreCase("Moto")) {
            valor = 5.0;
        } else {
            valor = 0.0;
        }
    }

	 public void definirTarifa(String tipoVeiculo, double valor) {
        this.tipoVeiculo = tipoVeiculo;
        this.valor = valor;
        System.out.println("Tarifa definida: Tipo de Veículo - " + tipoVeiculo + ", Valor - " + valor);
    }

    public void ajustarTarifa(double novoValor) {
        if (novoValor > 0) {
            this.valor = novoValor;
            System.out.println("Tarifa ajustada para: " + novoValor);
        } else {
            System.out.println("Valor inválido. A tarifa não pode ser ajustada.");
        }
    }

    // Getters e Setters
    public int getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(int idTarifa) {
        this.idTarifa = idTarifa;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
