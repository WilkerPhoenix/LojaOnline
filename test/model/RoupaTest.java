package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoupaTest {
    private Roupa roupa;

    @BeforeEach
    void setUp() {
        roupa = new Roupa("Camisa", 50.00, 20);
    }

    @Test
    void getNome() {
        assertEquals("Camisa", roupa.getNome(), "O nome da roupa é 'Camisa'");
    }

    @Test
    void getPreco() {
        assertEquals(50.00, roupa.getPreco(), "O preço da roupa é 50.00");
    }

    @Test
    void getQuantidadeEstoque() {
        assertEquals(20, roupa.getQuantidadeEstoque(), "A quantidade em estoque da roupa é 20");
    }

    @Test
    void setQuantidadeEstoque() {
        roupa.setQuantidadeEstoque(30);
        assertEquals(30, roupa.getQuantidadeEstoque(), "A quantidade em estoque da roupa é 30 após a atualização");
    }
}
