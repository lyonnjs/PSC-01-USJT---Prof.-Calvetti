package PSC01PT2;

public class Solucao05 {

    public static void main(String[] args) {

        int iValor_Inicial = 1500;
        int iJuros = 10;
        int iMeses = 8;

        int iValor_Final = iValor_Inicial * (1 + iJuros / 100) ^ iMeses;

        System.out.println(iValor_Final);

    }

}
