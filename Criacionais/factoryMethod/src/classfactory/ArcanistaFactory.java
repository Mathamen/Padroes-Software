package classfactory;

import classes.Arcanista;
import classes.IClasseRPG;

public class ArcanistaFactory extends FactoryMethod{

	@Override
	public IClasseRPG criarPersonagem() {
		playerCount++;
		return new Arcanista();
	}

}
