package servidor;

public class EmPreparo extends State{
    public EmPreparo(CentralPedidos c){
        super(c);
    }


    @Override
    protected void confirmarPedido() {
        System.out.println("O pedido já está sendo feito");
    }

    @Override
    protected void prepararPedido() {
        System.out.println("O pedido já está sendo feito");
    }

    @Override
    protected void irParaEntrega() {
        central.setEstado(new Entregando(central));
        System.out.println("Max Verstappen está indo entregar seu podrão, vai chegar mais rápido do que o tempo de ler");
    }

    @Override
    protected void concluirPedido() {
        System.out.println("O pedido ainda está sendo feito");
    }
}
