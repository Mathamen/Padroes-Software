package pacote;
import java.util.ArrayList;
import java.util.List;

class TarefaComposta implements Tarefa {
    private List<Tarefa> subtarefas = new ArrayList<>();

    @Override
    public void concluir() {
        for (Tarefa tarefa : subtarefas) {
            tarefa.concluir();
        }
    }

    @Override
    public void desfazerConclusao() {
        for (Tarefa tarefa : subtarefas) {
            tarefa.desfazerConclusao();
        }
    }

    @Override
    public boolean estaConcluida() {
        for (Tarefa tarefa : subtarefas) {
            if (!tarefa.estaConcluida()) {
                return false;
            }
        }
        return true;
    }

    // Método para adicionar subtarefa
    public void adicionarSubtarefa(Tarefa tarefa) {
        subtarefas.add(tarefa);
    }

    // Método para remover subtarefa
    public void removerSubtarefa(Tarefa tarefa) {
        subtarefas.remove(tarefa);
    }
}
