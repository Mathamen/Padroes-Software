package milkshakes;

public class Morango extends Milkshake{
    private float preco = 3.50f;
    @Override
    public void monta(float preco) {
        System.out.println("Preço total= " + (this.preco + preco));
        System.out.println("Montando um milkshake de chocolate");
    }
}
