package view;

import model.Estoque;
import model.Produto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;



public class LojistaView {
    private JFrame frame;
    private JTextField nomeField;
    private JTextField precoField;
    private JTextField quantidadeField;
    private JTextArea listArea;
   // private ArrayList<Produto> produtos;
    private Estoque estoque;

    public LojistaView() {
        estoque = Estoque.getInstance();
        //produtos = (ArrayList<Produto>)estoque.listaDeProdutos;
        frame = new JFrame("Logista");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Create panel for form inputs
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2));

        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField();

        JLabel precoLabel = new JLabel("Preço:");
        precoField = new JTextField();

        JLabel quantidadeLabel = new JLabel("Quantidade em Estoque:");
        quantidadeField = new JTextField();

        JButton addButton = new JButton("Adicionar");

        inputPanel.add(nomeLabel);
        inputPanel.add(nomeField);
        inputPanel.add(precoLabel);
        inputPanel.add(precoField);
        inputPanel.add(quantidadeLabel);
        inputPanel.add(quantidadeField);
        inputPanel.add(addButton);

        // Create panel for displaying list
        listArea = new JTextArea();
        listArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(listArea);


        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                double preco = Double.parseDouble(precoField.getText());
                int quantidadeEstoque = Integer.parseInt(quantidadeField.getText());

                Produto produto = new Produto(nome, preco, quantidadeEstoque);
                estoque.add(produto);


                listArea.setText("");
                for (Produto p : estoque.listaDeProdutos) {
                    listArea.append(p.toString() + "\n");
                }

                // Clear input fields
                nomeField.setText("");
                precoField.setText("");
                quantidadeField.setText("");
            }
        });


        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);


        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LojistaView::new);
    }
}
