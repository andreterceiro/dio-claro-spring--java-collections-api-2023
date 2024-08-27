package list.operacoesBasicas;

public class Tarefa {
    /**
     * Atributo que armazena a descrição da tarefa
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
     * Getter de this.descricao
     */
    String getDescricao() {
        return this.descricao;
    }
}
