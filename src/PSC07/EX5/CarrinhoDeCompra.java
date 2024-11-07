package PSC07.EX5;

import java.util.ArrayList;

public class CarrinhoDeCompra {
    private ArrayList<ItemCarrinho> itens = new ArrayList<ItemCarrinho>();

    public void adicionalItem(ItemCarrinho item) {
        itens.add(item);
    }

    public void removeItem(ItemCarrinho item) {
        itens.remove(item);
    }

    public double getValorTotal() {
        double total = 0;
        for (ItemCarrinho item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    public void exibeItens() {
        for (ItemCarrinho item : itens) {
            System.out.println(item.getDescricao() + " - R$ " + item.getPreco());
        }
    }

}
