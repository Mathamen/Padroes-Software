package principal;

import java.util.ArrayList;
import java.util.Random;

public class Oponente {
    private static ArrayList<String> combatesID = new ArrayList<>();
    
    static {
        combatesID.add("Bombardeio");
        combatesID.add("Guerrilha");
        combatesID.add("Cavalaria");
        combatesID.add("Infantaria Pesada");
    }
    
    public String gerar() {
        Random random = new Random();
        String oponente = combatesID.get(random.nextInt(combatesID.size()));
        switch(oponente) {
        case "Bombardeio":
        	System.out.println("Você nota um monte de arqueiros prontos para bombardear, o que faz?");
        	break;
        case "Guerrilha":
        	System.out.println("Você nota alguns em tocaia, o que faz?");
        	break;
        	
        case "Cavalaria":
        	System.out.println("Você vê um monte de cavaleiros pesados, o que faz?");
        	break;
        case "Infataria Pesada":
        	System.out.println("Você vê uma enorme quantidade de infantaria pesada, o que faz?");
        	break;
        }
        
        
        return oponente;
    }
}