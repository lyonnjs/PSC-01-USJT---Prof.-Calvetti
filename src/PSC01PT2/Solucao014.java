package PSC01PT2;

import javax.swing.JOptionPane;

public class Solucao014 {

    public static void main(String[] args) {

        double iRaio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio do circulo: "));
        double dPi = Math.PI;

        double Resultado = (dPi * iRaio * iRaio);

        System.out.println(Resultado);

    }

}