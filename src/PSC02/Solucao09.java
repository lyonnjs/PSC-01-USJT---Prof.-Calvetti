package PSC02;

import javax.swing.JOptionPane;

public class Solucao09 {
    public static void main(String[] args) {

        int iNum1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

        if (iNum1 % 3 == 0) {
            System.out.println(iNum1 + " é multiplo de 3.");

        } else {

            System.out.println("O numero nao é multiplo de 3.");
        }

    }
}
