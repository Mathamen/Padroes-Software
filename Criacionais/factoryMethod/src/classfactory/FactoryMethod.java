package classfactory;

import classes.IClasseRPG;

public abstract class FactoryMethod {
	public static int playerCount =0;
	public abstract IClasseRPG criarPersonagem();
}
