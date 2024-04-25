package pacote;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Calça Jeans", 300, "Vestuário");
        Produto p2 = new Produto("T-shirt Pitfall", 89, "Vestuário");
        Produto p3 = new Produto("Super Nintendo 64",800,"Eletrônicos");
        Produto p4 = new Produto("PS5 Fat", 3000, "Eletrônicos");
        Produto p5 = new Produto("Meia Adidas", 59.99, "Vestuário");
        Produto p6 = new Produto("Paracetamol", 7, "Remédios");
        Produto p7 = new Produto("Dorflex", 9.50, "Remédios");
        Produto p8 = new Produto("Asus RTX 4090", 14999.99,"Eletrônicos");
        Produto p9 = new Produto("I3-3320", 99.99, "Eletrônicos");
        Produto p10 = new Produto("Kingston Fury 16GB", 219.99, "Eletrônicos");

        ListaProdutos lp = new ListaProdutos();

        //Adicionando fora de ordem também
        lp.adicionar(p1);
        lp.adicionar(p2);
        lp.adicionar(p4);
        lp.adicionar(p3);
        lp.adicionar(p5);
        lp.adicionar(p7);
        lp.adicionar(p6);
        lp.adicionar(p10);
        lp.adicionar(p9);
        lp.adicionar(p8);

        for (Object o: lp){
            System.out.println(o);
        }
    }
}