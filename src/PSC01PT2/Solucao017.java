package PSC01PT2;

import javax.swing.JOptionPane;

public class Solucao017 {

    public static void main(String[] args) {

        double dBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Base do triangulo: "));
        double dAltura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Altura do triangulo: "));

        double dArea = (dBase * dAltura) / 2;

        System.out.println(dArea);

    }

}