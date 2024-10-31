package PSC06.EX2;

public class Horista extends Empregado {
    private double salario;

    public Horista(String nome, String sobrenome, String cpf, double salario){
        super(nome, sobrenome, cpf);
        this.salario = salario;
}
}