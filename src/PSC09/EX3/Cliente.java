package PSC09.EX3;

import java.util.Random;

public class Cliente {
    private String nome;
    private String fone;
    private int id;

    public Cliente(String nome, String fone) {
        Random random = new Random();
        this.nome = nome;
        this.fone = fone;
        this.id = random.nextInt(50) + 1;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cliente: " +
                "nome: " + nome + '\'' +
                ", fone: " + fone + '\'' +
                ", id: " + id;
    }
}
