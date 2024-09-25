package domain;
import java.time.LocalDate;
import java.util.List;

public class Passagem extends Voo {
    private String moeda;
    private List<Valor> valores;

    public Passagem(String codigoVoo, String aeroportoOrigem, String aeroportoDestino, LocalDate dataHoraVoo, String conexao, CompanhiaAerea companhiasAereas, String moeda, List<Valor> valores) {
        super(codigoVoo, aeroportoOrigem, aeroportoDestino, dataHoraVoo, conexao, companhiasAereas);
        this.moeda = moeda;
        this.valores = valores;
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
        System.out.println("Voo: " + getCodigoVoo());
        System.out.println("Aeroporto de Origem: " + getAeroportoOrigem());
        System.out.println("Aeroporto de Destino: " + getAeroportoDestino());
        System.out.println("Data e Hora: " + getDataHoraVoo());
        System.out.println("Companhia Aérea: " + getCompanhiaAerea().getNome());
        System.out.println("Moeda: " + moeda);
    }
}
