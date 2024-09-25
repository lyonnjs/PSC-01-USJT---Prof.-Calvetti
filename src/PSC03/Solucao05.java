package PSC03;

import javax.swing.JOptionPane;

public class Solucao05 {

    public static void main(String[] args) {

        while (true) {
            String sNomes = JOptionPane.showInputDialog(" Digite varios nomes, ou FIM para parar ");

            if (sNomes.toUpperCase().equals("FIM")) {
                break;

            }

            System.out.println("Nomes digitados: " + sNomes);

        }

    }

}
