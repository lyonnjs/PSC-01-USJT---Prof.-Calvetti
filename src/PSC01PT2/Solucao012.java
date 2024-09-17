package PSC01PT2;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solucao012 {

    public static void main(String[] args) {

        String sData = (JOptionPane.showInputDialog("Digite uma data: "));

        // Definir o padrão de formatação
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Obter a data atual
        LocalDate lData = LocalDate.parse(sData, formatar);

        System.out.println(lData);

    }

}