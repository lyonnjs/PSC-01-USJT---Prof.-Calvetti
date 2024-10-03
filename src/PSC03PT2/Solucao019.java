package PSC03PT2;

import javax.swing.JOptionPane;

public class Solucao019 {

    public static void main(String[] args) {

        int iNum1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero, ou numero negativo para sair"));
        long iFatorial = 1;

        for (int i = 1; i < iNum1; i++) {
            iFatorial *= i;
        }

        System.out.println("O fatorial de: " + iNum1 + " é " + iFatorial);
    }

}
