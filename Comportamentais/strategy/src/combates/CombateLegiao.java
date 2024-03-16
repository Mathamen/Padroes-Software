package combates;

import estrategias.IEstrategia;
import estrategias.Legiao;

public class CombateLegiao extends Combate{

	@Override
	public IEstrategia criaEstrategia() {
		return new Legiao();
	}

}
