package PSC01PT2;

import javax.swing.JOptionPane;

public class Solucao016 {

    public static void main(String[] args) {

        double dRaiz = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da raiz quadrada: "));

        System.out.println("Resultado da raiz quadrada: " + Math.sqrt(dRaiz));

        System.out.println("Resultado do Quadrado: " + Math.pow(dRaiz, 2));

    }

}
