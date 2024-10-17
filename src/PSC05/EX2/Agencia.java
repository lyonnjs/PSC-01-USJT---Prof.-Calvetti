package PSC05.EX2;

public class Agencia {
    private String nome;
    private int numero;
    private int digito;

    public Agencia(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
        this.digito = CalcularDigito(numero);
        

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDigito() {
        return digito;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }

    private int CalcularDigito(int i){

        int i4 = i % 10;
        int mult4 = i4 * 2;
        
        int i3 = (i / 10) % 10;
        int mult3 = i3 * 8;

        int i2 = (i / 100) % 10;
        int mult2 = i2 * 6;

        int i1 = i / 1000;
        int numero1 = i1 % 10;
        int mult1 = numero1 * 4;

        int soma = mult1 + mult2 + mult3 + mult4;
        int digito = soma % 11;

        if (digito == 10){
            digito = 0;
        }
        return digito;
    
        
    }

    @Override
    public String toString() {
        return "Agencia [nome= " + nome + "\nnumero=" + numero + "\ndigito= " + digito + "]";
    }

    
}