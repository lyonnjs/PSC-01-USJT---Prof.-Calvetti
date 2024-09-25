package PSC03;

public class Solucao02 {

    public static void main(String[] args) {

        int iContador = 0;
        int iNum1 = 1;

        while (iContador < 100) {
            if (iNum1 % 2 == 0) {
                System.out.println(iNum1);
                iContador++;

            }

            iNum1++;
        }

    }

}
