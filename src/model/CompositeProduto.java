package model;

import java.util.ArrayList;
import java.util.List;

public class CompositeProduto extends Produto {
    private int quantidadeCarrinho = 0;
    private List<Produto> produtoList = new ArrayList<>();
    //Isso não cheira bem scr

    public CompositeProduto(String nome, double preco, int quantidadeEstoque) {
        super(nome, preco, quantidadeEstoque);
    }

    public int getQuantidadeCarrinho() {
        return quantidadeCarrinho;
    }

    public void addProduto(Produto p) {
        this.produtoList.add(p);
        quantidadeCarrinho += 1;
    }

    public void removeProduto(Produto p) {
        if (this.produtoList.remove(p)) {
            quantidadeCarrinho -= 1;
        }
    }
}
