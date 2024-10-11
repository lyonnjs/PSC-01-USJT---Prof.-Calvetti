package PSC04.EX2;

public class Produto {
    private String Snome;
    private double dPreço;
    private int iQuantidade;
    
    public Produto(String n,double p, int q){
        this.Snome = n;
        this.dPreço = p;
        this.iQuantidade = q;

    }

    public String getSnome() {
        return Snome;
    }

    public void setSnome(String snome) {
        Snome = snome;
    }

    public double getdPreço() {
        return dPreço;
    }

    public void setdPreço(double dPreço) {
        this.dPreço = dPreço;
    }

    public int getiQuantidade() {
        return iQuantidade;
    }

    public void setiQuantidade(int iQuantidade) {
        this.iQuantidade = iQuantidade;
    }



}
