package model;

import java.util.List;

public class Pedido {
    private List<Produto> produtos;
    private PedidoState estado;
    private Pagamento metodoPagamento;

    public Pedido(List<Produto> produtos, Pagamento metodoPagamento) {
        this.produtos = produtos;
        this.estado = new Novo();
        this.metodoPagamento = metodoPagamento;
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
                .mapToDouble(Produto::getPreco)
                .sum();
    }

    public void processarPagamento() {
        metodoPagamento.processarPagamento(calcularPrecoTotal());
    }

}
