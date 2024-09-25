package PSC02;

import javax.swing.JOptionPane;

public class Solucao07 {
    public static void main(String[] args) {

        String sNome = JOptionPane.showInputDialog("Digite seu nome");
        char cSexo = JOptionPane.showInputDialog("Digite seu sexo").charAt(0);
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

        System.out.println("Nome: " + sNome);
        System.out.println("Sexo: " + cSexo);
        System.out.println("Idade: " + idade);

        if (idade <= 25 && cSexo == 'F') {
            System.out.println("Aceita");

        } else {

            System.out.println("Nao aceita");
        }

    }
}