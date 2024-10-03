package PSC03PT2;

import javax.swing.JOptionPane;

public class Solucao018 {

    public static void main(String[] args) {

        int iLimiteInf = Integer.parseInt(JOptionPane.showInputDialog("Escolha um numero limite inferior: "));
        int iLimiteMax = Integer.parseInt(JOptionPane.showInputDialog("Escolha um numero limite maximo: "));
        int iIncremento = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para incrementar: "));

        for (int iCelsius = iLimiteInf; iCelsius <= iLimiteMax; iCelsius += iIncremento) {
            double dFahrenheit = iCelsius * 9.0 / 5.0 + 32;

            System.out.println("Celsius: " + iCelsius + "\t" + "Fahrenheit: " + dFahrenheit);
        }

    }

}
