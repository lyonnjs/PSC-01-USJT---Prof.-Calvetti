package PSC02;

import javax.swing.JOptionPane;

public class Solucao014 {
    public static void main(String[] args) {

        
        int iNum1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 4 digitos: "));
        int iMilhar = (iNum1 / 1000) % 10;
        int iCentena = (iNum1 / 100) % 10;
        int iResultado = iMilhar * 10 + iCentena;
       
        if(iResultado % 4 == 0)
        {
            System.out.println(iResultado + " é divisivel por 4.");

        } else 
        
            System.out.println(iResultado + " Nao é divisivel por 4.");
        }
        
       
    }

