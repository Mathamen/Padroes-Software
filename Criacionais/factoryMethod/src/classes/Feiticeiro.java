package classes;

public class Feiticeiro implements IClasseRPG{

	@Override
	public void ataqueM1() {
		System.out.println("Cãos zumbis evocados!");
		
	}

	@Override
	public void ataqueM2() {
		System.out.println("Exército de Carrancos convocado!");
		
	}

	@Override
	public void equiparArma() {
		System.out.println("Varinha equipada!");
		
	}

	@Override
	public void equiparArmadura() {
		System.out.println("Armadura de feiticeiro equipada");
		
	}

}
