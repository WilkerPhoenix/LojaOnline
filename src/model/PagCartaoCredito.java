package model;

public class PagCartaoCredito implements Pagamento {
    @Override
    public void processarPagamento(double quantia) {
        // falta e como vai ser essa implementação?
        System.out.println("Pagamento de " + quantia + " processado via Cartão de Crédito.");
    }
}


