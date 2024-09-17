package PSC01PT2;

import javax.swing.JOptionPane;

public class Solucao015 {

    public static void main(String[] args) {

        int iDivendedo = Integer.parseInt(JOptionPane.showInputDialog("Digite um dividendo: "));
        int iDivisor = Integer.parseInt(JOptionPane.showInputDialog("Digite o divisor: "));

        int iQuociente = iDivendedo / iDivisor;
        int iResto = iDivendedo % iDivisor;

        System.out.println("Dividendo: " + iDivendedo + "\nDivisor: " + iDivisor + "\nQuociente: " + iQuociente
                + "\nResto: " + iResto);

    }

}
