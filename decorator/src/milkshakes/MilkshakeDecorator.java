package milkshakes;

public abstract class MilkshakeDecorator extends Milkshake{
    private Milkshake complemento;

    public MilkshakeDecorator(Milkshake ms){
        this.complemento = ms;

    }

    public void monta(float preco){
        complemento.monta(preco);
    }


}
