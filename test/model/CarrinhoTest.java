package model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarrinhoTest {
    private Carrinho carrinho;
    private Produto celular;
    private Produto camiseta;

    @BeforeEach
    public void setup() {
        carrinho = new Carrinho();
        celular = ProdutoFactory.criarProduto("eletronico", "Celular", 1200.00, 10);
        camiseta = ProdutoFactory.criarProduto("roupa", "Camiseta", 50.00, 20);
    }

    @Test
    public void testAdicionarProduto() {
        carrinho.adicionarProduto(celular, 1);
        assertEquals(1, carrinho.getItens().get(celular.getClass()));
    }

    @Test
    public void testCalcularPrecoTotal() {
        carrinho.adicionarProduto(celular, 1);
        carrinho.adicionarProduto(camiseta, 2);
        assertEquals(1300.00, carrinho.calcularPrecoTotal());
    }
}
