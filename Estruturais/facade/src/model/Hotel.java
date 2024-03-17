package model;

public class Hotel {
	protected String nome;
	protected String local;
	protected float preco;
	protected int vagas;
	
	
	public Hotel(String parNome, String parLocal, float parPreco, int parVagas) {
		this.nome = parNome;
		this.local= parLocal;
		this.preco = parPreco;
		this.vagas= parVagas;
	}
	
	
	
	public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }


    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getVagas() {
        return vagas;
    }
    public void setVagas(int vagas) {
        this.vagas = vagas;
    }
    public String toString() {
    	return "hotel" + this.nome + ", preço: " + this.preco;
    }
}
