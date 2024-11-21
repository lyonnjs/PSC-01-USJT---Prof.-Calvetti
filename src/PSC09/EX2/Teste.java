package PSC09.EX2;

import javax.swing.*;
import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        int menu;



        Deposito deposito = new Deposito();

        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 add caixa\n2 remover caixa\n3 procura caixa\n4 muda caixa\n5 lista mais pesadas que 10.0 e 6\n6 sair"));
            if (menu == 1) {
                String dono = JOptionPane.showInputDialog("Digite a sua caixa: ");
                deposito.adicioneCaixasDono(dono);
            }
            if (menu == 2) {
                String dono = JOptionPane.showInputDialog("Digite a caixa que deseja remover: ");
                deposito.removeCaixasDono(dono);
            }
            if (menu == 3) {
                String dono = JOptionPane.showInputDialog("Digite caixa que deseja procura: ");
                int caixa = deposito.buscaCaixa(dono);
                JOptionPane.showMessageDialog(null, "caixa: " + caixa);

            }
            if (menu == 4) {
                String dono = JOptionPane.showInputDialog("Digite o dono da caixa: ");
                String corredor = JOptionPane.showInputDialog("Digite o corredor: ");
                int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova posicao"));
                deposito.alteraCaixa(posicao, dono, corredor);
            }
            if (menu == 5) {
                Double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do caixa: "));
                String maisPesado = deposito.caixaMaisPesada(peso);
                JOptionPane.showMessageDialog(null, "Caixa Mais pesada: " + maisPesado);


            }

        } while (menu != 6);
    }
}
