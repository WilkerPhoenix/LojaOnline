package model;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private static Estoque instance;
    public List<Produto> listaDeProdutos = new ArrayList<>();


    private Estoque() {
    }


    public static synchronized Estoque getInstance() {
        if (instance == null) {
            instance = new Estoque();
        }
        return instance;
    }

    public void add(Produto produto) {
        listaDeProdutos.add(produto);
    }
}
