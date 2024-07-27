package model;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class CarrinhoTableModel extends AbstractTableModel {
    private final List<Produto> produtos;
    private final String[] colunas = {"Produto", "Quantidade", "Preço"};

    public CarrinhoTableModel(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public int getRowCount() {
        return produtos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produto = produtos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return produto.getNome();
            case 1:
                return produto.getQuantidadeEstoque();
            case 2:
                return produto.getPreco();
        }
        return null;
    }
}
