package list.operacoesBasicas;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a shopping cart
 */
public class CarrinhoCompras {
    /**
     * List of the items in this shopping cart
     */
    private List<Item> itemList;

    /**
     * Constructor
     */
    public CarrinhoCompras() {
        this.itemList = new ArrayList<>();
    }

    /**
     * Allow add an item to the shopping cart
     *
     * @param nome       Name of the item to be added to the shopping cart
     * @param preco      Price of the item to be added to the shopping cart
     * @param quantidade Quantity of the item to be added to the shopping cart
     */
    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();

        for (Item item: this.itemList) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(item);
            }
        }

        this.itemList.removeAll(itensParaRemover);
    }

    /**
     * Allow get the total value of the items (considering the quantity of each item)
     * of the cart
     */
    public double calcularValorTotal() {
        double total = 0d;

        for (Item item: this.itemList) {
            total += item.getPreco() * item.getQuantidade();
        }

        return total;
    }

    /**
     * Fomated as monetary version of this.calcularValorTotal()
     */
    public String obterValorTotalFormatado() {
        double total = this.calcularValorTotal();
        DecimalFormat dFormat = new DecimalFormat("####,###,###.00");
        return "R$ " + dFormat.format(total);
    }

    /**
     * Return the items of the cart
     */
    public void exibirItens() {
        System.out.println(this.itemList);
    }

    /**
     * Auxiliary method toString() for debugging
     */
    public String toString() {
        return "Carrinho de compras com os itens: " + this.itemList;
    }

    /**
     * Main method to allow tests in the terminal
     * @param args CLI args (ignored)
     */
    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        carrinhoCompras.adicionarItem("Dolly", 1.55d, 2);
        carrinhoCompras.adicionarItem("Coca-cola", 3d, 5);
        carrinhoCompras.adicionarItem("Guaraná", 3d, 3);
        carrinhoCompras.adicionarItem("Dolly", 1.55d, 1);

        carrinhoCompras.exibirItens();

        carrinhoCompras.removerItem("Dolly");

        carrinhoCompras.exibirItens();

        System.out.println("O valor total da compra é = " + carrinhoCompras.calcularValorTotal());
        System.out.println("O valor total da compra é = " + carrinhoCompras.obterValorTotalFormatado());
    }
}