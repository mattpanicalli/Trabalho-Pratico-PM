public class CadastroDeCompanhiasAereas extends Cadastro {
    private String cnpj;
    private String email;

    public CadastroDeCompanhiasAereas(String nome, String cnpj, String email) {
        super(nome);
        this.cnpj = cnpj;
        this.email = email;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
}
