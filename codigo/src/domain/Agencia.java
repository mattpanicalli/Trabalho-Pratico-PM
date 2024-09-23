package domain;
public class Agencia {
    private static double taxaFixaPassagens;

    public Agencia(double taxaFixaPassagens) {
        Agencia.taxaFixaPassagens = taxaFixaPassagens;
    }

    public static double getTaxaFaxaPassgens() {
        return taxaFixaPassagens;
    }

    public static void setTaxaFaxaPassgens(double taxaFixaPassagens) {
        Agencia.taxaFixaPassagens = taxaFixaPassagens;
    }
}
