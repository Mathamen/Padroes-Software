package classfactory;

import classes.Barbaro;
import classes.IClasseRPG;

public class BarbaroFactory extends FactoryMethod{

	@Override
	public IClasseRPG criarPersonagem() {
		playerCount++;
		return new Barbaro();
	}

}
