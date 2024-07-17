package model;

public class Entregue implements PedidoState{
    @Override
    public void proximoEstado(Pedido pedido) {
        System.out.println("Produto entregue!");
    }

    @Override
    public void estadoAnterior(Pedido pedido) {
        pedido.setEstado(new Enviado());
    }

    @Override
    public String getEstado() {
        return "Entregue";
    }
}
