
package PSC04.EX1;

import javax.swing.JOptionPane;


public class TesteTurma {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Nome: ");

        String curso = JOptionPane.showInputDialog("Curso: ");

        int qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de aluno: "));

        int serie = Integer.parseInt(JOptionPane.showInputDialog("serie: "));

        Turma turma = new Turma(nome, curso,qtdAlunos,serie);

        String msg = "Nome: " + turma.getsNome() + "\nCurso: " + turma.getsCurso() + "\nQuantida de alunos: "
                + turma.getiQtdDeAlunos() + "\nSerie: " + turma.getiSerie();

        JOptionPane.showMessageDialog(null, msg);

        qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog("Nova quantidade de alunos: "));

        turma.setiQtdDeAlunos(qtdAlunos);

        msg = "Nome: " + turma.getsNome() + "\nCurso: " + turma.getsCurso() + "\nQuantida de alunos: "
                + turma.getiQtdDeAlunos() + "\nSerie: " + turma.getiSerie();

        JOptionPane.showMessageDialog(null, msg);

    }

}
