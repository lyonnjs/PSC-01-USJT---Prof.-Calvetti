package PSC09.EX3;

import java.util.ArrayList;

public class BancoDeClientes {
    private ArrayList<Cliente> clientes;

    public BancoDeClientes() {
        this.clientes = new ArrayList<>();
    }


    public void insereCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public boolean removerCliente(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                clientes.remove(cliente);
                System.out.println("Cliente removido com sucesso");
                return true;
            }
        }
        return false;

    }

    public String listaClientes() {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        for (int i = 0; i < clientes.size(); i++) {
            listaClientes.add(clientes.get(i));
        }
        return listaClientes.toString();
    }

    public String listaUmCliente(String nome){
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNome().equalsIgnoreCase(nome)) {
                return clientes.get(i).toString();
            }
        }
        return "Cliente nao encontrado";

    }

    public void alterarCliente(Integer id, Cliente cliente) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == id) {
                clientes.set(i, cliente);
                System.out.println("cliente alterado com sucesso" + cliente);
            }

        }
    }

}
