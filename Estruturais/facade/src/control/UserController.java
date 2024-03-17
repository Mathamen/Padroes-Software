package control;

import java.util.Scanner;

import model.ModelFacade;
import model.Pagamento;
import model.User;
/**
 * Esta classe simula o control em um padrão MVC. 
 * Neste código, é responsável por mostrar as rotas e pedir ao model para fazer a reserva.
 * 
 */
public class UserController {
	
    private static ModelFacade modelFacade = new ModelFacade();
    private static Pagamento pagamento= new Pagamento();
    private boolean autenticado = false;
    
    // Estou declarando este scanner aqui pois utilizo em diversas funções na classe
    // Para evitar abre/fecha de scanner, e o código possivelmente quebrar por conta disso.
    private static Scanner s= new Scanner(System.in);
    
    
    
    
    
    
  /**
   * Este método recebe as rotas de modelFacade e exibe na tela.
   */
    public void showRotas() {
    	System.out.println(modelFacade.giveRotas());
    	}
    /**
     * Esta funão , junto com ModelFacade, faz a reserva.
     * Primeiramente, solicita ao usuário para digitar seu Login, que é autenticado pela facade.
     * Em seguida, se autenticado, solicita a Facade para reservar.
     * @param rota Recebe como parâmetro um inteiro, que corresponde à rota escolhida.
     * 
     * 
     */
    public void reservarAviao(int rota) {
    	float total = 0;
    	
    	if (autenticado ==false) {
    		System.out.println("Insira seu login: EMAIL SENHA");
    		String entrada = s.nextLine();
    		String[] partes = entrada.split(" ");
    		if (modelFacade.auth(partes[0], partes[1])) {
    			autenticado = true;
        	
    			modelFacade.reservar(rota, partes[0]);
    			total = total + modelFacade.giveAviaoPreco(Integer.toString(rota));
    			System.out.println("Gostaria também de um hotel? Responda com S ou N");
    			String output = s.nextLine();
    			if (output.equals("S")) {
    				total = total +reservarHotel(rota);
    				
    			}
    			System.out.println("Gostaria também de reservar um carro? Responda com S ou N");
    			// ESTÁ DANDO RUIM AQUI
    			String output2 = s.nextLine();
    			if (output2.equals("S"))
    				total = total + reservarCarro(rota);
    		}
    		
    		pagamento.pagar(total);
    		

        }
        
    }
    /**
     * Esta função interage com a facade para reservar o hotel
     * 
     * @param rota recebe como parâmetro um inteiro que indica a rota para checar o local dos hotéis.
     */
    public float reservarHotel(int rota) {
    	modelFacade.mostrarHoteis(rota);	
    	System.out.println("Escolha o hotel que quer, pelo ID");
    	String hotelID= s.nextLine();
    	modelFacade.reservarHotel(Integer.parseInt(hotelID));
    	return modelFacade.hotelPreco(Integer.parseInt(hotelID));
    }
    
    
    /**
     * Esta função interage com a facade para reservar o carro
     * 
     * @param rota recebe como parâmetro um inteiro que indica a rota para checar o local do carro.
     */
    
    public float reservarCarro(int rota) {
    	modelFacade.mostrarCarros(rota);	
    	System.out.println("Escolha o carro que quer, pelo ID");
    	String carroID= s.nextLine();
    	modelFacade.reservarCarro(Integer.parseInt(carroID));
    	return modelFacade.carroPreco(Integer.parseInt(carroID));
    	
    }
    
}