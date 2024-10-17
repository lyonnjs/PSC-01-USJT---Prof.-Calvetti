package PSC05.EX3;

import javax.swing.JOptionPane;

public class Usuario {

    public static void main(String[] args) {
        
        CondicionadorDeAr condicionadorDeAr = new CondicionadorDeAr();
            
        int graus1 = Integer.parseInt(JOptionPane.showInputDialog("Aumente a temperatura: "));
        int graus2 = Integer.parseInt(JOptionPane.showInputDialog("Diminua a temperatura: "));
        int graus3 = Integer.parseInt(JOptionPane.showInputDialog("Reajuste a temperatura: "));


        for (int i = condicionadorDeAr.getTermostato().getTemperatura(); i <= graus1; i++) {
            if (i >= 28) {
                System.out.println("Temperatura máxima atingida");
                break;
            }
            condicionadorDeAr.aumentarTemperatura();
        }
        
        System.out.println("Temperatura atual: " + condicionadorDeAr.getTermostato().getTemperatura());
        for (int i = condicionadorDeAr.getTermostato().getTemperatura(); i >= graus2; i--) {
            if (i <= 15) {
                System.out.println("Temperatura mínima atingida");
                break;
            }
            condicionadorDeAr.reduzirTemperatura();
        }

        System.out.println("Temperatura atual: " + condicionadorDeAr.getTermostato().getTemperatura());
        for (int i = condicionadorDeAr.getTermostato().getTemperatura(); i < graus3; i++) {
            if (i < 15 || i > 28) {
                System.out.println("Temperatura Reajustada");
                break;
            }
            condicionadorDeAr.aumentarTemperatura();
        }
        
        System.out.println("Temperatura atual: " + condicionadorDeAr.getTermostato().getTemperatura());
    }
        
}

