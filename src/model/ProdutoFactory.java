public class ProdutoFactory {
    public static Produto criarProduto(String tipo, String nome, double preco, int quantidadeEstoque) {
        switch (tipo.toLowerCase()) {
            case "eletronico":
                return new Eletronico(nome, preco, quantidadeEstoque);
            case "roupa":
                return new Roupa(nome, preco, quantidadeEstoque);
            default:
                throw new IllegalArgumentException("Tipo de produto desconhecido.");
        }
    }
}
