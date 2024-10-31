package PSC06.EX2;

public class Tarefeiro extends Empregado {
    private double salario;

    public Tarefeiro(String nome, String sobrenome, String cpf, double salario){
        super(nome, sobrenome, cpf);
        this.salario = salario;
    }
}