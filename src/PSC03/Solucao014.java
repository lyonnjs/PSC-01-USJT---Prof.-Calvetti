package PSC03;

import javax.swing.JOptionPane;

public class Solucao014 {

    public static void main(String[] args) {

        int iPrimos = 0;

        while (true) {
            boolean bPrimo = true;
            int iNumero = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite um numero, ou numero negativo para sair"));

            if (iNumero < 0) {
                break;
            }

            if (iNumero <= 2) {
                bPrimo = false;
            } else {
                for (int i = 2; i < iNumero; i++) {
                    if (iNumero % i == 0) {
                        bPrimo = false;
                        break;
                    }
                }
            }

            if (bPrimo) {
                iPrimos++;
            }

            System.out.println("Quantida de numeros primos digitado: " + iPrimos);

        }

    }
}   
