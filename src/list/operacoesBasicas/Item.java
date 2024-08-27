package list.operacoesBasicas;

public class Item {
    /**
     * Name of the item
     */
    private String nome;

    /**
     * Price of the item
     */
    private double preco;

    /**
     * Quantity of the item
     */
    private int quantidade;

    /**
     * Constructor
     */
    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    /**
     * Getter of this.nome
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Getter of this.preco
     */
    public double getPreco() {
        return this.preco;
    }

    /**
     * Getter of quantidade
     */
    public int getQuantidade() {
        return this.quantidade;
    }

    /**
     * Method that helps the task of print an Item as string
     */
    public String toString() {
        return "{nome: " + this.nome + ", preco: " + this.preco + ", quantidade: " + this.quantidade + "}";
    }
}
