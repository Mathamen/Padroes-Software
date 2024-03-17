package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Esta classe é uma simulação de uma classe facde, de como ela atuaria.
 * Percebe-se como ela ajuda a colher informações, e como protege tais (as que seriam protected)
 * Portanto, esta classe simplifica muito a conexação das informações do pacote model, não precisando 
 * pegar diretamente com as outras classes model, deixando mais acessível e seguro o código.
 */
public class ModelFacade {
	
	 private HashMap<String,User> users;
	 private HashMap<String,Rota> rotas;
	 private ArrayList<Carro> carros;
	 private ArrayList<Hotel> hoteis;
	 

	    public ModelFacade() {
	        users = new HashMap<>();
	        // Exemplo de inicialização de dados
	        User user1 = new User("1", "usuario1@example.com", "senha1", "salt1");
	        User user2 = new User("2", "usuario2@example.com", "senha2", "salt2");
	        users.put(user1.email,user1);
	        users.put(user2.email,user2);
	        
	        rotas= new HashMap<>();
	        Rota rota1= new Rota("Brasil","Holanda", 1000, 100);
	        Rota rota2= new Rota("Brasil","Alemanha", 2000 ,150);
	        Rota rota3= new Rota("Brasil","China", 9000, 120);
	        rotas.put(Integer.toString(rota1.rotaID),rota1);
	        rotas.put(Integer.toString(rota2.rotaID),rota2);
	        rotas.put(Integer.toString(rota3.rotaID),rota3);
	        
	        hoteis = new ArrayList<>();
	        Hotel holanda1= new Hotel("Holanda express", "Holanda", 3000, 12);
	        Hotel holanda2= new Hotel("Holanda premiumPlus", "Holanda", 10000, 2);
	        
	        Hotel alemanha1 = new Hotel("Alemenha 7X1", "Alemanha", 700, 5);
	        Hotel alemanha2= new Hotel("Germany's Mountains ", "Alemanha", 8000, 3);
	        
	        Hotel china1= new Hotel("China's Best", "China", 300, 120);
	        Hotel china2= new Hotel("China's Premium Ultra Plus", "China", 6000, 5);
	        
	        hoteis.add(holanda1);
	        hoteis.add(holanda2);
	        hoteis.add(alemanha1);
	        hoteis.add(alemanha2);
	        hoteis.add(china1);
	        hoteis.add(china2);
	        
	        carros= new ArrayList<>();
	        Carro carchina1= new Carro("fiat palio", 50, "China");
	        Carro carchina2 = new Carro("BYD dolphin", 40, "China");
	        Carro carhol1= new Carro("Porsche 911", 3000, "Holanda");
	        Carro carale = new Carro("Porsche Cayenne", 500, "Alemanha");
	        carros.add(carchina1);
	        carros.add(carchina2);
	        carros.add(carhol1);
	        carros.add(carale);
	        
	        
	    }

	    public ArrayList<Rota>giveRotas(){
	    	return new ArrayList<>(rotas.values());
	    	}
	    
	  
	    
	    public boolean auth(String email, String senha) {
	    	if (!users.containsKey(email)) {System.out.println("nao tem esse usuário");return false;}
	    		User u=users.get(email);
	    		if (u.email.equals(email) && u.pass.equals(senha)) {
	    			return true;
	    		}
	    		System.out.println("senha errada");
	    		return false;
	    	
	    }
	    public void reservar(int rotaid, String email) {
	    	String s= Integer.toString(rotaid);
	    	if(!rotas.containsKey(s)) {System.out.println("nao tem essa rota"); return;}
	    	Rota r= rotas.get(s);
	    	r.adicionarPassageiro(users.get(email));
	    	
	    	}
	    
	    
	    public float giveAviaoPreco(String rotaID) {
	    	Rota r =rotas.get(rotaID);
	    	return r.preco;
	    }
	    
	    public void mostrarHoteis(int rota) {
	    	Rota r = rotas.get(Integer.toString(rota));
	    	for (int i=0; i<hoteis.size(); i++) {
	    		Hotel h= hoteis.get(i);
	    		if (r.fim.equals(h.local) && h.vagas>0){
	    			System.out.println("ID hotel:" + i + ", " + h.toString());
	    		}
	    	}
	    }
	    public float hotelPreco(int id) {
	    	return hoteis.get(id).preco;
	    }
	    public void reservarHotel(int id) {
	    	Hotel h= hoteis.get(id);
	    	h.vagas = h.getVagas() -1;
	    	System.out.println("hotel reservado aproveite");}

		public void mostrarCarros(int rota) {
			Rota r= rotas.get(Integer.toString(rota));
			for (int i=0; i< carros.size();i++) {
				Carro carrinho = carros.get(i);
				if (r.fim.equals(carrinho.localizacao) && carrinho.vago)
					System.out.println("ID do carro: " + i + " "+ carrinho);
				}
				
			
		}

		public float carroPreco(int carroID) {
			return carros.get(carroID).preco;
		}

		public void reservarCarro(int carroID) {
			Carro c= carros.get(carroID);
			c.vago= false;
			System.out.println("carro reservado, aproveite seu possante");
			
		}
	    	
	    }

