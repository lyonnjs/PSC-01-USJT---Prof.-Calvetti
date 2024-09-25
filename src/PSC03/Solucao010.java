package PSC03;

import javax.swing.JOptionPane;

public class Solucao010 {

    public static void main(String[] args) {

        while (true) {
            int iNumero = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite varios numeros, ou -999 para parar "));
            if (iNumero == -999) {
                break;

            }

            System.out.println("Divisores de " + iNumero + ":");

            for (int i = 1; i <= iNumero; i++)
                if (iNumero % i == 0) {
                    System.out.println(i + " ");

                }

        }
    }
}