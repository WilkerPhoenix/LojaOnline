package model;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Confirme extends JFrame {

    public Confirme() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new JLabel();
        jButton1 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Confirme o Recebimento do Produto");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Recebido");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(112, 112, 112)
                                                .addComponent(jButton1)))
                                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel1)
                                .addGap(42, 42, 42)
                                .addComponent(jButton1)
                                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        // Implementar ação para fechar a página e abrir página de login
        dispose(); // Fechar a página atual
        // new Login().setVisible(true); // Abrir a página de login (assumindo que a classe Login existe)
        JOptionPane.showMessageDialog(this, "Produto recebido. Redirecionando para a página de login.");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Confirme().setVisible(true);
            }
        });
    }

    private JButton jButton1;
    private JLabel jLabel1;
}

