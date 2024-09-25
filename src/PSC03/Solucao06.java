package PSC03;

import javax.swing.JOptionPane;

public class Solucao06 {

    public static void main(String[] args) {

        while (true) {
            double dNumero = Double.parseDouble(
                    JOptionPane.showInputDialog("Digite varios numeros, ou -999 para parar "));
            if (dNumero == -999) {
                break;

            }

            if (dNumero >= 0) {
                double dRaizQuadrada = Math.sqrt(dNumero);

                System.out.println("Raiz quadrada de " + dNumero + " " + dRaizQuadrada);

            } else {
                System.out.println("Calculo invalido, raiz quadrada de numero negativo.");
            }

            if (dNumero != 0) {
                double dInverso = 1 / dNumero;

                System.out.println("O inverso de " + dNumero + " " + dInverso);

            } else {
                System.out.println("nao é possivel calcular o  inverso de 0.");
            }

        }

    }
}