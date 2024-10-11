package PSC04.EX3;
import javax.swing.JOptionPane;

public class TesteDisciplina {

    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite a disciplina: ");

        String professor = JOptionPane.showInputDialog("Digite o professor: ");

        int semestre = Integer.parseInt(JOptionPane.showInputDialog("Qual semestre voce está: "));

        Disciplina disciplina = new Disciplina(nome, professor, semestre, false);

        String msg = "Digite a disciplina: " + disciplina.getsNome() + "\nDigite o professor: " + disciplina.getsProfessor() + "\nQual semestre voce está: " + disciplina.getiSemestre();

        

        JOptionPane.showMessageDialog(null,msg);


    }

}
