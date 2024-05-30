package com.exemplo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AplicacaoWebTest {

    @Test
    public void testInterfaceUsuario() {
        AplicacaoWeb app = new AplicacaoWeb();
        app.interfaceUsuario();
    }

    @Test
    public void testProcessarDados() {
        AplicacaoWeb app = new AplicacaoWeb();
        app.processarDados();
    }

    @Test
    public void testExibirResultados() {
        AplicacaoWeb app = new AplicacaoWeb();
        app.exibirResultados();
    }
}
