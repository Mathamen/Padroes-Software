package milkshakes;

public class Baunilha extends Milkshake{
    private float preco = 4.0f;
    @Override
    public void monta(float preco) {
        System.out.println("Preço total= " + (this.preco + preco));
        System.out.println("Montando um milkshake de baunilha");
    }
}
