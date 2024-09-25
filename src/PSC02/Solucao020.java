package PSC02;

import javax.swing.JOptionPane;

public class Solucao020 {
    public static void main(String[] args) {

        int iNum1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        int iNum2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero: "));
        int iMenorNumero = Math.min(iNum1, iNum2);
        int iMaiorNumero = Math.max(iNum1, iNum2);
        double iQuadradoMenor = Math.pow(iMenorNumero, 2);

        if (iMaiorNumero >= 0) {
            double iMaioRaiz = Math.sqrt(iMaiorNumero);
            System.out.println("Raiz quadrada do maior numero " + iMaiorNumero + " é: " + iMaioRaiz);

        } else

        {
            System.out.println("Raiz quadrada negativa invalido.");
        }

        System.out.println("O quadrado do menor número " + iMenorNumero + " é: " + iQuadradoMenor);

    }
}