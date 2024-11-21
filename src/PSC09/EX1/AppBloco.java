package PSC09.EX1;

import javax.swing.*;

public class AppBloco {
    public static void main(String[] args) {
        int menu;
        String texto;

        BlocoDeNotas app = new BlocoDeNotas();
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 add nota\n2 remover nota\n3 listar todos\n4 sair"));
         if (menu == 1) {
             texto = JOptionPane.showInputDialog("Digite a sua nota ");

             app.insereNotas(texto);
         }
         if (menu == 2) {
             texto = JOptionPane.showInputDialog("Digite a nota que queira remove-la");
             app.removerNotas(texto);
         }
         if (menu == 3) {

             app.imprimeNotas();
         }
        }while (menu != 4);
    }
}