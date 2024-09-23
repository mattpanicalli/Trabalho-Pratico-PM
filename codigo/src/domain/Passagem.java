package domain;
import java.time.LocalDate;
import java.util.List;

public class Passagem {
    private String codigoVoo;
    private String aeroportoOrigem;
    private String aeroportoDestino;
    private LocalDate dataHoraVoo;
    private String conexao;
    private CompanhiaAerea companhiasAereas;
    private String moeda;
    private List<Valor> valores;

    public Passagem(String codigoVoo, String aeroportoOrigem, String aeroportoDestino, 
    LocalDate dataHoraVoo, String conexao, CompanhiaAerea companhiasAereas, String moeda,
    List<Valor> valores) {
        this.codigoVoo = codigoVoo;
        this.aeroportoOrigem = aeroportoOrigem;
        this.aeroportoDestino = aeroportoDestino;
        this.dataHoraVoo = dataHoraVoo;
        this.conexao = conexao;
        this.companhiasAereas = companhiasAereas;
        this.moeda = moeda;
        this.valores = valores;
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

    public CompanhiaAerea getCompanhiaAerea() {
        return companhiasAereas;
    }

    public void setCompanhiaAerea(CompanhiaAerea companhiasAereas) {
        this.companhiasAereas = companhiasAereas;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public List<Valor> getValores() {
        return valores;
    }

    public void setValores(List<Valor> valores) {
        this.valores = valores;
    }

    public void calcularPrecoFinal(String tipoPassagem, double precoPassagem) {
        double precoFinal = 0;
        if (tipoPassagem.equals("Ida e Volta")) {
            precoFinal = precoPassagem * 2;
        } else {
            precoFinal = precoPassagem;
        }
        System.out.println("Preço final da passagem: " + precoFinal);
    } 

    public static double calcularTarifaTotalComVoos(List<Valor> valores, int tipoTarifa, int quantidadeBagagens) {
        double tarifaTotal = 0.0;
        for (Valor valor : valores) {
            tarifaTotal += valor.calcularTarifaTotal(tipoTarifa, quantidadeBagagens);
        }
        return tarifaTotal;
    }

    public void exibirDetalhesPassagem() {
        System.out.println("Voo: " + codigoVoo);
        System.out.println("Aeroporto de Origem: " + aeroportoOrigem);
        System.out.println("Aeroporto de Destino: " + aeroportoDestino);
        System.out.println("Data e Hora: " + dataHoraVoo);
        System.out.println("Companhia Aérea: " + companhiasAereas.getNome());
        System.out.println("Moeda: " + moeda);
    }

}
