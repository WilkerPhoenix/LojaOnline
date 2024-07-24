package view;

import model.Cliente;
import model.Produto;

import javax.swing.*;
import java.awt.*;

public class ClienteView {
    JFrame frame = new JFrame("Cliente");
    JList<Produto> listCarrinho;
    //adicioanr o cliente no login
    Cliente cliente;

    DefaultListModel<Produto> model = new DefaultListModel<>();
    JLabel label = new JLabel();
    JPanel panel = new JPanel();
    JSplitPane splitPane = new JSplitPane();
    JPanel labelPanel = new JPanel();
    JButton panelButton = new JButton();

public ClienteView(){

    listCarrinho =
    Produto p1 = new Produto("Celular", 2000, 6);
    Produto p2 = new Produto("Camisa", 25, 30);
    model.addElement(p1);
    model.addElement(p2);


    listCarrinho.getSelectionModel().addListSelectionListener(e ->{

        Produto p = listCarrinho.getSelectedValue();
        label.setText(new StringBuilder().append("Nome: ").append(p.getNome()).append("\n").append("    Preço: R$ ").append(p.getPreco()).append("\n").append("     Quantidade: ").append(p.getQuantidadeEstoque()).toString());

        //label.setText("Nome:"+p.getNome()+"Preço: R$"+p.getPreco()+"Quantidade:"+p.getQuantidadeEstoque());




    });

    listCarrinho.setModel(model);
    label.setForeground(Color.BLUE);
    label.add(labelPanel);
    labelPanel.setVisible(true);
    labelPanel.add(panelButton);

    splitPane.setLeftComponent(new JScrollPane(listCarrinho));
    panel.add(label);



    label.setFont(new Font("Sans-setif", Font.BOLD, 15));
    splitPane.setRightComponent(panel);


    frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    frame.add(splitPane);
    frame.setSize(500,400);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);


}




}
