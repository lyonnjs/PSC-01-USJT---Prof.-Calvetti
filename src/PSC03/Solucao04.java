package PSC03;

import javax.swing.JOptionPane;

public class Solucao04 {

    public static void main(String[] args) {

        int iContador = 0;

        while (true) {
            int iNumero = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite varios numeros entre 100 e 200, ou 0 para parar "));
            if (iNumero == 0) {
                break;

            }

            if (iNumero >= 100 && iNumero <= 200) {
                iContador++;

                System.out.println("Contagem dos numeros digitados entre 100 e 200: " + iContador);

            }

        }

    }
}