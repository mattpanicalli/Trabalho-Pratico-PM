package domain;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class Voo {
    private String codigoVoo;
    private String aeroportoOrigem;
    private String aeroportoDestino;
    private LocalDate dataHoraVoo;
    private String conexao;
    private CompanhiaAerea companhiasAereas;

    public Voo(String codigoVoo, String aeroportoOrigem, String aeroportoDestino, LocalDate dataHoraVoo, String conexao, CompanhiaAerea companhiasAereas) {
        this.codigoVoo = codigoVoo;
        this.aeroportoOrigem = aeroportoOrigem;
        this.aeroportoDestino = aeroportoDestino;
        this.dataHoraVoo = dataHoraVoo;
        this.conexao = conexao;
        this.companhiasAereas = companhiasAereas;
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

    public Optional<String> pesquisaVoo(String origem, String destino, LocalDate data) {
        
        if (aeroportoOrigem.equalsIgnoreCase(origem) && aeroportoDestino.equalsIgnoreCase(destino) && dataHoraVoo.equals(data)) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String dataFormatada = dataHoraVoo.format(formatter);
            return Optional.of(String.format("Voo %s de %s para %s na data %s", codigoVoo, aeroportoOrigem, aeroportoDestino, dataFormatada));
        }

        return Optional.empty();
    }
   
}
