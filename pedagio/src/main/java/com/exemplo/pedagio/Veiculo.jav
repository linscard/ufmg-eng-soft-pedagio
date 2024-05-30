package com.exemplo.pedagio;

public class Veiculo {
    private String placa;
    private String tipo;

    public Veiculo(String placa, String tipo) {
        this.placa = placa;
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean validarPlaca() {
        return placa != null && placa.matches("[A-Z]{3}-\\d{4}");
    }
}
