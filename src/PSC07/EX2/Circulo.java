package PSC07.EX2;

public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double perimetro() {
        return 2 * Math.PI * raio;

    }

    public double area() {
        return Math.PI * raio * raio;
    }
}
