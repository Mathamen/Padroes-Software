package servidor;

public class Entregando extends State{
    public Entregando(CentralPedidos central) {
        super(central);
    }

    @Override
    protected void confirmarPedido() {
        System.out.println("O pedido já está sendo entregue");
    }

    @Override
    protected void prepararPedido() {
        System.out.println("O pedido já está sendo entregue");
    }

    @Override
    protected void irParaEntrega() {
        System.out.println("O pedido já está sendo entregue");
    }

    @Override
    protected void concluirPedido() {
        central.setEstado(null);
        System.out.println("Gorjetinha, chefe?");
    }
}
