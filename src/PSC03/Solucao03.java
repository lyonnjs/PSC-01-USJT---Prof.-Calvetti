package PSC03;

import javax.swing.JOptionPane;

public class Solucao03 {

    public static void main(String[] args) {

        int iContador = 0;
        double dSoma = 0;

        while (true) {
            double dNumero = Double.parseDouble(
                    JOptionPane.showInputDialog("Digite varios numeros positivos, ou um numero negativo para parar "));
            if (dNumero < 0) {
                break;

            }

            dSoma += dNumero;
            iContador++;
        }

        if (iContador > 0) {

            double dMedia = dSoma / iContador;

            System.out.println("A media dos numeros digitado é: " + dMedia);

        }

    }

}
