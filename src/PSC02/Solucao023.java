package PSC02;

import javax.swing.JOptionPane;

public class Solucao023 {
    public static void main(String[] args) {

        int iNum1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        int iNum2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero: "));
        int iNum3 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero: "));
        int iMaiorNumero, iMedioNumero, iMenorNumero;

        if (iNum1 > iNum2 && iNum1 > iNum3) {
            iMaiorNumero = iNum1;

            if (iNum2 > iNum3) {
                iMedioNumero = iNum2;
                iMenorNumero = iNum3;

            } else {
                iMedioNumero = iNum3;
                iMenorNumero = iNum2;

            }

        } else if (iNum2 > iNum1 && iNum2 > iNum3) {
            iMaiorNumero = iNum2;

            if (iNum1 > iNum3) {
                iMedioNumero = iNum1;
                iMenorNumero = iNum3;

            } else {

                iMedioNumero = iNum3;
                iMenorNumero = iNum1;
            }
        } else {

            iMaiorNumero = iNum3;
            if (iNum1 > iNum2) {

                iMedioNumero = iNum1;
                iMenorNumero = iNum2;
            } else {

                iMedioNumero = iNum2;
                iMenorNumero = iNum1;
            }
        }

        {

            System.out.println(iMaiorNumero + " Maior " + iMedioNumero + " Medio " + iMenorNumero + " Menor ");
        }

    }
}