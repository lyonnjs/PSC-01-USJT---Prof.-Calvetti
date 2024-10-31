package PSC06.EX2;

public class PessoaFisica {
    private String nome; 
    private String sobrenome;
    private String cpf;

    public PessoaFisica(){
        this.nome = "Lucas";
        this.sobrenome = "Silva";
        this.cpf = "554.342.211-12";
        
    }

    public PessoaFisica(String nome, String sobrenome, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;

    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String dados(){
        return getNome() + " " + getSobrenome()+ " " + getCpf();
    }


}
