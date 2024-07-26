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
    public boolean login(String senha, String login) {
        if (this.getLogin().equals(login) && this.getSenha().equals(senha)) {
            this.autenticado = true;
        } else {
            this.autenticado = false;
        }
        return this.autenticado;
    }

    public boolean isAutenticado() {
        return this.autenticado;
    }
}
