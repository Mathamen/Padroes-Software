package principal;

import java.util.Scanner;

import combates.Combate;
import combates.CombateAlae;
import combates.CombateCuneus;
import combates.CombateLegiao;
import combates.CombateTestudo;
import estrategias.IEstrategia;
import principal.GameStats;
import principal.Oponente;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		Oponente o =new Oponente();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Formações:");
		System.out.println("   @");
		System.out.println("  @@@");
		System.out.println(" @@@@@");
		System.out.println("@@@@@@@ \n");
		System.out.println("Cuneus: Formação militar em formato triangular, concentrando o poder de combate em um ponto focal para perfurar e dividir as linhas inimigas.\n");
		
		System.out.println("");
		System.out.println("   @");
		System.out.println("  ||||");
		System.out.println("Alae consiste em cavalaria leve, recrutada de outros países, como mercenários. Bons para flanquear");
		
		System.out.println(" ");
		System.out.println("Formação:");
		System.out.println("  @@@@@@@@@@@@@");
		System.out.println("  @@@@@@@@@@@@@");
		System.out.println("Legiões romanas: Unidades flexíveis e disciplinadas, compostas por 5.000 soldados de infantaria.");
		
		System.out.println(" ");
		System.out.println("Formação:");
		System.out.println("---------");
		System.out.println("|@@@@@@@@|");
		System.out.println("|@@@@@@@@|");
		System.out.println("|@@@@@@@@|");
		System.out.println("---------");

		System.out.print("Testudo: Formação defensiva em que os soldados se agrupam em uma formação compacta, usando");
		System.out.println(" seus escudos para se protegerem de ataques frontais e aéreos, enquanto avançam ou se defendem.");

		
		
		while(GameStats.vivo == true) {
			String inimigo= o.gerar();
			System.out.println("Qual estratégia vai usar?");
			String input = sc.nextLine();
			
			switch(input) {
				case "Cuneus":
					CombateCuneus cC= new CombateCuneus();
					cC.comecarCombate(inimigo);
					break;
					
				case "Alae":
					CombateAlae cA= new CombateAlae();
					cA.comecarCombate(inimigo);
					break;
				
					
				case "Legiao":
					CombateLegiao cL = new CombateLegiao();
					cL.comecarCombate(inimigo);
					break;
				
				case "Testudo":
					CombateTestudo cT = new CombateTestudo();
					cT.comecarCombate(inimigo);
					break;
					
				default:
					System.out.println("favor digitar novamente, vamos trocar o combate");
					break;
			}
		}
		System.out.println("Você perdeu! Score:" + GameStats.score +", Rounds Perfeitos: " +GameStats.perfectRounds);
		sc.close();
	}
}
