import javax.swing.*;

public class TesteFatorial {

    public static void main(String[] args) {
        
        int iN = Integer.parseInt(JOptionPane.showInputDialog("Digite valor de N possitvo para calculo do N!"));

        calculaFatorial(iN);

    }


    public static long calculaFatorial(int iN){

        if (iN < 0) {
            JOptionPane.showMessageDialog(null, "Nao existe fatorial para N negativo");
        return 0;
        } else {
            long inFat = 1;
            for (int i = 1; i <= iN; i++){
                inFat *= i;
            }
            System.out.println("Para N= " + iN + " o fatorial de N é: N!= " + inFat);
            return inFat;
        }
        
    }

}
