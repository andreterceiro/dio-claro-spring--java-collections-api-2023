package list.operacoesBasicas;

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
    }

    /**
     * Allow add an item to the shopping cart
     *
     * @param nome       Name of the item to be added to the shopping cart
     * @param preco      Price of the item to be added to the shopping cart
     * @param quantidade Quantity of the item to be added to the shopping cart
     */
    public void adicionarItem(String nome, double preco, int quantidade) {
    }

    public void removerItem(String nome) {
    }

    /**
     * Allow get the total value of the items (considering the quantity of each item)
     * of the cart
     */
    public double calcularValorTotal() {
        return 1.0;
    }

    /**
     * Return the items of the cart
     */
    public void exibirItens() {

    }

    /**
     * Auxiliary method toString() for debugging
     */
    @Override
    public String toString() {
        return "";
    }

    /**
     * Main method to allow tests in the terminal
     * @param args CLI args (ignored)
     */
    public static void main(String[] args) {

    }
}
