package PSC02;

import javax.swing.JOptionPane;

public class Solucao08 {
    public static void main(String[] args) {

        int iNum1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        int iNum2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero: "));

        if (iNum1 > iNum2) {
            System.out.println(iNum1);

        } else if (iNum2 > iNum1) {
            System.out.println(iNum2);
        }

    }
}
