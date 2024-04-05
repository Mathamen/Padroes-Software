package pacote;

class TarefaSimples implements Tarefa {
    private boolean concluida = false;

    @Override
    public void concluir() {
        concluida = true;
    }

    @Override
    public void desfazerConclusao() {
        concluida = false;
    }

    @Override
    public boolean estaConcluida() {
        return concluida;
    }
}
