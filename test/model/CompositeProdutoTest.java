package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompositeProdutoTest {
    private CompositeProduto compositeEletronico;
    private CompositeProduto compositeRoupa;
    private Produto celular;
    private Produto camiseta;
    private Produto calca;

    @BeforeEach
    void setUp() {
        compositeEletronico = new CompositeProduto("Eletrônico", 0, 0);
        compositeRoupa = new CompositeProduto("Roupa", 0, 0);
        celular = ProdutoFactory.criarProduto("eletronico", "Celular", 1200.00, 10);
        camiseta = ProdutoFactory.criarProduto("roupa", "Camiseta", 50.00, 20);
        calca = ProdutoFactory.criarProduto("roupa", "Calça", 80.00, 15);
    }

    @Test
    void addProduto() {
        compositeEletronico.addProduto(celular);
        assertEquals(1, compositeEletronico.getQuantidadeCarrinho());
    }

    @Test
    void getQuantidadeCarrinho() {
        compositeRoupa.addProduto(camiseta);
        compositeRoupa.addProduto(calca);
        assertEquals(2, compositeRoupa.getQuantidadeCarrinho());
    }

    @Test
    void removeProduto() {
        compositeRoupa.addProduto(camiseta);
        compositeRoupa.addProduto(calca);
        compositeRoupa.removeProduto(camiseta);
        assertEquals(1, compositeRoupa.getQuantidadeCarrinho());
    }

    @Test
    void testAddProduto() {
        compositeEletronico.addProduto(celular);
        assertEquals(1, compositeEletronico.getQuantidadeCarrinho());
    }

    @Test
    void testRemoveProduto() {
        compositeRoupa.addProduto(camiseta);
        compositeRoupa.addProduto(calca);
        compositeRoupa.removeProduto(camiseta);
        assertEquals(1, compositeRoupa.getQuantidadeCarrinho());
    }
}
