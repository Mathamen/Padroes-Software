package classfactory;

import classes.IClasseRPG;
import classes.Necromante;

public class NecromanteFactory extends FactoryMethod{

	@Override
	public IClasseRPG criarPersonagem() {
		playerCount++;
		return new Necromante();
	}
	
}
