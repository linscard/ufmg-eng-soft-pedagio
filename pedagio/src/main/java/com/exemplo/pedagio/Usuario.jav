package com.exemplo.pedagio;

import java.util.HashMap;
import java.util.Map;

public class Usuario {
    private int idUsuario;
    private String nome;
    private String email;
    private String senha;

    private static Map<String, Usuario> usuariosCadastrados = new HashMap<>();

    public void cadastrarUsuario() {
        if (email != null && !email.isEmpty() && senha != null && !senha.isEmpty()) {
            usuariosCadastrados.put(email, this);
            System.out.println("Usuário cadastrado com sucesso: " + nome);
        } else {
            System.out.println("Erro: Email e senha são obrigatórios.");
        }
    }

    // Getters e Setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public static Map<String, Usuario> getUsuariosCadastrados() {
        return usuariosCadastrados;
    }
}
