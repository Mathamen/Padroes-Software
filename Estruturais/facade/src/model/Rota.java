package model;

import java.util.ArrayList;

public class Rota {
	protected static int rotaCount;
	protected int rotaID;
	protected String inicio;
	protected String fim;
	protected float preco;
	protected int capacidade;
	protected ArrayList<User> passageiros= new ArrayList<User>();
	
	public Rota(String parInicio, String parFim, float parPreco, int parCapacidade) {
		this.inicio = parInicio;
		this.fim = parFim;
		this.preco = parPreco;
		this.rotaID = rotaCount;
		this.capacidade = parCapacidade;
		rotaCount ++;
	}
	
	public void adicionarPassageiro(User u) {
		if (passageiros == null) {
			passageiros = new ArrayList<>();
		}
		passageiros.add(u);
		capacidade --;
	}
	 public String toString() {
		 return "Rota " + rotaID + ":" + "De " + inicio + " para " + fim + "," + "por apenas " + preco;
	 }
	        
	
	
	
	
}
