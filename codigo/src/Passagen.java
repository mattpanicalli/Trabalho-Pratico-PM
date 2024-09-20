import java.time.LocalDate;

public class Passagen {
    private String codigoVoo;
    private String aeroportoOrigem;
    private String aeroportoDestino;
    private LocalDate dataHoraVoo;
    private String conexao;
    private String companhiaAerea;

    public Passagen(String codigoVoo, String aeroportoOrigem, String aeroportoDestino, LocalDate dataHoraVoo, String conexao, String companhiaAerea) {
        this.codigoVoo = codigoVoo;
        this.aeroportoOrigem = aeroportoOrigem;
        this.aeroportoDestino = aeroportoDestino;
        this.dataHoraVoo = dataHoraVoo;
        this.conexao = conexao;
        this.companhiaAerea = companhiaAerea;
    }

    public String getCodigoVoo() {
        return codigoVoo;
    }

    public void setCodigoVoo(String codigoVoo) {
        this.codigoVoo = codigoVoo;
    }

    public String getAeroportoOrigem() {
        return aeroportoOrigem;
    }

    public void setAeroportoOrigem(String aeroportoOrigem) {
        this.aeroportoOrigem = aeroportoOrigem;
    }

    public String getAeroportoDestino() {
        return aeroportoDestino;
    }

    public void setAeroportoDestino(String aeroportoDestino) {
        this.aeroportoDestino = aeroportoDestino;
    }

    public LocalDate getDataHoraVoo() {
        return dataHoraVoo;
    }

    public void setDataHoraVoo(LocalDate dataHoraVoo) {
        this.dataHoraVoo = dataHoraVoo;
    }

    public String getConexao() {
        return conexao;
    }

    public void setConexao(String conexao) {
        this.conexao = conexao;
    }

    public String getCompanhiaAerea() {
        return companhiaAerea;
    }

    public void setCompanhiaAerea(String companhiaAerea) {
        this.companhiaAerea = companhiaAerea;
    }

    /* public void calcularPrecoFinal(String tipoPassagem, double precoPassagem) {
        double precoFinal = 0;
        if (tipoPassagem.equals("Ida e Volta")) {
            precoFinal = precoPassagem * 2;
        } else {
            precoFinal = precoPassagem;
        }
        System.out.println("Preço final da passagem: " + precoFinal);
    } */

}
