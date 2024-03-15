package principal;

import milkshakes.Baunilha;
import milkshakes.Chocolate;
import milkshakes.Milkshake;
import milkshakes.Morango;
import toppings.*;

import java.util.Scanner;

public class Atendente {
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
            System.out.println("Você vai querer algum topping? 0 se não quiser, 1 para biscoito, 2 para chantilly, 3 para gotas de chocolate, 4 para MM e 5 para paçoca");
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
                    Milkshake ms2= new Biscoito(ms);
                    ms= ms2;
                    break;

                case 2:
                    Milkshake ms3= new Chantilly(ms);
                    ms = ms3;
                    break;

                case 3:
                    Milkshake ms4= new Gotas(ms);
                    ms=ms4;
                    break;

                case 4:
                    Milkshake ms5= new MM(ms);
                    ms=ms5;
                    break;

                case 5:
                    Milkshake ms6= new Pacoca(ms);
                    ms=ms6;
                    break;
            }

        }
        System.out.println("Agora vou falar para você o passo a passo tá bom?");
        ms.monta(0);
    }


}
