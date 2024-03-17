package model;

public class Carro {
	protected String modelo;
	protected float preco;
	protected String localizacao;
	protected boolean vago = true;
	
	public String toString() {
		return "Modelo: " + this.modelo + ", preco:" +this.preco;
	}
	public Carro(String parModelo, float parPreco, String parLocalizacao) {
		this.modelo = parModelo;
		this.preco= parPreco;
		this.localizacao= parLocalizacao;
	}
	
	public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public boolean isVago() {
        return vago;
    }

    public void setVago(boolean vago) {
        this.vago = vago;
    }
}
