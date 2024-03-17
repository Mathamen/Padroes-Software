package classes;

public class Arcanista implements IClasseRPG{

	@Override
	public void ataqueM1() {
		System.out.println("Projétil Mágico conjurado!");
		
	}

	@Override
	public void ataqueM2() {
		System.out.println("Teleporte conjurado!");
		
	}

	@Override
	public void equiparArma() {
		System.out.println("Cajado equipado");
		
	}

	@Override
	public void equiparArmadura() {
		System.out.println("Roupas de couro equipadas");
		
	}

}
