import java.util.ArrayList;
import java.util.List;

public class Voo {
    private String codigo;
    private boolean cancelado;
    private List<Passagem> passagensEmitidas;
    private List<Integer> assentosOcupados;

    public Voo(String codigo) {
        this.codigo = codigo;
        this.cancelado = false;
        this.passagensEmitidas = new ArrayList<>();
        this.assentosOcupados = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void adicionarPassagem(Passagem passagem) {
        passagensEmitidas.add(passagem);
        assentosOcupados.add(passagem.getAssento());
    }

    public void cancelarVoo() {
        System.out.println("Cancelando voo: " + codigo);
        this.cancelado = true;
        for (Passagem passagem : passagensEmitidas) {
            passagem.cancelar();
            liberarAssento(passagem.getAssento());
        }
    }

    public void liberarAssento(int assento) {
        assentosOcupados.remove(Integer.valueOf(assento));
        System.out.println("Assento " + assento + " liberado para novas marcações.");
    }

    public boolean isAssentoDisponivel(int assento) {
        return !assentosOcupados.contains(assento);
    }
}
