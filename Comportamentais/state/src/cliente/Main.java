package cliente;

import servidor.CentralPedidos;


public class Main {
    public static void main(String[] args) {
        CentralPedidos ifood = new CentralPedidos();
        try {
            ifood.pedir();
        } catch (Exception e){
            System.out.println("deu ruim");
        }
    }
}