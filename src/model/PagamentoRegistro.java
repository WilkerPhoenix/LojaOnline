package model;

import java.util.ArrayList;
import java.util.List;

public class PagamentoRegistro {
    private List<String> registros;

    public PagamentoRegistro() {
        this.registros = new ArrayList<>();
    }

    public void adicionarRegistro(String registro) {
        registros.add(registro);
    }

    public List<String> getRegistros() {
        return registros;
    }
}
