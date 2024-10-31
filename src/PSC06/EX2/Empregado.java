package PSC06.EX2;

public class Empregado extends PessoaFisica {
    private String nome; 
    

    public Empregado(String nome, String sobrenome, String cpf){
        super(nome, sobrenome, cpf);
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double salario(){
        return 0.0;
    }
}
