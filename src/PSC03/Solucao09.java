package PSC03;

public class Solucao09 {

  public static void main(String[] args) {

    int iContador = 0;
    int iSoma = 0;

    for (iContador = 1; iContador <= 100; iContador++) {

      System.out.println(iContador + " ");
      iSoma = iSoma + iContador;

    }

    System.out.println("A soma dos numeros de 1 a 100 é: " + iSoma);

  }

}