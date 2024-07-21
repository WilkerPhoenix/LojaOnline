package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EletronicoTest {
    private Eletronico eletronico;

    @BeforeEach
    void setUp() {
        eletronico = new Eletronico("Smartphone", 1200.00, 30);
    }

    @Test
    void getNome() {
        assertEquals("Smartphone", eletronico.getNome(), "O nome do eletrônico é 'Smartphone'");
    }

    @Test
    void getPreco() {
        assertEquals(1200.00, eletronico.getPreco(), "O preço do eletrônico é 1200.00");
    }

    @Test
    void getQuantidadeEstoque() {
        assertEquals(30, eletronico.getQuantidadeEstoque(), "A quantidade em estoque do eletrônico é  30");
    }

    @Test
    void setQuantidadeEstoque() {
        eletronico.setQuantidadeEstoque(40);
        assertEquals(40, eletronico.getQuantidadeEstoque(), "A quantidade em estoque do eletrônico é 40 após a atualização");
    }
}
