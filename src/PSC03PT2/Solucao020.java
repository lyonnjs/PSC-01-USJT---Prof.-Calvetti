package PSC03PT2;

import javax.swing.JOptionPane;

public class Solucao020 {

    public static void main(String[] args) {

        int iLimite = Integer.parseInt(JOptionPane.showInputDialog("Escolha um numero limite: "));
        int iIncremento = Integer
                .parseInt(JOptionPane.showInputDialog("Digite um numero para se incrementado até o numero limite: "));

        for (int i = 0; i <= iLimite; i += iIncremento) {
            System.out.println(i + " ");
        }

    }

}
