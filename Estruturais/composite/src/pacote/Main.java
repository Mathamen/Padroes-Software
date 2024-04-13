package pacote;

// Importando as classes TarefaSimples e TarefaComposta

public class Main {
    public static void main(String[] args) {
        // Criando tarefas normais
        TarefaSimples tarefa1 = new TarefaSimples();
        TarefaSimples tarefa2 = new TarefaSimples();
        TarefaSimples tarefa3 = new TarefaSimples();
        TarefaSimples tarefa4 = new TarefaSimples();
        TarefaSimples tarefa5 = new TarefaSimples();
        TarefaSimples tarefa6 = new TarefaSimples();
        TarefaSimples tarefa7 = new TarefaSimples();
        TarefaSimples tarefa8 = new TarefaSimples();
        TarefaSimples tarefa9 = new TarefaSimples();
        TarefaSimples tarefa10 = new TarefaSimples();
        TarefaSimples tarefa11 = new TarefaSimples();
        TarefaSimples tarefa12 = new TarefaSimples();

        // Criando tarefas compostas, que podem ter filhos
        TarefaComposta tarefaPrincipal1 = new TarefaComposta();
        TarefaComposta tarefaPrincipal2 = new TarefaComposta();
        TarefaComposta tarefaPrincipal3 = new TarefaComposta();
        TarefaComposta tarefaPrincipal4 = new TarefaComposta();

        // Adicionando as tarefas normais nas compostas
        tarefaPrincipal1.adicionarSubtarefa(tarefa1);
        tarefaPrincipal1.adicionarSubtarefa(tarefa2);
        tarefaPrincipal1.adicionarSubtarefa(tarefa3);
        tarefaPrincipal1.adicionarSubtarefa(tarefaPrincipal2);

        tarefaPrincipal2.adicionarSubtarefa(tarefaPrincipal3);

        tarefaPrincipal3.adicionarSubtarefa(tarefa4);
        tarefaPrincipal3.adicionarSubtarefa(tarefa5);
        tarefaPrincipal3.adicionarSubtarefa(tarefa6);
        tarefaPrincipal3.adicionarSubtarefa(tarefa7);
        tarefaPrincipal3.adicionarSubtarefa(tarefa8);
        tarefaPrincipal3.adicionarSubtarefa(tarefa9);
        tarefaPrincipal3.adicionarSubtarefa(tarefaPrincipal4);

        tarefaPrincipal4.adicionarSubtarefa(tarefa10);
        tarefaPrincipal4.adicionarSubtarefa(tarefa11);
        tarefaPrincipal4.adicionarSubtarefa(tarefa12);

        // Testes daqui para baixo
        tarefa1.concluir();
        tarefa2.concluir();
        tarefa3.concluir();

        System.out.println("Tarefa principal 1 concluída? " + tarefaPrincipal1.estaConcluida()); // Deve imprimir false

        tarefaPrincipal1.concluir(); // Deve concluir todas as subtarefas
        System.out.println("Tarefa principal 1 concluída? " + tarefaPrincipal1.estaConcluida()); // Deve imprimir true

        tarefa3.desfazerConclusao();
        System.out.println("Tarefa principal 1 concluída? " + tarefaPrincipal1.estaConcluida()); // Deve imprimir false
    }
}
