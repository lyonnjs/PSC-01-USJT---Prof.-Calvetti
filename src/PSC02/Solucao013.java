package PSC02;

import javax.swing.JOptionPane;

public class Solucao013 {
    public static void main(String[] args) {

        int iNum1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        int iUltimasCasas = iNum1 % 100;

        if (iUltimasCasas % 2 == 0) {
            System.out.println(iUltimasCasas + " a ultimas duas casas decimais é par.");

        } else if (iUltimasCasas % 3 == 0)

            System.out.println(iUltimasCasas + " a ultimas duas casas decimais é impar.");
    }

}
