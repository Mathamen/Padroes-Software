package combates;

import estrategias.Alae;
import estrategias.IEstrategia;

public class CombateAlae extends Combate{

	@Override
	public IEstrategia criaEstrategia() {
		return new Alae();
	}
	
}
