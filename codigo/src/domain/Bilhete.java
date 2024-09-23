package domain;
public class Bilhete {
    private String nome;
    private String ultimoSobrenome;
    private String documento;
    private double valorFinal;
    private String tipoVoo;

    public Bilhete(String nome, String ultimoSobrenome, String documento, double valorFinal, String tipoVoo) {
        this.nome = nome;
        this.ultimoSobrenome = ultimoSobrenome;
        this.documento = documento;
        this.valorFinal = valorFinal;
        this.tipoVoo = tipoVoo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUltimoSobrenome() {
        return ultimoSobrenome;
    }

    public void setUltimoSobrenome(String ultimoSobrenome) {
        this.ultimoSobrenome = ultimoSobrenome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public String getTipoVoo() {
        return tipoVoo;
    }

    public void setTipoVoo(String tipoVoo) {
        this.tipoVoo = tipoVoo;
    }

    private boolean validarDocumento() {
        if (tipoVoo.equalsIgnoreCase("domestico")) {
            return documento.matches("\\d{9}") || documento.matches("\\d{11}");
        }
        else if (tipoVoo.equalsIgnoreCase("internacional")) {
            return documento.matches("[A-Z]{2}\\d{6}");
        }
        return false;
    }

    public void emissaoBilhete() {
        if (validarDocumento()) {
            System.out.println("Bilhete emitido com sucesso para: " + nome + " " + ultimoSobrenome);
            System.out.println("Documento: " + documento);
            System.out.println("Valor final: R$" + valorFinal);
        } else {
            System.out.println("Erro: Documento inválido para o tipo de voo " + tipoVoo + ".");
        }
    }
}
