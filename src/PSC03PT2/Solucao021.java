package PSC03PT2;

import javax.swing.JOptionPane;

public class Solucao021 {

    public static void main(String[] args) {
        // Arrays
        String[] sNomes = new String[20];
        int[] iDades = new int[20];
        char[] cSexos = new char[20];

        for (int i = 0; i < 20; i++) {

            sNomes[i] = JOptionPane.showInputDialog("Digite o nome da pessoa: " + (i + 1) + ": ");
            iDades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade dela: " + (i + 1) + ": "));
            cSexos[i] = JOptionPane.showInputDialog("e o sexo: " + (i + 1) + " (M/F):").charAt(0);

        }

        StringBuilder sResult = new StringBuilder("Pessoas apenas do sexo masculino e mais de 21 anos:\n");
        for (int i = 0; i < 20; i++) {
            if (cSexos[i] == 'M' && iDades[i] > 21) {
                sResult.append("Nome: ").append(sNomes[i]).append("\n");
            }
        }

        System.out.println(sResult.toString());
    }

}