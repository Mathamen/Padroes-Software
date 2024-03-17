package classfactory;

import classes.Feiticeiro;
import classes.IClasseRPG;

public class FeiticeiroFactory extends FactoryMethod{

	@Override
	public IClasseRPG criarPersonagem() {
		playerCount++;
		return new Feiticeiro();
	}

}
