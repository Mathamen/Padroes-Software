package classes;

public class Necromante implements IClasseRPG{

	@Override
	public void ataqueM1() {
		System.out.println("Espeto de ossos disparado");
		
	}

	@Override
	public void ataqueM2() {
		System.out.println("Reviviver conjurado, os mortos estão contigo!");
		
	}

	@Override
	public void equiparArma() {
		System.out.println("Livro dos mortos equipado");
		
	}

	@Override
	public void equiparArmadura() {
		System.out.println("Armadura amaldiçoada equipada");
		
	}

}
