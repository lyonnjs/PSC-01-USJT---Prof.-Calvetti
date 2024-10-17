package PSC05.EX1;

import javax.swing.JOptionPane;

public class TesteAtribuicao {

    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite o nome do professor: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do professor: "));
        String disciplina = JOptionPane.showInputDialog("Digite a disciplina: ");
        boolean pratica = Boolean.parseBoolean(JOptionPane.showInputDialog("E'pratica? true/false"));

        Professor professor = new Professor(nome, idade);
        Disciplina disciplina1 = new Disciplina(disciplina, pratica);
        Atribuicao atribuicao = new Atribuicao(professor, disciplina1);

        System.out.println(atribuicao.getdadoS());


    }

}
