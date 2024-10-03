package PSC01;

import javax.swing.JOptionPane;
import java.time.LocalDate;

public class Solucao03 {

    public static void main(String[] args) {

        int sDia = Integer.parseInt(JOptionPane.showInputDialog("Digite um dia: "));
        int sMes = Integer.parseInt(JOptionPane.showInputDialog("Digite um mes: "));
        int sAno = Integer.parseInt(JOptionPane.showInputDialog("Digite um ano: "));

        // Definir o padrão de formatação
        LocalDate lData = LocalDate.of(sAno, sMes, sDia);

        System.out.println(lData);

    }

}