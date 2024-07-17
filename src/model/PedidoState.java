package model;

public interface PedidoState {
    void proximoEstado(Pedido pedido);
    void estadoAnterior(Pedido pedido);
    String getEstado();
}
