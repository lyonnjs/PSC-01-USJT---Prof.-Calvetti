package PSC03PT2;

import javax.swing.JOptionPane;

public class Solucao026 {
    public static void main(String[] args) {

        double dNum1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        double dNum2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo: "));
        int iOpcao;

        do {
            String iMenu = "Operações Disponíveis:\n" +
                    "1. Adição\n" +
                    "2. Subtração\n" +
                    "3. Multiplicação\n" +
                    "4. Divisão\n" +
                    "9. Sair do Programa\n" +
                    "Digite o número de ordem da opção desejada:";
            iOpcao = Integer.parseInt(JOptionPane.showInputDialog(iMenu));

            switch (iOpcao) {
                case 1:
                    System.out.println("Resultado da Adiçao: " + (dNum1 + dNum2));
                    break;
                case 2:
                    System.out.println("Resultado da Subtraçao: " + (dNum1 - dNum2));
                    break;
                case 3:
                    System.out.println("Resultado da Multiplicaçao: " + (dNum1 * dNum2));
                    break;
                case 4:
                    if (dNum2 != 0) {
                        System.out.println("Resultado da Divisao: " + (dNum1 / dNum2));
                    } else {
                        System.out.println("Divisao por zero nao é permitida.");
                    }
                    break;
                case 9:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opçao invalida. Tente novamente.");
            }
        } while (iOpcao != 9);

    }
}
