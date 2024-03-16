package principal;

import milkshakes.Baunilha;
import milkshakes.Chocolate;
import milkshakes.Milkshake;
import milkshakes.Morango;
import toppings.*;
import java.util.Scanner;

public class Atendente {
    // Esta classe poderia se beneficiar de um HashMap tanto para os sabores quanto para os toppings
    // Além disso, poderia também mesclar outros padrões de software.
    private static Scanner s= new Scanner(System.in);

    public Milkshake escolherSabor() {
        System.out.println("Qual sabor de milkshake você quer? 1 para Baunilha, 2 para Chocolate e 3 para Morango");
        int sabor=0;
        try {
            sabor = s.nextInt();

        } catch (Exception e) {
            System.out.println("Como você é indeciso e colocou uma opção que não existe, vai ficar com chocolate");
        }
        return switch (sabor) {
            case 1 -> new Baunilha();
            case 2 -> new Chocolate();
            case 3 -> new Morango();
            default -> new Chocolate();
        };
    }

    public void montaPraMim(Milkshake ms){
        boolean b= true;
        int resposta=0;
        while(b){
            System.out.println("Você vai querer algum topping? 0 se não quiser, 1 para biscoito, 2 para chantilly, " +
                    "3 para gotas de chocolate, 4 para MM e 5 para paçoca");
            try{
                resposta= s.nextInt();

            } catch (Exception e) {
                System.out.println("Olha, segue as instruções por favor");
            }
            switch(resposta){
                case 0:
                    b=false;
                    break;

                case 1:
                    ms= new Biscoito(ms);
                    break;

                case 2:
                    ms = new Chantilly(ms);
                    break;

                case 3:
                    ms= new Gotas(ms);
                    break;

                case 4:
                    ms= new MM(ms);
                    break;

                case 5:
                    ms= new Pacoca(ms);
                    break;
            }

        }
        System.out.println("Agora vou falar para você o passo a passo tá bom?");
        ms.monta(0);
    }


}
