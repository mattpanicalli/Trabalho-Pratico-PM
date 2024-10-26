reserva: public class Reserva {
    private Passageiro passageiro;
    private Voo voo;

    public Reserva(Passageiro passageiro, Voo voo) {
        this.passageiro = passageiro;
        this.voo = voo;
        passageiro.adicionarReserva(this);
    }

    public void remarcarVoo(Voo novoVoo) {
        System.out.println("Remarcando reserva do passageiro " + passageiro.getNome() + " para o voo " + novoVoo.getCodigo());
        this.voo = novoVoo;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public Voo getVoo() {
        return voo;
    }
}
