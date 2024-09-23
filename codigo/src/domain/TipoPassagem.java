package domain;
public class TipoPassagem {
    private String tipoPassagem;

    public TipoPassagem(String tipoPassagem) {
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

    public boolean validaVooInternacional(String paisOrigem, String paisDestino) {
        boolean vooInternacional = !paisOrigem.equalsIgnoreCase(paisDestino);
        
        if (vooInternacional) {
            System.out.println("Voo internacional: valor deve ser mantido em dólares.");
        } else {
            System.out.println("Voo doméstico: valor pode estar em moeda local.");
        }
        
        return vooInternacional;
    }


}
