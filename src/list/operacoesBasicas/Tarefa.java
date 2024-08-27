package list.operacoesBasicas;

public class Tarefa {
    /**
     * Atributo que armazena a descrição da tarefa
     */
    String descricao;

    public static void main(String[] args) {
        System.out.println(("oi"));
    }

    /**
     * Construtor
     * 
     * @param descricao Descrição da tarefa
     */
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Getter de this.descricao
     */
    String getDescricao() {
        return this.descricao;
    }


}
