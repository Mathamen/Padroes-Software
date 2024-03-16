package toppings;

import milkshakes.Milkshake;
import milkshakes.MilkshakeDecorator;

public class Gotas extends MilkshakeDecorator {
    private float preco = 6.50f;

    public Gotas(Milkshake md){
        super(md);
    }

    public void monta(float preco){
        super.monta(preco + this.preco);
        System.out.println("Colocando gotas de chocolate");
    }


}
