package model;

public class Enviado implements PedidoState {
    @Override
    public void proximoEstado(Pedido pedido) {
        pedido.setEstado(new Entregue());
    }

    @Override
    public void estadoAnterior(Pedido pedido) {
        //Processando ou volta para o novo?
        pedido.setEstado(new Processando());
    }

    @Override
    public String getEstado() {
        return "Enviado";
    }
    //falta implementar os 3 métodos abstratos.


}
