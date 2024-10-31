package PSC06.EX2;

public class Desempregado extends PessoaFisica {
    private double seguroDesemprego; 


    public Desempregado(){
        this.seguroDesemprego = 0.0;   
    }

    public Desempregado(double seguroDesemprego, String nome, String sobrenome, String cpf){
        super(nome, sobrenome, cpf);
        this.seguroDesemprego = seguroDesemprego;
    }

    public double getSeguroDesemprego() {
        return seguroDesemprego;
    }

    public void setSeguroDesemprego(double seguroDesemprego) {
        this.seguroDesemprego = seguroDesemprego;
    }
    
    public String dados(){
        return super.dados()+ " " + getSeguroDesemprego();
    }
}
