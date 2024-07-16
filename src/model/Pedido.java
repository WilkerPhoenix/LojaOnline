package model;

import java.util.List;

/**
 *
 * @author Wilker
 */
public class Pedido {
    private List<Produto> produtos;
    private String status;
    private Pagamento metodoPagamento;

    public Pedido() {
        this.status = "Novo";
    }
    
    

    public List<Produto> getProdutos() {
        return produtos;
    }

   

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Pagamento getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(Pagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
    
    
}
