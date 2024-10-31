public class Cheque extends Pagamento {
    private String numeroDoCheque;

    public Cheque(String nome, String cpf, double valorASerPago, String numeroDoCheque){
        super(nome, cpf, valorASerPago);
        this.numeroDoCheque = numeroDoCheque;
}

    public String getNumeroDoCheque() {
        return numeroDoCheque;
    }

    public void setNumeroDoCheque(String numeroDoCheque) {
        this.numeroDoCheque = numeroDoCheque;
    }

}
