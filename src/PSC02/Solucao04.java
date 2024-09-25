package PSC02;

import javax.swing.JOptionPane;

public class Solucao04 {
    public static void main(String[] args) {

        int iNum1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        int iNum2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        int iNum3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

        if (iNum1 > iNum2 && iNum1 > iNum3 && iNum2 > iNum3) {
            System.out.println(iNum1 + " " + iNum2 + " " + iNum3);

        } else if (iNum2 > iNum1 && iNum2 > iNum3 && iNum1 > iNum3) {

            System.out.println(iNum2 + " " + iNum1 + " " + iNum3);

        } else {

            System.out.println(iNum3 + " " + iNum1 + " " + iNum2);
        }

    }
}