package model;
//Classe criada para testar o usuario, considerando que usuario é uma classe abstract
public class UsuarioConcreto extends Usuario {
    private boolean autenticado;

    public UsuarioConcreto(String nome, String login, String senha) {
        this.setNome(nome);
        this.setLogin(login);
        this.setSenha(senha);
        this.autenticado = false;
    }

    @Override
    public void login() {
        if ("senhaCerta".equals(this.getSenha())) {
            this.autenticado = true;
        } else {
            this.autenticado = false;
        }
    }

    public boolean isAutenticado() {
        return autenticado;
    }
}
