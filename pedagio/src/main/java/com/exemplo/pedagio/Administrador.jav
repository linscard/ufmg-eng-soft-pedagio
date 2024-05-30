package com.exemplo.pedagio;


public class Administrador extends Usuario {
	private int idAdmin;
	private int password;

	public void gerenciarTarifas(String options) {
		// Simulação da gestão de tarifas
		System.out.println("Simulando a gestão de tarifas com opções: " + options);
		// Implementação fictícia aqui
	}

	public void gerarRelatorios() {
		// Simulação da geração de relatórios
		System.out.println("Simulando a geração de relatórios");
		// Implementação fictícia aqui
	}

	// Getters e Setters
	public int getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int idAdmin) {
		this.idAdmin = password;
	}
}
