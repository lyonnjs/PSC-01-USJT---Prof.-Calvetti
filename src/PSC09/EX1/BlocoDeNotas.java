package PSC09.EX1;

import java.util.ArrayList;

public class BlocoDeNotas {
    private ArrayList<String> notas  = new ArrayList<>();

    public BlocoDeNotas(ArrayList<String> notas) {
        this.notas = notas;
    }
    public BlocoDeNotas(){

    }

    public ArrayList<String> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<String> notas) {
        this.notas = notas;
    }

    public void insereNotas(String nota) {
        notas.add(nota);
    }

    public void removerNotas(String nota) {
        notas.remove(nota);
    }

    public void imprimeNotas() {
        for (int i = 0; i < notas.size(); i++) {

            System.out.println(notas.get(i));
        }

    }

}
