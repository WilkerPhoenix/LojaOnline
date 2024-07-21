package model;

public class PagPayPal implements Pagamento {
    @Override
    public boolean processarPagamento(double quantia, String nome, String dadosPagamento) {
        //Colocar na interface um botão para confirma o pagamento
        return true;
    }
}
