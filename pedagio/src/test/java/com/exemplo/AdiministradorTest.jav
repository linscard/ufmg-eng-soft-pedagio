package com.exemplo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AdministradorTest {

    @Test
    public void testGerenciarTarifas() {
        Administrador admin = new Administrador();
        admin.gerenciarTarifas("opções de teste");
    }

    @Test
    public void testGerarRelatorios() {
        Administrador admin = new Administrador();
        admin.gerarRelatorios();
    }

    @Test
    public void testGetSetIdAdmin() {
        Administrador admin = new Administrador();
        admin.setIdAdmin(123);
        assertEquals(123, admin.getIdAdmin());
    }

    @Test
    public void testGetSetPassword() {
        Administrador admin = new Administrador();
        admin.setPassword(456);
        assertEquals(456, admin.getPassword());
    }
}
