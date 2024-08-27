package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to store or manage a list of tasks
 */
public class ListaTarefa {
    /**
     * Attribute that stores the list of tasks
     */
    private List<Tarefa> tarefaList;

    /**
     * Constructor
     */
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    /**
     * Create a task and add this task to the list of tasks
     * 
     * @param descricao String description of the task
     */
    public void adicionarTarefa(String descricao) {
        this.tarefaList.add(new Tarefa(descricao));
    }

    /**
     * Allow remove a task of the list based on its description
     * 
     * @param descricao Description of the task to be removed. Note, more than 
     *                  one task can have the same description
     */
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for (Tarefa tarefa: this.tarefaList) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    /**
     * Allow get the number of tasks in the this.tarefaList
     * 
     * @return The number of tasks in this.tarefasList
     */
    public int obterNumeroTotalTarefas() {
        return this.tarefaList.size();
    }

    /**
     * Allow print the description of all tasks
     * 
     * Why print and not return? I don't know, the teacher make the exercise this way
     * 
     * In my opinion the name of the method needs to be "imprimirDescricoesTarefas()"
     */
    public void obterDescricoesTarefas() {
        System.out.println(this.tarefaList);
    }
}