public class Juros {

    private double quantia_original, taxa_anual, quantia_deposito;
    private int numero_anos;

    public void setQuantiaOriginal(double quantia) {
        this.quantia_original = quantia;
    }

    public double getQuantiaOriginal() {
        return this.quantia_original;
    }

    public void setTaxaAnual(double taxa) {
        this.taxa_anual = taxa / 100;
    }

    public double getTaxaAnual() {
        return this.taxa_anual;
    }

    public void setNumeroAnos(int anos) {
        this.numero_anos = anos;
    }

    public int getNumeroAnos() {
        return this.numero_anos;
    }

    public double calcularQuantiaDeposito() {
        this.quantia_deposito = this.quantia_original * Math.pow((1 + this.taxa_anual), this.numero_anos);
        return this.quantia_deposito;
    }
}