package principal;

import milkshakes.Milkshake;

public class Main {
    public static void main(String[] args) {
        Atendente a= new Atendente();
        Milkshake ms = a.escolherSabor();
        a.montaPraMim(ms);


        }

}