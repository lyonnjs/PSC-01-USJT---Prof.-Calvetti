package PSC05.EX2;

public class Cliente {
    private String nome;
    private String cpf;
    private ContaCorrente conta;


    public Cliente(String n, String c, ContaCorrente cc){
        this.nome = n;
        this. cpf = c;
        this.conta = cc;

        
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public ContaCorrente getConta() {
        return conta;
    }


    public void setConta(ContaCorrente conta) {
        this.conta = conta;
    }


    @Override
    public String toString() {
        return "Cliente [nome= " + nome + "\ncpf= " + cpf + "\nconta= " + conta + "]";
    }

    
}
