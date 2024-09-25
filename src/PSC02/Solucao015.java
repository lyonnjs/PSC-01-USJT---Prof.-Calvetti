package PSC02;

import javax.swing.JOptionPane;

public class Solucao015 {
    public static void main(String[] args) {

        int iAnoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que nasceu: "));
        int iAnoatual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
        int iIdade = iAnoatual - iAnoNascimento;

        if (iAnoNascimento <= 1900) {
            System.out.println(" Ano de nascimento invalido.");

        } else

            System.out.println(iIdade);
    }

}
