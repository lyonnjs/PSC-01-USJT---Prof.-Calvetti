package PSC05.EX2;

import javax.swing.JOptionPane;

public class CaixaEletronico {

    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");

        String cpf = JOptionPane.showInputDialog("Digite seu CPF: ");

        int contaCorrente = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da sua conta: " ));

        int agencia = Integer.parseInt(JOptionPane.showInputDialog("Digite a agencia da sua conta: " ));
       
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial: "));

        Agencia ag = new Agencia(nome, agencia);

        ContaCorrente cc = new ContaCorrente(ag, contaCorrente, saldo);

        Cliente cliente1 = new Cliente(nome, cpf, cc);

        cc.sacar(140.00);

        cc.consultarSaldo();

        cc.sacar(200.00);

        cc.consultarSaldo();

        cc.depositar(25.45);

        System.out.println(cliente1.toString() + "\n" + cc.toString() + "\n" + ag.toString() + "\n" + cc.getSaldo());

        

    }


}
