import java.util.HashMap;
import java.util.Map;

public class Carrinho {
    private Map<Produto, Integer> itens;

    public Carrinho() {
        itens = new HashMap<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        if (produto.getQuantidadeEstoque() < quantidade) {
            throw new IllegalArgumentException("Quantidade em estoque insuficiente.");
        }

        int novaQuantidade = itens.getOrDefault(produto, 0) + quantidade;
        itens.put(produto, novaQuantidade);
        produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - quantidade);
    }

    public void removerProduto(Produto produto, int quantidade) {
        if (!itens.containsKey(produto) || itens.get(produto) < quantidade) {
            throw new IllegalArgumentException("Quantidade insuficiente no carrinho.");
        }

        int novaQuantidade = itens.get(produto) - quantidade;
        if (novaQuantidade == 0) {
            itens.remove(produto);
        } else {
            itens.put(produto, novaQuantidade);
        }
        produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() + quantidade);
    }

    public double calcularPrecoTotal() {
        return itens.entrySet().stream()
                .mapToDouble(entry -> entry.getKey().getPreco() * entry.getValue())
                .sum();
    }

    public <T> ClassValue<T> getItens() {
        return (ClassValue<T>) itens;
    }

    public void setItens(ClassValue<Produto> itens) {
        this.itens = (Map<Produto, Integer>) itens;
    }

    // talvez mais getters
}

