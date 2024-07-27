package view;

import model.*;

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
    private JButton panelButton2;

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
        panelButton2 = new JButton("Ver carrinho");

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
        panel.add(panelButton, BorderLayout.CENTER);
        panel.add(panelButton2, BorderLayout.SOUTH);

        panelButton.addActionListener(e -> {
            Produto selectedProduct = listProdutos.getSelectedValue();
            if (selectedProduct != null) {
                listCarrinho.add(selectedProduct);
                JOptionPane.showMessageDialog(frame, selectedProduct.getNome() + " adicionado ao carrinho.");
            } else {
                JOptionPane.showMessageDialog(frame, "Nenhum produto selecionado.");
            }
        });

        panelButton2.addActionListener(e -> mostrarCarrinho());

        splitPane.setLeftComponent(new JScrollPane(listProdutos));
        splitPane.setRightComponent(panel);

        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.add(splitPane);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void mostrarCarrinho() {
        CarrinhoTela carrinhoTela = new CarrinhoTela(listCarrinho);
        carrinhoTela.setVisible(true);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            Cliente cliente = new Cliente("joao", "joao", "1234");
            new ClienteView(cliente);
        });
    }
}
