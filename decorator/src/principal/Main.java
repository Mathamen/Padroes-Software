package principal;

import milkshakes.Chocolate;
import milkshakes.Milkshake;
import toppings.MM;

public class Main {
    public static void main(String[] args) {
        Atendente a= new Atendente();
        Milkshake ms = a.escolherSabor();
        a.montaPraMim(ms);


        }

}