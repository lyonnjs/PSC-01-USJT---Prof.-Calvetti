package PSC01PT2;

import javax.swing.JOptionPane;

public class Solucao02 {

    public static void main(String[] args) {

        String sBase = JOptionPane.showInputDialog("Digite o valor da Base do retangulo ");

        String sAltura = JOptionPane.showInputDialog("Digite o valor da Altura do retangulo ");

        double sBase2 = Double.parseDouble(sBase);
        double sAltura2 = Double.parseDouble(sAltura);

        double dArea = sBase2 * sAltura2;

        System.out.println(dArea);

    }

}
