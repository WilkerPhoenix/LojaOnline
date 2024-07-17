package model;

public class PagPayPal implements Pagamento {
    @Override
    public void processarPagamento(double quantia) {
        // falta
        System.out.println("Pagamento de " + quantia + " processado via PayPal.");
    }
}