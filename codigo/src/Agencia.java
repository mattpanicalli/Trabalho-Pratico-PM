public class Agencia {
    private static double taxaFaxaPassgens;

    public Agencia(double taxaFaxaPassgens) {
        this.taxaFaxaPassgens = taxaFaxaPassgens;
    }

    public static double getTaxaFaxaPassgens() {
        return taxaFaxaPassgens;
    }

    public static void setTaxaFaxaPassgens(double taxaFaxaPassgens) {
        Agencia.taxaFaxaPassgens = taxaFaxaPassgens;
    }
}
