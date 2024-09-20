public class TipoPassagen {
    private String tipoPassagem;

    public TipoPassagen(String tipoPassagem) {
        this.tipoPassagem = tipoPassagem;
    }

    public String getTipoPassagem() {
        return tipoPassagem;
    }

    public void setTipoPassagem(String tipoPassagem) {
        this.tipoPassagem = tipoPassagem;
    }

    public void validaTipoPassagem(String getAeroportoOrigem, String getAeroportoDestino, String tipoPassagem) {
        if (getAeroportoDestino.equals(getAeroportoOrigem) && tipoPassagem.equals("Ida e Volta")) {
            System.out.println("Não é possível comprar passagem de ida e volta para o mesmo destino");
        } else {
            System.out.println("Passagem comprada com sucesso");
        }
        
    }

    public boolean validaVooInternacional(String aeroportoOrigem, String aeroportoDestino) {
        String paisOrigem = aeroportoOrigem.substring(0, 2);
        String paisDestino = aeroportoDestino.substring(0, 2);

        return !paisOrigem.equals(paisDestino);
    }
}
