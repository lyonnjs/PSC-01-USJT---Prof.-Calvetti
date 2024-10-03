package PSC03PT2;

import javax.swing.JOptionPane;

public class Solucao025 {
    public static void main(String[] args) {
        int[] iVotos = new int[4];
        int iTotalVotos = 0;
        int iVoto;

        while (true) {
            String sConvert = JOptionPane.showInputDialog("Digite o número do candidato (1-4) ou -1 para encerrar:");
            iVoto = Integer.parseInt(sConvert);

            if (iVoto == -1) {
                break;
            } else if (iVoto >= 1 && iVoto <= 4) {
                iVotos[iVoto - 1]++;
                iTotalVotos++;
            } else {
                JOptionPane.showMessageDialog(null, "Voto nao existente. Tente novamente.");
            }
        }

        if (iTotalVotos > 0) {
            System.out.println("resultado da eleiçao:");
            for (int i = 0; i < 4; i++) {
                double percentual = (double) iVotos[i] / iTotalVotos * 100;
                System.out.println("canditado " + (i + 1) + ": " + percentual + "% dos votos");
            }
            System.out.println("total de eleitores: " + iTotalVotos);
        } else {
            System.out.println("nenhum voto registrado.");
        }
    }
}
