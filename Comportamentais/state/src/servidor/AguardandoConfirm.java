package servidor;

public class AguardandoConfirm extends State{

    public AguardandoConfirm(CentralPedidos c){
        super(c);
    }

    @Override
    protected void confirmarPedido() {
        central.setEstado(new PedidoConfirmado(central));
        System.out.println("Pedido confirmado");

    }

    @Override
    protected void prepararPedido() {
        System.out.println("O pedido ainda não foi confirmado");
    }

    @Override
    protected void irParaEntrega() {
        System.out.println("O pedido ainda não foi confirmado!");
    }

    @Override
    protected void concluirPedido() {
        System.out.println("O pedido ainda não foi confirmado!");
    }
}
