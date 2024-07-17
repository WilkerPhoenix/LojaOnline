package model;

public class PagTransferenciaBancaria implements Pagamento {
    @Override
    public void processarPagamento(double quantia) {
        //esta faltando implemetar algo
        System.out.println("Pagamento de " + quantia + " processado via Transferência Bancária.");
    }
}