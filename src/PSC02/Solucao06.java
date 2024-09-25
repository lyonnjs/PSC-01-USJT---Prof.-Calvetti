package PSC02;

import javax.swing.JOptionPane;

public class Solucao06 {
    public static void main(String[] args) {

        int iNum1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

        if (iNum1 < 20) {
            System.out.println("O numero é menor do que 20: ");

        } else if (iNum1 == 20) {
            System.out.println("O numero é igual a 20: ");
        }

        else {
            System.out.println("O numero é maior do que 20: ");

        }

    }
}