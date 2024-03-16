package toppings;

import milkshakes.Milkshake;
import milkshakes.MilkshakeDecorator;

public class Pacoca extends MilkshakeDecorator {
    private float preco = 5.50f;

    public Pacoca(Milkshake md){
        super(md);
    }

    public void monta(float preco){
        super.monta(preco + this.preco);
        System.out.println("Colocando paçoca");
    }


}
