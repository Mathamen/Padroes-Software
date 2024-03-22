package servidor;

public abstract class State {
    protected CentralPedidos central;

    public State(CentralPedidos c) {
        this.central = c;
    }

    protected abstract void confirmarPedido();

    protected abstract void prepararPedido();

    protected abstract void irParaEntrega();

    protected abstract void concluirPedido();

    protected void setState(State novoEstado) {
        central.setEstado(novoEstado);
    }

}