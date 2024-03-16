package toppings;

import milkshakes.Milkshake;
import milkshakes.MilkshakeDecorator;

public class MM extends MilkshakeDecorator {
    private float preco = 8.50f;

    public MM(Milkshake md){
    super(md);
    }

    public void monta(float preco){
        super.monta(preco + this.preco);
        System.out.println("Colocando MM de amendoim");
    }


}
