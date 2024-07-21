package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {
    private Produto produto;

    @BeforeEach
    void setUp() {
        produto = new Produto("Produto A", 100.00, 50);
    }

    @Test
    void getNome() {
        assertEquals("Produto A", produto.getNome(), "O nome do produto é 'Produto A'");
    }

    @Test
    void getPreco() {
        assertEquals(100.00, produto.getPreco(), "O preço do produto é  100.00");
    }

    @Test
    void getQuantidadeEstoque() {
        assertEquals(50, produto.getQuantidadeEstoque(), "A quantidade em estoque é  50");
    }

    @Test
    void setQuantidadeEstoque() {
        produto.setQuantidadeEstoque(75);
        assertEquals(75, produto.getQuantidadeEstoque(), "A quantidade em estoque é  75 após a atualização");
    }
}
