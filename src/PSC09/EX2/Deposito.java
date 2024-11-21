package PSC09.EX2;

import java.util.ArrayList;
import java.util.Random;

public class Deposito {
    private ArrayList<Caixa> caixas;

    public Deposito() {
        this.caixas = new ArrayList<>();
    }

    public ArrayList<Caixa> getCaixas() {
        return caixas;
    }

    public void setCaixas(ArrayList<Caixa> caixas) {
        this.caixas = caixas;
    }

    public void adicioneCaixasDono(String dono){
        Random random = new Random();
        Caixa caixa = new Caixa("1", 1, random.nextDouble(20) + 1, dono);
        caixas.add(caixa);


    }



    public boolean removeCaixasDono(String dono){
        for (Caixa caixa : caixas) {
            if (caixa.getDono().equalsIgnoreCase(dono)) {
                caixas.remove(caixa);
                System.out.println("Caixa removida com sucesso");
                return true;
            }
        }
        System.out.println("Caixa nao removida");
        return false;

    }

    public int buscaCaixa(String dono){
        for (int i = 0; i < caixas.size(); i++) {
            if (caixas.get(i).getDono().equalsIgnoreCase(dono)) {
                System.out.println("Dono da caixa: " + caixas.get(i).getDono());
                return i;
            }
        }
        return -1;
    }

    public boolean alteraCaixa(int novaPosicao, String dono, String novocorredor){
        for (Caixa caixa : caixas) {
            if (caixa.getDono().equalsIgnoreCase(dono)){
            caixa.setCorredor(novocorredor);
            caixa.setPosicao(novaPosicao);
            return true;
            }
        }
        return false;
    }

    public String caixaMaisPesada(double valorPeso){
        ArrayList<Caixa> caixasMaisPesada = new ArrayList<>();
        for (Caixa caixa : caixas) {
            if (caixa.getPeso() > valorPeso){
                caixasMaisPesada.add(caixa);
            }
        }
        return caixasMaisPesada.toString();
    }


}
