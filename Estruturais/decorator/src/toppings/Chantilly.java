package toppings;

import milkshakes.Milkshake;
import milkshakes.MilkshakeDecorator;

public class Chantilly extends MilkshakeDecorator {
    private float preco = 9.50f;

    public Chantilly(Milkshake md){
        super(md);
    }

    public void monta(float preco){
        super.monta(preco + this.preco);
        System.out.println("Colocando paçoca");
    }


}
