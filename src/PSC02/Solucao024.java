package PSC02;

import javax.swing.JOptionPane;

public class Solucao024 {
    public static void main(String[] args) {

        int iMaior = Integer.MIN_VALUE;
        int iMenor = Integer.MAX_VALUE;

        for (int i = 1; i <= 5; i++) {
            int iNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + i + "º número:"));

            if (iNumero > iMaior) {
                iMaior = iNumero;
            }
            if (iNumero < iMenor) {
                iMenor = iNumero;
            }
        }

        JOptionPane.showMessageDialog(null, "O maior número é: " + iMaior);
        JOptionPane.showMessageDialog(null, "O menor número é: " + iMenor);
    }
}
