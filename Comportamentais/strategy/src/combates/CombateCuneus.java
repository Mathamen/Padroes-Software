package combates;

import estrategias.Cuneus;
import estrategias.IEstrategia;

public class CombateCuneus extends Combate{

	@Override
	public IEstrategia criaEstrategia() {
		return new Cuneus();
		
	}

}
