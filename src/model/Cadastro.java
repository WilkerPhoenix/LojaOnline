package model;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cadastro extends JFrame {
    private CadastroListener cadastroListener;
    private JTextField loginField;
    private JPasswordField senhaField; // Use JPasswordField para senhas
    private JTextField nomeField;
    private JButton cadastrarButton;
    private JButton cancelarButton;
    private JLabel titleLabel;
    private JLabel loginLabel;
    private JLabel senhaLabel;
    private JLabel nomeLabel;

    public interface CadastroListener {
        void onCadastroCompleted(Usuario user);
    }

    public void setCadastroListener(CadastroListener listener) {
        this.cadastroListener = listener;
    }

    public Cadastro() {
        initComponents();
    }

    private void initComponents() {
        // Inicializando componentes
        titleLabel = new JLabel("Faça Seu Cadastro");
        loginLabel = new JLabel("Login");
        senhaLabel = new JLabel("Senha");
        nomeLabel = new JLabel("Nome");

        loginField = new JTextField();
        senhaField = new JPasswordField();
        nomeField = new JTextField();

        cadastrarButton = new JButton("Cadastrar");
        cancelarButton = new JButton("Cancelar");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(370, 325);

        titleLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18));
        loginLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14));
        senhaLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14));
        nomeLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14));
        cadastrarButton.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14));
        cancelarButton.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14));

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });

        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        // Layout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(79, 79, 79)
                                                .addComponent(titleLabel))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(loginLabel)
                                                        .addComponent(loginField, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(senhaLabel)
                                                        .addComponent(senhaField, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nomeLabel)
                                                        .addComponent(nomeField, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(cadastrarButton)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(cancelarButton)))))
                                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleLabel)
                                .addGap(18, 18, 18)
                                .addComponent(loginLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loginField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(senhaLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(senhaField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nomeLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(cadastrarButton)
                                        .addComponent(cancelarButton))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void cadastrarButtonActionPerformed(ActionEvent evt) {
        String login = loginField.getText();
        String senha = new String(senhaField.getPassword()); // Captura a senha corretamente
        String nome = nomeField.getText();

        Cliente novoCliente = new Cliente(nome, login, senha);

        if (cadastroListener != null) {
            cadastroListener.onCadastroCompleted(novoCliente);
        }

        JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
        dispose();
    }

    private void cancelarButtonActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "Cadastro cancelado.");
        dispose();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }
}
