package PSC02;

import javax.swing.JOptionPane;

public class Solucao012 {
    public static void main(String[] args) {

        int iNum1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

        if (iNum1 % 10 == 0 && iNum1 % 5 == 0 && iNum1 % 2 == 0) {
            System.out.println(iNum1 + " é divisível por 10, por 5, por 2.");

        } else {

            System.out.println("O numero nao é é divisível por 10, por 5, por 2.");
        }

    }
}
