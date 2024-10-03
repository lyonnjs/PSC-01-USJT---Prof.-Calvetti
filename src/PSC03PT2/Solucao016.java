package PSC03PT2;

import javax.swing.JOptionPane;

public class Solucao016 {

    public static void main(String[] args) {

        int iNum1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero, ou numero negativo para sair"));
        int a = 0, b = 1;

        while (a < iNum1) {

            int iFake = a; // fake para uma variavel temporaria.

            a = b;
            b = iFake + b;

            System.out.println(a + " ");
        }

    }

}
