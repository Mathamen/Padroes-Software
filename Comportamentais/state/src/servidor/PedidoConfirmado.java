package servidor;

public class PedidoConfirmado extends State{


    protected PedidoConfirmado(CentralPedidos c){
        super(c);
    }

    @Override
    protected void confirmarPedido() {
        System.out.println("O pedido já foi confirmado");

    }

    @Override
    protected void prepararPedido() {
      central.setEstado(new EmPreparo(central));
        System.out.println("Seu podrão será preparado pelo Jacquin");
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
