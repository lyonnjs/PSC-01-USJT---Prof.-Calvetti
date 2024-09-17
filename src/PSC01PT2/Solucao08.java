package PSC01PT2;

import javax.swing.JOptionPane;

public class Solucao08 {

    public static void main(String[] args) {

        int iNum1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

        System.out.println("O logaritmo natural de 10 é: " + Math.log10(iNum1));

    }

}
