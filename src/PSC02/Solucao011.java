package PSC02;

import javax.swing.JOptionPane;

public class Solucao011 {
    public static void main(String[] args) {

        int iNum1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

        if (iNum1 % 3 == 0 && iNum1 % 7 == 0) {
            System.out.println(iNum1 + " é divisivel por 3 e por 7.");

        } else {

            System.out.println("O numero nao é divisivel nem por 3 nem por 7.");
        }

    }
}
