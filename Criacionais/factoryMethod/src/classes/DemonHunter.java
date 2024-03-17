package classes;

public class DemonHunter implements IClasseRPG{

	@Override
	public void ataqueM1() {
		System.out.println("Flecha voraz disparada!");
		
	}

	@Override
	public void ataqueM2() {
		System.out.println("Sentinela instalada");
		
	}

	@Override
	public void equiparArma() {
		System.out.println("Besta de uma mão equipada");
		
	}

	@Override
	public void equiparArmadura() {
		System.out.println("Capuz equipado");
		
	}

}
