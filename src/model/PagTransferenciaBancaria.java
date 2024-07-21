package model;

public class PagTransferenciaBancaria implements Pagamento {
    @Override
    public boolean processarPagamento(double quantia, String nome, String dadosPagamento) {
        return true;  
    }
}
