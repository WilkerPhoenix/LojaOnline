package model;

public class Cliente extends Usuario {
    private boolean autenticado;

    public Cliente(String nome, String login, String senha) {
        this.setNome(nome);
        this.setLogin(login);
        this.setSenha(senha);
        this.autenticado = false;
    }
    @Override
    public void login() {
        this.getSenha();
    }

    public boolean isAutenticado() {
        return true;
    }
}

