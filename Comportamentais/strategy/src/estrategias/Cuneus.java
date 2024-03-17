package estrategias;

import principal.GameStats;

public class Cuneus implements IEstrategia {

	@Override
	public void lutar(String inimigo) {
		if(inimigo.equals("Bombardeio") || inimigo.equals("Flanqueador") ){
			System.out.println("Seu exército morre por incompetência sua.");
			GameStats.vivo =false;

		}
		else {
			System.out.println("Seu exército sobrevive para a próxima luta.");
			GameStats.roundsBy++;
			GameStats.score = GameStats.score + 100 * GameStats.roundsBy; 
			if (inimigo.equals("Cavalaria")){
				System.out.println("Você sente que usou a melhor estratégia possível.");
				GameStats.perfectRounds++;
				GameStats.score= GameStats.score + 200*GameStats.roundsBy;
			}

		}

	}

}