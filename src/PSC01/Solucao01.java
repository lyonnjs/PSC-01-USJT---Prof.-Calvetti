package PSC01;

import javax.swing.JOptionPane;

public class Solucao01 {
    public static void main(String[] args) throws Exception {

        JOptionPane.showMessageDialog(null, "Digite 3 Frutas ");
        String sFruta1 = JOptionPane.showInputDialog(null);
        String sFruta2 = JOptionPane.showInputDialog(null);
        String sFruta3 = JOptionPane.showInputDialog(null);

        System.out.println(sFruta3 + " " + sFruta2 + " " + sFruta1);

    }
}
