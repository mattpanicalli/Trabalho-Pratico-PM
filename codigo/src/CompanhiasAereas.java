public class CompanhiasAereas  {
    private String nome;
    private String cnpj;
    private String email;
    private String bagagem;
    private boolean bagagemAdicional;

    public CompanhiasAereas(String nome, String cnpj, String email) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.email = email;
        this.bagagem = bagagem;
        this.bagagemAdicional = bagagemAdicional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
    
    public String getBagagem() {
        return bagagem;
    }

    public void setBagagem(String bagagem) {
        this.bagagem = bagagem;
    }

    public boolean isBagagemAdicional() {
        return bagagemAdicional;
    }

    public void setBagagemAdicional(boolean bagagemAdicional) {
        this.bagagemAdicional = bagagemAdicional;
    }

}
