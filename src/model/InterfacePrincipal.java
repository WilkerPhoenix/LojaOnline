package model;

import view.ClienteView;
import view.LojistaView;
import view.CarrinhoView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfacePrincipal extends JFrame {
    private Usuario usuario;
    private ClienteView cv; // Armazenar informações do usuário
    private LojistaView lv;
    private CadastroListener cadastroListener;
    private JTextField jTextField1; // Campo de login
    private JPasswordField jPasswordField1; // Campo de senha

    public interface CadastroListener {
        void onCadastroCompleted(Usuario user);
    }

    public void setCadastroListener(CadastroListener listener) {
        this.cadastroListener = listener;
    }

    public InterfacePrincipal() {
        initComponents();
    }

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {
        String login = jTextField1.getText();
        String senha = new String(jPasswordField1.getPassword());

        boolean loginSucesso = false;

        if (usuario instanceof Cliente) {
            loginSucesso = ((Cliente) usuario).login(senha, login);
        }

        if (loginSucesso) {
            cv = new ClienteView((Cliente) usuario);
        } else {
            JOptionPane.showMessageDialog(this, "Login ou senha incorretos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);
        cadastro.setCadastroListener(new Cadastro.CadastroListener() {
            @Override
            public void onCadastroCompleted(Usuario user) {
                usuario = user;
                JOptionPane.showMessageDialog(InterfacePrincipal.this, "Cadastro realizado com sucesso!");
            }
        });
    }

    private void openCarrinho() {
        CarrinhoView carrinhoView = new CarrinhoView();
        carrinhoView.setVisible(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfacePrincipal().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jTextField1 = new JTextField();
        jLabel3 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jLabel4 = new JLabel();
        jPasswordField1 = new JPasswordField();
        jButtonVendedor = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 0, 72));
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Loja Online");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24));
        jLabel2.setText("Login");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24));
        jLabel3.setText("Senha");

        jButton1.setText("Entrar");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        jButton2.setText("Cadastrar");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Magneto", 0, 18));
        jLabel4.setForeground(new java.awt.Color(0, 0, 252));
        jLabel4.setText("Explore, escolha, compre: sua loja online de variedades!");

        jButtonVendedor.setText("Vendedor");
        jButtonVendedor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonVendedorActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 454, GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(231, 231, 231)
                                .addComponent(jButton1)
                                .addGap(40, 40, 40)
                                .addComponent(jButton2))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(281, 281, 281)
                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(277, 277, 277)
                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(253, 253, 253)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField1, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                        .addComponent(jPasswordField1)))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 91, Short.MAX_VALUE)
                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 532, GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButtonVendedor)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButtonVendedor)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addContainerGap())
        );

        pack();
    }

    private void jButtonVendedorActionPerformed(java.awt.event.ActionEvent evt) {
        // Lógica para o botão "Vendedor"
        SwingUtilities.invokeLater(LojistaView::new);
    }

    public void onCadastroCompleted(Usuario user) {
        usuario = user;
    }

    private JButton jButton1;
    private JButton jButton2;
    private JButton jButtonVendedor;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
}
