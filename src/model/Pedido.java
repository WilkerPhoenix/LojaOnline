package model;

import java.util.List;

public class Pedido {
    private List<Produto> produtos;
    private PedidoState estado;
    private Pagamento metodoPagamento;
    private String nomeCliente;
    private String dadosPagamento;

    public Pedido(List<Produto> produtos, Pagamento metodoPagamento, String nomeCliente, String dadosPagamento) {
        this.produtos = produtos;
        this.estado = new Novo();
        this.metodoPagamento = metodoPagamento;
        this.nomeCliente = nomeCliente;
        this.dadosPagamento = dadosPagamento;
    }

    public void proximoEstado() {
        estado.proximoEstado(this);
    }

    public void estadoAnterior() {
        estado.estadoAnterior(this);
    }

    public String getEstado() {
        return estado.getEstado();
    }

    public void setEstado(PedidoState estado) {
        this.estado = estado;
    }

    public double calcularPrecoTotal() {
        return produtos.stream()
                .mapToDouble(produto -> produto.getPreco() * produto.getQuantidadeEstoque())
                .sum();
    }

    public boolean processarPagamento() {
        return metodoPagamento.processarPagamento(calcularPrecoTotal(), nomeCliente, dadosPagamento);
    }
}
