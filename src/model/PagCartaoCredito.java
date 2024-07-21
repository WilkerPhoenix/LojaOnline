package model;

public class PagCartaoCredito implements Pagamento {
    @Override
    public boolean processarPagamento(double quantia, String nome, String dadosPagamento) {
        return true;
    }
}
