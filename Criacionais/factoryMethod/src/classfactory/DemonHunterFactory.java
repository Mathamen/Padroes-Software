package classfactory;

import classes.DemonHunter;
import classes.IClasseRPG;

public class DemonHunterFactory extends FactoryMethod{

	@Override
	public IClasseRPG criarPersonagem() {
		playerCount ++;
		return new DemonHunter();
	}
	
}
