package PSC02;

import javax.swing.JOptionPane;

public class Solucao03 {
    public static void main(String[] args) {

        int iNum1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

        if (iNum1 >= 0) {
            double iRaizquadrada = Math.sqrt(iNum1);
            System.out.println("A raiz quadrada do numero é: " + iRaizquadrada);

        } else {
            double iQuadrado = Math.pow(iNum1, 2);
            System.out.println("O numero do quadrado é: " + iQuadrado);

        }

    }

}