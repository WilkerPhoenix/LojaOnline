
package model;

public class Logista{
   private Estoque estoque;

   public Logista(){
       estoque = Estoque.getInstance();


   }

   public void adicionarProduto(Produto produto){
       estoque.listaDeProdutos.add(produto);

   }
}

