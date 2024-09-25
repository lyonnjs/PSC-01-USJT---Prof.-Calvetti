package PSC03;

import javax.swing.JOptionPane;

public class Solucao015 {

    public static void main(String[] args) {

        int iMaior = -10000;
        int iUltimoNumero = 0;

        while (true) {
            int iNumero = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite varios numeros, ou -9999 para parar "));
            if (iNumero == -9999) {
                break;

            }

            iUltimoNumero = iNumero;

            if (iMaior == -1000 || iNumero > iMaior) {
                iMaior = iNumero;
            }

            System.out.println("Ultimo numero digitado. " + iUltimoNumero);


            if (iMaior == -1000) {
                System.out.println("Numero invalido");
            } else {
                System.out.println("Esse foi o maior numero digitado: " + iMaior);
            }

        }

    }
}
