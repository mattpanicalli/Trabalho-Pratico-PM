public class Passagem {
    private Passageiro passageiro;
    private Voo voo;
    private int assento;
    private boolean cancelada;

    public Passagem(Passageiro passageiro, Voo voo, int assento) {
        this.passageiro = passageiro;
        this.voo = voo;
        this.assento = assento;
        this.cancelada = false;
        voo.adicionarPassagem(this);
        passageiro.adicionarPassagem(this);
    }

    public void cancelar() {
        System.out.println("Cancelando passagem do passageiro " + passageiro.getNome() + " para o voo " + voo.getCodigo());
        this.cancelada = true;
        voo.liberarAssento(assento);
    }

    public void remarcar(Voo novoVoo, int novoAssento) {
        if (novoVoo.isAssentoDisponivel(novoAssento)) {
            System.out.println("Remarcando passagem para o passageiro " + passageiro.getNome() + " no novo voo " + novoVoo.getCodigo());
            this.voo = novoVoo;
            this.assento = novoAssento;
            this.cancelada = false;
            novoVoo.adicionarPassagem(this);
        } else {
            System.out.println("Assento " + novoAssento + " não disponível no voo " + novoVoo.getCodigo());
        }
    }

    public boolean isCancelada() {
        return cancelada;
    }

    public Voo getVoo() {
        return voo;
    }

    public int getAssento() {
        return assento;
    }
}
