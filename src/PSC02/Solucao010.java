package PSC02;

import javax.swing.JOptionPane;

public class Solucao010 {
    public static void main(String[] args) {

        int iNum1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

        if (iNum1 % 5 == 0) {
            System.out.println(iNum1 + " é divisivel 5.");

        } else {

            System.out.println("O numero nao é divisivel 5.");
        }

    }
}
