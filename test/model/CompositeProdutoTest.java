package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompositeProdutoTest {


    @BeforeEach
    void setUp() {
        compositeRoupa = new CompositeProduto("Roupa", 0 ,0);
        compositeEletronico = new Composite("Eletrônico", 0, 0);
        celular = ProdutoFactory.criarProduto("eletronico", "Celular", 1200.00, 10);
        camiseta = ProdutoFactory.criarProduto("roupa", "Camiseta", 50.00, 20);
        camiseta = ProdutoFactory.criarProduto("roupa", "Calça", 50.00, 20);


    }

    @Test
    void addProduto() {

    }

    @Test
    void getQuantidadeCarrinho() {
        compositeRoupa = new CompositeProduto("Roupa", 0, 0);
        compositeRoupa.
    }

    @Test
    void removeProduto() {
    }

    @Test
    void testGetQuantidadeCarrinho() {
    }

    @Test
    void testAddProduto() {
    }

    @Test
    void testRemoveProduto() {
    }
}