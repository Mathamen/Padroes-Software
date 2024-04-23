package pacote;

import inimigos.Inimigo;
import inimigos.InimigoArqueiro;
import inimigos.InimigoLeve;
import inimigos.InimigoPesado;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
      //Inicialização do catálogo de inimigos. Em um código mais estruturado, poderia facilmente ser aplicado
      //O padrão de design memento.
      ArrayList<Inimigo> catalogo = new ArrayList<Inimigo>();
      InimigoLeve il = new InimigoLeve(100,50, "Humano");
      InimigoArqueiro ia = new InimigoArqueiro(80, 60, "Elfo");
      InimigoPesado ip = new InimigoPesado(300,80, "Ord");
      catalogo.add(il);
      catalogo.add(ia);
      catalogo.add(ip);


      Scanner sc= new Scanner(System.in);
      System.out.println("Digite a quantidade de inimigos leves que quer enfrentar");
      int inputLeve = sc.nextInt();

      System.out.println("Digite a quantidade de arqueiros que quer enfrentar");
      int inputArqueiro = sc.nextInt();

      System.out.println("Digite a quantidade de inimigos pesados que quer enfrentar");
      int inputPesado = sc.nextInt();

      for (int i = 0; i < inputLeve; i++) {
            InimigoLeve inim= (InimigoLeve) catalogo.get(0).clonar();
            inim.atacar();

      }

      for (int i = 0; i < inputArqueiro; i++) {
          InimigoArqueiro inim= (InimigoArqueiro) catalogo.get(1).clonar();
          inim.atacar();

      }

      for (int i = 0; i < inputPesado; i++) {
          InimigoPesado inim= (InimigoPesado) catalogo.get(2).clonar();
          inim.atacar();
      }







    }
}