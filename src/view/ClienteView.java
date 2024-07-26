package view;

import model.Cadastro;
import model.Cliente;
import model.Estoque;
import model.Produto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ClienteView {
    private JFrame frame;
    private Estoque estoque;
    private JList<Produto> listProdutos;
    private List<Produto> listCarrinho;
    private Cliente cliente;
    private DefaultListModel<Produto> model;
    private JLabel label;
    private JPanel panel;
    private JSplitPane splitPane;
    private JButton panelButton;

    public ClienteView(Cliente cliente) {
        this.cliente = cliente;
        this.listCarrinho = new ArrayList<>();
        this.estoque = Estoque.getInstance();
        Produto produto2 = new Produto("Camisa", 12, 3);
        estoque.add(produto2);
        frame = new JFrame("Cliente");
        model = new DefaultListModel<>();
        listProdutos = new JList<>(model);
        label = new JLabel();
        panel = new JPanel();
        splitPane = new JSplitPane();
        panelButton = new JButton("Adicionar ao Carrinho");

        for (Produto produto : estoque.listaDeProdutos) {
            model.addElement(produto);
        }

        listProdutos.getSelectionModel().addListSelectionListener(e -> {
            Produto p = listProdutos.getSelectedValue();
            if (p != null) {
                label.setText(new StringBuilder()
                        .append("<html>")
                        .append("Nome: ").append(p.getNome()).append("<br>")
                        .append("Preço: R$ ").append(p.getPreco()).append("<br>")
                        .append("Quantidade: ").append(p.getQuantidadeEstoque())
                        .append("</html>")
                        .toString());
            }
        });

        panel.setLayout(new BorderLayout());
        panel.add(label, BorderLayout.NORTH);
        panel.add(panelButton, BorderLayout.SOUTH);

        panelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Produto selectedProduct = listProdutos.getSelectedValue();
                if (selectedProduct != null) {
                    listCarrinho.add(selectedProduct);
                    JOptionPane.showMessageDialog(frame, selectedProduct.getNome() + " adicionado ao carrinho.");
                } else {
                    JOptionPane.showMessageDialog(frame, "Nenhum produto selecionado.");
                }
            }
        });

        splitPane.setLeftComponent(new JScrollPane(listProdutos));
        splitPane.setRightComponent(panel);

        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.add(splitPane);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            Cliente cliente = new Cliente("joao", "joao", "1234");

            public void run() {
                new ClienteView(cliente);
            }
        });
    }
}
