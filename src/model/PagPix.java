package model;

public class PagPix implements Pagamento {
    @Override
    public boolean processarPagamento(double quantia, String nome, String dadosPagamento) {
        return true;
    }

}
