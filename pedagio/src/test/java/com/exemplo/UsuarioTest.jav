package com.exemplo.pedagio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void testCadastrarUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNome("João Silva");
        usuario.setEmail("joao.silva@example.com");
        usuario.setSenha("senha123");

        usuario.cadastrarUsuario();
        assertTrue(Usuario.getUsuariosCadastrados().containsKey("joao.silva@example.com"));
        assertEquals(usuario, Usuario.getUsuariosCadastrados().get("joao.silva@example.com"));

        Usuario usuarioInvalido = new Usuario();
        usuarioInvalido.setNome("Maria Souza");

        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        usuarioInvalido.cadastrarUsuario();
        assertEquals("Erro: Email e senha são obrigatórios.\n", outContent.toString());

        System.setOut(null);
    }
}
