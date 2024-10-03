package PSC03PT2;

import javax.swing.JOptionPane;

public class Solucao023 {

    public static void main(String[] args) {

        int iQtd = Integer
                .parseInt(JOptionPane.showInputDialog("Digite a quantidade de numeros pares para serem impressos"));
        int iContador = 0;
        int iNum1 = 2;

        while (iContador < iQtd) {
            iNum1 += 2;
            iContador++;

            System.out.println(iNum1);
        }

    }

}
