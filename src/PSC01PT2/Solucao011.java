package PSC01PT2;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solucao011 {

    public static void main(String[] args) {

        int iData = Integer.parseInt(JOptionPane.showInputDialog("Digite um data sem barras: "));

        String sData = String.valueOf(iData);

        // Definir o padrão de formatação
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("ddMMyyyy");

        // Obter a data atual
        LocalDate lData = LocalDate.parse(sData, formatar);

        System.out.println(lData);

    }

}
