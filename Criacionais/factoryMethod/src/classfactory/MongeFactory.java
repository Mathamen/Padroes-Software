package classfactory;

import classes.IClasseRPG;
import classes.Monge;

public class MongeFactory extends FactoryMethod{

	@Override
	public IClasseRPG criarPersonagem() {
		playerCount++;
		return new Monge();
	}
	
}
