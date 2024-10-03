package PSC03PT2;

public class Solucao017 {

    public static void main(String[] args) {

        System.out.println("Tabela de Conversao de polegadas para centimetros: ");

        for (int iPolegadas = 1; iPolegadas <= 20; iPolegadas++) {
            double dCentimetros = iPolegadas * 2.54;

            System.out.println(iPolegadas + "\n" + dCentimetros);

        }

    }

}
