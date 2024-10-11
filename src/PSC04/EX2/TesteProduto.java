package PSC04.EX2;


import javax.swing.JOptionPane;

public class TesteProduto {

    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite o produto: ");

        double preço = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço: "));

        int Quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de produtos desejados: "));

       Produto produto = new Produto(nome, preço, Quantidade);

       String msg = "Digite o produto: " + produto.getSnome() + "\nDigite o preço: " + produto.getdPreço() + "\nQuantidade de produtos desejados: " + produto.getiQuantidade();

       JOptionPane.showMessageDialog(null, msg);
    }

}
