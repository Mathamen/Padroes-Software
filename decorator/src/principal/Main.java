package principal;

import milkshakes.Chocolate;
import milkshakes.Milkshake;
import toppings.MM;

public class Main {
    public static void main(String[] args) {
        Milkshake ms = new Chocolate();
        MM m1= new MM(ms);
        MM m2 = new MM(m1);
        m2.monta(0);


        }

}