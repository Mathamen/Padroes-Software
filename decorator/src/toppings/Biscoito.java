package toppings;

import milkshakes.Milkshake;
import milkshakes.MilkshakeDecorator;

public class Biscoito extends MilkshakeDecorator {
    private float preco = 4.50f;

    public Biscoito(Milkshake md){
    super(md);
    }

    public void monta(float preco){
        super.monta(preco + this.preco);
        System.out.println("Colocando biscoito");
    }


}
