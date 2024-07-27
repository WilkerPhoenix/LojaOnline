package model;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class CarrinhoTela extends JFrame {
    private JTable table;
    private JLabel totalLabel;
    private List<Produto> produtosCarrinho;

    public CarrinhoTela(List<Produto> produtosCarrinho) {
        this.produtosCarrinho = produtosCarrinho;
        initComponents();
    }

    private void initComponents() {
        JLabel jLabel1 = new JLabel();
        JButton jButton1 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Carrinho");

        table = new JTable(new CarrinhoTableModel(produtosCarrinho));
        JScrollPane scrollPane = new JScrollPane(table);

        totalLabel = new JLabel();
        atualizarValorTotal();

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Pagamento");
        jButton1.addActionListener(evt -> jButton1ActionPerformed());

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(totalLabel)))
                                .addContainerGap(24, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(209, 209, 209))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(totalLabel)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton1ActionPerformed() {
        new TelaPagamento().setVisible(true);
    }

    private void atualizarValorTotal() {
        double total = produtosCarrinho.stream().mapToDouble(p -> p.getPreco() * p.getQuantidadeEstoque()).sum();
        totalLabel.setText("Valor Total: R$ " + total);
    }
}
