package PSC01PT2;

import java.util.Arrays;

public class Solucao10 {

    public static void main(String[] args) {

        String[] sMessagem1 = { "na calçada ", "Encontrei um gato " };
        String[] sMessagem2 = { "Adotei o gato e", "levei para minha casa " };
        String[] sMessagem3 = { "Encontrei um gato ", "na calçada " };
        String[] sMessagem4 = { "pela rua ", "Eu fui caminhar " };
        String[] sMessagem5 = { "levei para minha casa ", "Adotei o gato e " };
        String[] sMessagem6 = { "Eu fui caminhar ", "pela rua " };

        String sFrase1 = "Eu fui caminhar pela rua ";
        String sFrase2 = "Encontrei um gato na calçada ";
        String sFrase3 = "Adotei o gato e levei para minha casa ";

        System.out.println(sFrase1 + " " + sFrase2 + " " + sFrase3);

        Arrays.stream(sMessagem1).skip(1).forEach(System.out::println);
        Arrays.stream(sMessagem2).skip(1).forEach(System.out::println);
        Arrays.stream(sMessagem3).skip(1).forEach(System.out::println);
        Arrays.stream(sMessagem4).skip(1).forEach(System.out::println);
        Arrays.stream(sMessagem5).skip(1).forEach(System.out::println);
        Arrays.stream(sMessagem6).skip(1).forEach(System.out::println);
    }

}
