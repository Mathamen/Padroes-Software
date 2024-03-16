package estrategias;

import principal.GameStats;

public class Legiao implements IEstrategia{

	@Override
	public void lutar(String inimigo) {
		if(inimigo.equals("Guerrilha" )|| inimigo.equals("Bombardeio")){
			System.out.println("Seu exército morre por incompetência sua.");
			GameStats.vivo =false;
		}
		else {
			System.out.println("Seu exército sobrevive para a próxima luta.");
			GameStats.roundsBy++;
			GameStats.score = GameStats.score + 100 * GameStats.roundsBy; 
			if (inimigo.equals("Infantaria Pesada") ) {
				System.out.println("Você sente que usou a melhor estratégia possível.");
				GameStats.perfectRounds++;
				GameStats.score= GameStats.score + 200*GameStats.roundsBy;
		}
		
	}
	}
}
