package PSC02;

import javax.swing.JOptionPane;

public class Solucao018 {
    public static void main(String[] args) {

        int iNum1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        int iNum2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero: "));

        if (iNum1 > iNum2 || iNum2 < iNum1) {
            System.out.println(iNum1 + " " + iNum2);

        } else

        {
            System.out.println(iNum2 + " " + iNum1);
        }

    }
}
