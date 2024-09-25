package PSC02;

import javax.swing.JOptionPane;

public class Solucao05 {
    public static void main(String[] args) {

        int iNum1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

        if (iNum1 < 20 || iNum1 > 90) {
            System.out.println("Numero invalido, escolha entre 20 a 90");

        } else {

            System.out.println("O numero é: " + iNum1);
        }

    }
}