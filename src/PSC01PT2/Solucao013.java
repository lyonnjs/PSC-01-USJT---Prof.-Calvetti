package PSC01PT2;

import javax.swing.JOptionPane;

public class Solucao013 {

    public static void main(String[] args) {

        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor: "));

        int x = 2 * ((a - c) / 8) - b * 5;

        System.out.println(x);

    }

}
