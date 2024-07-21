package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstoqueTest {
    private Estoque estoque;
    private Produto roupa;
    private Produto eletronico;

    @BeforeEach
    public void setUp() {
        estoque = new Estoque();
        roupa = new Produto("Roupa", 100.00, 5);
        eletronico = new Produto("Celular", 1000.00, 10);

    }

    @Test
    void getInstance() {
        estoque.getInstance();
        assertNotNull(estoque);


    }
    @Test
    void add() {
        estoque.listaDeProdutos.add(roupa);
        assertEquals("Roupa", estoque.listaDeProdutos.getLast());


    }
}