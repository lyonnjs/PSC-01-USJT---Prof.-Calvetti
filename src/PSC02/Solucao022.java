package PSC02;

import javax.swing.JOptionPane;

public class Solucao022 {
    public static void main(String[] args) {

        int iNum1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        int iNum2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero: "));
        int iNum3 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero: "));

        if (iNum1 > iNum2 && iNum1 > iNum3 && iNum2 > iNum3) {
            int iMaiorNumero = iNum1;
            System.out.println(iMaiorNumero);

        } else if (iNum2 > iNum1 && iNum2 > iNum3 && iNum1 > iNum3)

        {
            int iMaiorNumero = iNum2;
            System.out.println(iMaiorNumero);
        } else {
            int iMaiorNumero = iNum3;
            System.out.println(iMaiorNumero);
        }

    }
}