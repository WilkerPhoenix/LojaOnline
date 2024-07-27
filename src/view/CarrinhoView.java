package view;

import model.TelaPagamento;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarrinhoView extends JFrame {

        public CarrinhoView() {
            initComponents();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

            jLabel1 = new JLabel();
            jLabel2 = new JLabel();
            jLabel3 = new JLabel();
            jLabel4 = new JLabel();
            jButton1 = new JButton();
            jScrollPane1 = new JScrollPane();
            jTable1 = new JTable();
            jLabelTotalValue = new JLabel();

            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

            jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
            jLabel1.setText("Carrinho");

            jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jLabel2.setText("Produtos");

            jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jLabel3.setText("Quantidade");

            jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jLabel4.setText("Valor Total");

            jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jButton1.setText("Pagamento");
            jButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            // Configuração da tabela de produtos
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{
                            {"Produto A", 2, 19.99},
                            {"Produto B", 1, 39.99},
                            {"Produto C", 3, 29.99}
                    },
                    new String[]{
                            "Produto", "Quantidade", "Preço Unitário"
                    }
            ));
            jScrollPane1.setViewportView(jTable1);

            jLabelTotalValue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            jLabelTotalValue.setText("R$ 159,94");

            GroupLayout layout = new GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(30, 30, 30)
                                                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(180, 180, 180)
                                                    .addComponent(jLabel1))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(72, 72, 72)
                                                    .addComponent(jLabel2)
                                                    .addGap(207, 207, 207)
                                                    .addComponent(jLabel3))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(202, 202, 202)
                                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jButton1)
                                                            .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(jLabel4)
                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(jLabelTotalValue)))))
                                    .addContainerGap(30, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabelTotalValue))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                    .addComponent(jButton1)
                                    .addGap(26, 26, 26))
            );

            pack();
        }// </editor-fold>

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
            new TelaPagamento().setVisible(true);
        }

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new CarrinhoView().setVisible(true);
                }
            });
        }

        // Variables declaration - do not modify
        private JButton jButton1;
        private JLabel jLabel1;
        private JLabel jLabel2;
        private JLabel jLabel3;
        private JLabel jLabel4;
        private JScrollPane jScrollPane1;
        private JTable jTable1;
        private JLabel jLabelTotalValue;
        // End of variables declaration
}
