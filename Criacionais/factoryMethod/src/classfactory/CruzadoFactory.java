package classfactory;

import classes.Cruzado;
import classes.IClasseRPG;

public class CruzadoFactory extends FactoryMethod{

	@Override
	public IClasseRPG criarPersonagem() {
		playerCount++;
		return new Cruzado();
	}

}
