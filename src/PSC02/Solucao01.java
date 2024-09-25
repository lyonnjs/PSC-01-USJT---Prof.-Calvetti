package PSC02;

import javax.swing.JOptionPane;

public class Solucao01 {
    public static void main(String[] args) {

        int iNum1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        int iNum2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

        int result = iNum1 + iNum2;

        if (result >= 10) {
            System.out.println(result);

        } else {
            System.out.println("o resultado precisa ser maior que 10");

        }

    }
}
