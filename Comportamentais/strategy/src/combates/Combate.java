package combates;

import estrategias.IEstrategia;

public abstract class Combate {
	public abstract IEstrategia criaEstrategia();
	public void comecarCombate(String inimigo) {
			IEstrategia e= criaEstrategia();
			e.lutar(inimigo);
		}
	}

