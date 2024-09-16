public class CadastroAeroporto extends Cadastro {
    private static String sigla;
    private String cidade;
    private String estado;
    private String pais;

    public CadastroAeroporto(String nome, String sigla, String cidade, String estado, String pais) {
        super(nome);
        this.sigla = sigla;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public static String getSigla() {
        return sigla;
    }
    public static void setSigla(String sigla) {
        CadastroAeroporto.sigla = sigla;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
}
