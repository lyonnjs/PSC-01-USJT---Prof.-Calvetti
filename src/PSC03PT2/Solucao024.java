package PSC03PT2;

import javax.swing.JOptionPane;

public class Solucao024 {
    public static void main(String[] args) {
        double dTotal = 0.0;

        while (true) {
            double dPreco = -1;
            int iQuantidade = -1;

            do {
                dPreco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da mercadoria:"));
                if (dPreco < 0) {
                    JOptionPane.showMessageDialog(null, "Digite um valor positivo.");
                }
            } while (dPreco < 0);

            do {
                iQuantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de itens comprados:"));
                if (iQuantidade < 0) {
                    JOptionPane.showMessageDialog(null, "Digite ao menos um item, um valor positivo");
                }
            } while (iQuantidade < 0);

            if (iQuantidade == 0) {
                break;
            }

            dTotal += dPreco * iQuantidade;
        }

        JOptionPane.showMessageDialog(null, "O total a ser pago é: " + dTotal);
    }
}
