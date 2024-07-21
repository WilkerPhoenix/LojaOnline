package model;

public interface Pagamento {
    boolean processarPagamento(double quantia, String nome, String dadosPagamento);
}
