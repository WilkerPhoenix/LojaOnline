public class Processando implements PedidoState {
    @Override
    public void proximoEstado(Pedido pedido) {
        pedido.setEstado(new Enviado());
    }

    @Override
    public void estadoAnterior(Pedido pedido) {
        pedido.setEstado(new Novo());
    }

    @Override
    public String getEstado() {
        return "Processando";
    }
}