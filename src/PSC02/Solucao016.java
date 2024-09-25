package PSC02;

import javax.swing.JOptionPane;

public class Solucao016 {
    public static void main(String[] args) {

        int iNum1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        int iNum2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

        if (iNum1 == iNum2) {
            System.out.println("Os numeros sao iguais.");

        } else {

            System.out.println("Os numeros sao diferentes.");
        }

    }
}