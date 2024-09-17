package PSC01PT2;

import javax.swing.JOptionPane;

public class Solucao07 {

    public static void main(String[] args) {

        Double iHipotenusa = Double.parseDouble(JOptionPane.showInputDialog("Digite hipotenusa: "));
        Double iCatetoOposto = Double.parseDouble(JOptionPane.showInputDialog("Digite cateto oposto: "));
        Double icatetoAdjacente = Double.parseDouble(JOptionPane.showInputDialog("Digite cateto adjacente: "));

        double iSeno = iCatetoOposto / iHipotenusa;
        double iCosseno = icatetoAdjacente / iHipotenusa;
        double iTangente = iCatetoOposto / icatetoAdjacente;
        double iSecante = 1 / iCosseno;
        double iCossecante = 1 / iSeno;
        double iCotangente = 1 / iTangente;

        System.out.println("Valor de Seno: " + iSeno + "\nValor de Cosseno: " + iCosseno + "\nValor de Tangente: "
                + iTangente + "\nValor de Secante: " + iSecante + "\nValor de Cossecante: " + iCossecante
                + "\nValor de Cotangete: " + iCotangente);
    }

}
