package list.operacoesBasicas;

/**
 * Task class
 */
public class Tarefa {
    /**
     * Attribute that stores the description of the task
     */
    String descricao;

    /**
     * Construtor
     * 
     * @param descricao Descrição da tarefa
     */
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Getter of this.descricao
     */
    String getDescricao() {
        return this.descricao;
    }
}
