package combates;

import estrategias.IEstrategia;
import estrategias.Testudo;

public class CombateTestudo extends Combate{

	@Override
	public IEstrategia criaEstrategia() {
		return new Testudo();
	}

}
