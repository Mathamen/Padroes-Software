package main;

import java.util.Scanner;

import classes.IClasseRPG;
import classfactory.*;


public class ProgramaPrincipal {
	public static void main(String[] args) {
		boolean b = true;
		Scanner sc = new Scanner(System.in);
		
		ArcanistaFactory af = new ArcanistaFactory();
		BarbaroFactory bf = new BarbaroFactory();
		CruzadoFactory cf= new CruzadoFactory();
		DemonHunterFactory df = new DemonHunterFactory();
		FeiticeiroFactory ff = new FeiticeiroFactory();
		MongeFactory mf= new MongeFactory();
		NecromanteFactory nf= new NecromanteFactory();
		while (b) {
			int option=0;
			System.out.println("Digite um número para criar uma classe");
			System.out.println("1-Arcanista, 2-Bárbaro, 3-Cruzado, "
					+ "4-DemonHunter, 5-Feiticeiro, 6-Monge, 7- Necromante, 0 encerra");
			try {
				option = sc.nextInt();
				
			}catch (Exception e) {
				System.out.println("Não sabe brincar, código não vai funcionar");
			}
			switch(option) {
			case 0:
				b=false;
				System.out.println("Player Count= "+ FactoryMethod.playerCount);
				break;
			case 1:
				IClasseRPG Arcanista = af.criarPersonagem();
				Arcanista.ataqueM1();
				Arcanista.ataqueM2();
				Arcanista.equiparArma();
				Arcanista.equiparArmadura();
				break;
				
			case 2:
				IClasseRPG barbaro = bf.criarPersonagem();
				barbaro.ataqueM1();
				barbaro.ataqueM2();
				barbaro.equiparArma();
				barbaro.equiparArmadura();
				break;
			
			case 3:
				IClasseRPG cruzado = cf.criarPersonagem();
				cruzado.ataqueM1();
				cruzado.ataqueM2();
				cruzado.equiparArma();
				cruzado.equiparArmadura();
				break;
				
			case 4:
				IClasseRPG demonHunter = df.criarPersonagem();
				demonHunter.ataqueM1();
				demonHunter.ataqueM2();
				demonHunter.equiparArma();
				demonHunter.equiparArmadura();
				break;
				
			case 5:
				IClasseRPG feiticeiro = ff.criarPersonagem();
				feiticeiro.ataqueM1();
				feiticeiro.ataqueM2();
				feiticeiro.equiparArma();
				feiticeiro.equiparArmadura();
				break;
				
			case 6:
				IClasseRPG monge = mf.criarPersonagem();
				monge.ataqueM1();
				monge.ataqueM2();
				monge.equiparArma();
				monge.equiparArmadura();
				break;
			case 7:
				IClasseRPG necromante = nf.criarPersonagem();
				necromante.ataqueM1();
				necromante.ataqueM2();
				necromante.equiparArma();
				necromante.equiparArmadura();
				break;
			default: break;
				
			}
			
		}
	}
}
