package PSC01PT2;

import javax.swing.JOptionPane;

public class Solucao018 {

    public static void main(String[] args) {

        double dDiagnoal1 = Double
                .parseDouble(JOptionPane.showInputDialog("Digite o valor da primeira diagonal do losango: "));
        double dDiagonal2 = Double
                .parseDouble(JOptionPane.showInputDialog("Digite o segundo valor da diagonal do losango: "));

        double dArea = (dDiagnoal1 * dDiagonal2) / 2;

        System.out.println(dArea);

    }

}