public class Usuario extends Funcionario {
    private String login;
    private String senha;
    
    public Usuario(String nome, String cpf, String email, String login, String senha) {
        super(nome, cpf, email);
        this.login = login;
        this.senha = senha;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    

}
    

