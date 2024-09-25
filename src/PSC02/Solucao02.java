package PSC02;

import javax.swing.JOptionPane;

public class Solucao02 {
    public static void main(String[] args) {

        int iNum1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        int iNum2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

        int iresult = iNum1 + iNum2 - 5;

        if (iresult <= 20) {
            System.out.println(iresult);

        } else {
            System.out.println("O numero é maior que 20");

        }

    }
}
