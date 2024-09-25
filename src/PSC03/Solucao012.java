package PSC03;

import javax.swing.JOptionPane;

public class Solucao012 {

    public static void main(String[] args) {

        int iMenos21 = 0;
        int iMais50 = 0;

        while (true) {
            int iDade = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite varias idades, (0 - 120, para sair): "));
            if (iDade < 0 || iDade > 120) {
                break;

            }

            if (iDade < 21) {
                iMenos21++;
            } else if (iDade > 50) {
                iMais50++;
            }

        }

        System.out.println("Total de pessoas com menos de 21 anos: " + iMenos21);
        System.out.println("Total de pessoas mais de 50 anos: " + iMais50);
    }

}
