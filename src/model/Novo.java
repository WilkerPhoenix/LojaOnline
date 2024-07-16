public class Novo implements PedidoState {
    @Override
    public void proximoEstado(Pedido pedido) {
        pedido.setEstado(new Processando());
    }

    @Override
    public void estadoAnterior(Pedido pedido) {
        System.out.println("O pedido está no estado inicial.");
    }

    @Override
    public String getEstado() {
        return "Novo";
    }
}



