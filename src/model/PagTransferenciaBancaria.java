package model;
// colocar  na  interface uma verificação ´para ver se o usuario inseriu nome e dados de pagamento, para poder concluir o pagamento.
public class PagTransferenciaBancaria implements Pagamento {
    @Override
    public boolean processarPagamento(double quantia, String nome, String dadosPagamento) {
        return true;  
    }
}
