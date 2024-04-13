package pacote;

public class Produto {
    public String nome;
    public double preco;
    public String categoria;

    public Produto(String nome, double preco, String categoria){
        this.nome=nome;
        this.preco=preco;
        this.categoria=categoria;

    }

    @Override
    public String toString() {
        return "Categoria:" +this.categoria +  ",Produto:" + this.nome +", Preço: " + this.preco;
    }
}
