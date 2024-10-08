package domain;
public class Valor {
    private double tarifaBasica;
    private double tarifaBusiness;
    private double tarifaPremium;
    private double valorPrimeiraBagagem;
    private double valorBagagemAdicional;

    public Valor(double tarifaBasica, double tarifaBusiness, double tarifaPremium, double valorPrimeiraBagagem, double valorBagagemAdicional) {
        this.tarifaBasica = tarifaBasica;
        this.tarifaBusiness = tarifaBusiness;
        this.tarifaPremium = tarifaPremium;
        this.valorPrimeiraBagagem = valorPrimeiraBagagem;
        this.valorBagagemAdicional = valorBagagemAdicional;
    }

    public double getTarifaBasica() {
        return tarifaBasica;
    }

    public void setTarifaBasica(double tarifaBasica) {
        this.tarifaBasica = tarifaBasica;
    }

    public double getTarifaBusiness() {
        return tarifaBusiness;
    }

    public void setTarifaBusiness(double tarifaBusiness) {
        this.tarifaBusiness = tarifaBusiness;
    }

    public double getTarifaPremium() {
        return tarifaPremium;
    }

    public void setTarifaPremium(double tarifaPremium) {
        this.tarifaPremium = tarifaPremium;
    }

    public double getValorPrimeiraBagagem() {
        return valorPrimeiraBagagem;
    }

    public void setValorPrimeiraBagagem(double valorPrimeiraBagagem) {
        this.valorPrimeiraBagagem = valorPrimeiraBagagem;
    }

    public double getValorBagagemAdicional() {
        return valorBagagemAdicional;
    }

    public void setValorBagagemAdicional(double valorBagagemAdicional) {
        this.valorBagagemAdicional = valorBagagemAdicional;
    }

    public double calcularTarifaTotal(int tipoTarifa, int quantidadeBagagens) {
        double tarifa = 0.0;
        switch (tipoTarifa) {
            case 1:
                tarifa = tarifaBasica;
                break;
            case 2:
                tarifa = tarifaBusiness;
                break;
            case 3:
                tarifa = tarifaPremium;
                break;
            default:
                System.out.println("Tipo de tarifa inválido!");
                return 0.0;
        }

        tarifa += valorPrimeiraBagagem;

        if (quantidadeBagagens > 1) {
            tarifa += (quantidadeBagagens - 1) * valorBagagemAdicional;
        }

        return tarifa;
    }
}
