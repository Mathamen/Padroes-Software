package model;

/**
 * Esta classe simula um usuário, com alguns possíveis campos de uma classe.
 * Ela possui diversos possíveis atributos, id, email, senha (pass), salt (para casos web mais avaçados).
 * Neste código de exemplo, não se utilizam todos.
 */
public class User {
	protected String id;
	protected String email;
	protected String pass;
	protected String salt;
	
	
	 public User(String id, String email, String pass, String salt){
	        this.id = id;
	        this.email = email;
	        this.pass = pass;
	        this.salt = salt;
	    }
	 
	
	 
}
