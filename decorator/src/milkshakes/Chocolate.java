package milkshakes;

public class Chocolate extends Milkshake{
    private float preco = 5.0f;
    @Override
    public void monta(float preco) {
        System.out.println("Preço total= " + (this.preco + preco));
        System.out.println("Montando um milkshake de chocolate");
    }
}
