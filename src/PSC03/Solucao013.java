package PSC03;

import javax.swing.JOptionPane;

public class Solucao013 {

    public static void main(String[] args) {

        while (true) {
            boolean bPrimo = true;
            int iNumero = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite um numero para saber se ele é numero primo"));

            if (iNumero <= 1) {
                bPrimo = false;
            } else {
                for (int i = 2; i < iNumero; i++) {
                    if (iNumero % i == 0) {
                        bPrimo = false;
                        break;
                    }
                }
            }

            if (bPrimo) {
                System.out.println(" é um numero primo.");

            } else {
                System.out.println(" Nao é um numero primo.");
            }

        }

    }
}

