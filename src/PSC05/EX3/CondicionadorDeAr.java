package PSC05.EX3;

public class CondicionadorDeAr {
    private Termostato termostato;
    private boolean ligado;

    public CondicionadorDeAr(){
        this.ligado = false;
        this.termostato = new Termostato();

        
    }

    public Termostato getTermostato() {
        return termostato;
    }

    public boolean isLigado() {
        return ligado;
    }
    
    public void ligar(){
        this.ligado = true;


    }
    
    public void desligar(){
        this.ligado = false;
        

    }

    public void aumentarTemperatura() {
        if (!ligado) {
            if (termostato.getTemperatura() < 28) {
                termostato.setTemperatura(termostato.getTemperatura() + 1);
                System.out.println("Temperatura aumentada para " + termostato.getTemperatura());
            } else {
                System.out.println("Temperatura máxima atingida");
            }
        } else {
            System.out.println("O termostato não está ligado");
        }
    }
    
    public void reduzirTemperatura() {
        if (!ligado) {
            if (termostato.getTemperatura() > 15) {
                termostato.setTemperatura(termostato.getTemperatura() - 1);
                System.out.println("Temperatura reduzida para " + termostato.getTemperatura());
            } else {
                System.out.println("Temperatura mínima atingida");
            }
        } else {
            System.out.println("O termostato não está ligado");
        }
    }
    



}
