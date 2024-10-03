package PSC03PT2;

import javax.swing.JOptionPane;

public class Solucao022 {

    public static void main(String[] args) {

        int iLimite = Integer.parseInt(JOptionPane.showInputDialog("Escolha um numero limite: "));

        for (int i = 2; i <= iLimite; i++) {
            boolean bPrimo = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    bPrimo = false;
                    break;
                }

            }

            if (bPrimo) {
                System.out.println(i + " ");
            }

        }

    }

}
