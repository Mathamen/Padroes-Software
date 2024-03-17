package view;

import control.UserController;
import java.util.Scanner;


public class ProgramaPrincipal {

	public static void main(String[] args) {
		 UserController control = new UserController();

	        System.out.println("Escolha a rota que quer pelo ID");
	        control.showRotas();
	        
	        Scanner scanner = new Scanner(System.in);
	        int id = scanner.nextInt();
	        scanner.nextLine();
	        

	        control.reservarAviao(id);
	        scanner.close();
	}

}