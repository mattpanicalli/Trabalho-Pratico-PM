import java.util.ArrayList;
import java.util.List;

public class Passageiro {
    private String nome;
    private List<Passagem> passagens;
    private List<Reserva> reservas;

    public Passageiro(String nome) {
        this.nome = nome;
        this.passagens = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void adicionarPassagem(Passagem passagem) {
        passagens.add(passagem);
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void cancelarTodasAsPassagens() {
        for (Passagem passagem : passagens) {
            passagem.cancelar();
        }
    }

    public List<Passagem> getPassagens() {
        return passagens;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public String getNome() {
        return nome;
    }
}
