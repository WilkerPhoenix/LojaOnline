package model;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private Estoque instance;
    public List<Produto> listaDeProdutos;

    //construtor privado para criar a instância única.
    private Estoque() {
        listaDeProdutos = new ArrayList<>();

    }

    public Estoque getInstance() {
        if (instance == null) {
            instance = new Estoque();
        }
        return instance;

    }


}
