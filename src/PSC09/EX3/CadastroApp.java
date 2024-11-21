package PSC09.EX3;

import PSC09.EX1.BlocoDeNotas;

import javax.swing.*;

public class CadastroApp {
    public static void main(String[] args) {
        int menu;


        BancoDeClientes bancoDeClientes = new BancoDeClientes();
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 inserir cliente\n2 remover cliente\n3 alterar cliente\n4 listar todos os clientes\n5 listar os dados de um cliente\n6 sair "));
            if (menu == 1) {
                String cliente = JOptionPane.showInputDialog("Digite seu nome: ");
                String fone = JOptionPane.showInputDialog("Digite o seu telefone: ");
                bancoDeClientes.insereCliente(new Cliente(cliente, fone));
            }
            if (menu == 2) {
                String nome = JOptionPane.showInputDialog("Digite o nome do cliente para remove-lo: ");
                bancoDeClientes.removerCliente(nome);
            }
            if (menu == 3) {
                String cliente = JOptionPane.showInputDialog("Digite o nome do cliente para alteraçao de dados: ");
                String fone = JOptionPane.showInputDialog("Digite um novo telefone: ");
                int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do cliente: "));
                bancoDeClientes.alterarCliente(id, new Cliente(cliente, fone));

            }
            if (menu == 4) {
                JOptionPane.showMessageDialog(null, "Lista de dados dos clientes: " + bancoDeClientes.listaClientes());
            }
            if (menu == 5) {
                String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente: ");
                JOptionPane.showMessageDialog(null, "Dados do cliente: " + bancoDeClientes.listaUmCliente(nomeCliente));
            }
        }while (menu != 7);
    }
}
