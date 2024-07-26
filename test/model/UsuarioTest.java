/*package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    private UsuarioConcreto usuario;

    @BeforeEach
    void setUp() {
        usuario = new UsuarioConcreto("João", "joao123", "senhaCerta");
    }

    @Test
    void getNome() {
        assertEquals("João", usuario.getNome());
    }

    @Test
    void setNome() {
        usuario.setNome("Maria");
        assertEquals("Maria", usuario.getNome());
    }

    @Test
    void getLogin() {
        assertEquals("joao123", usuario.getLogin());
    }

    @Test
    void setLogin() {
        usuario.setLogin("maria456");
        assertEquals("maria456", usuario.getLogin());
    }

    @Test
    void getSenha() {
        assertEquals("senhaCerta", usuario.getSenha());
    }

    @Test
    void setSenha() {
        usuario.setSenha("outraSenha");
        assertEquals("outraSenha", usuario.getSenha());
    }

    @Test
    void loginComSenhaCorreta() {
        usuario.setSenha("senhaCerta");
        usuario.login();
        assertTrue(usuario.isAutenticado());
    }

    @Test
    void loginComSenhaIncorreta() {
        usuario.setSenha("senhaErrada");
        usuario.login();
        assertFalse(usuario.isAutenticado());
    }
}
*/
