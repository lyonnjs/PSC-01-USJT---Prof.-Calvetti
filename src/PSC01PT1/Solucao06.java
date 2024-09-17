package PSC01PT1;

import javax.swing.JOptionPane;

public class Solucao06 {

    public static void main(String[] args) throws Exception {

        int iNum1 = Integer.parseInt(JOptionPane.showInputDialog("Digite uma milha: "));
        if (!(iNum1 >= 1000 && iNum1 <= 9999))
            throw new Exception();

        int iNum2 = Integer.parseInt(JOptionPane.showInputDialog("Digite uma centena: "));
        if (!(iNum2 >= 100 && iNum2 <= 999))
            throw new Exception();

        int iNum3 = Integer.parseInt(JOptionPane.showInputDialog("Digite uma dezena: "));
        if (!(iNum3 >= 10 && iNum3 <= 99))
            throw new Exception();

        int iNum4 = Integer.parseInt(JOptionPane.showInputDialog("Digite uma unidade: "));
        if (!(iNum4 >= 0 && iNum4 <= 9))
            throw new Exception();

        System.out.println(iNum1 + " " + iNum2 + " " + iNum3 + " " + iNum4);
    }

}
