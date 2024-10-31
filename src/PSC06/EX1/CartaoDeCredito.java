public class CartaoDeCredito extends Pagamento{
    private String numeroDoCartao;
    
    
    public CartaoDeCredito(String nome, String cpf, double valorASerPago, String numeroDoCartao){
        super(nome, cpf, valorASerPago);
        this.numeroDoCartao = numeroDoCartao;
    }

    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    } 
}
