package PSC07.EX2;

public class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double perimetro() {
        return 2 * (largura + altura);

    }

    public double area() {
        return largura * largura;
    }
}
