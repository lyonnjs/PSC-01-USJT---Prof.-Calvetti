package PSC01PT2;

import javax.swing.JOptionPane;

public class Solucao09 {

    public static void main(String[] args) {

        int iNum1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero do logaritimo: "));
        int iBase = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do logaritimo: "));

        Double dResult = Math.log(iNum1) / Math.log(iBase);

        System.out.println("O logaritmo natural de 10 é: " + dResult);

    }

}