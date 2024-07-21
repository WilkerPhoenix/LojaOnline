package model;

import java.util.ArrayList;
import java.util.List;

public class CompositeProduto extends Produto{
    private int quantidadeCarrinho;
    private List<Produto> produtoList = new ArrayList<>();
    //Isso não cheira bem scr
    public CompositeProduto(String nome, double preco, int quantidadeEstoque) {
        super(nome, preco, quantidadeEstoque);
    }

    public int getQuantidadeCarrinho(){
        quantidadeCarrinho=0;
        for(Produto p:produtoList){
            //Deve ter uma variável de quantidade no carrinho?

            quantidadeCarrinho = quantidadeCarrinho+p.getQuantidadeEstoque();

        }
        return quantidadeCarrinho;
    }
    public void addProduto(Produto p){
        this.produtoList.add(p);

    }
    public void removeProduto(Produto p){
        this.produtoList.remove(p);
    }

}
