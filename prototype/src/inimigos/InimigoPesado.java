package inimigos;

public class InimigoPesado extends Inimigo{
    public InimigoPesado(int hp, int danoCausado, String race) {
        super(hp, danoCausado, race);
    }

    public InimigoPesado(Inimigo i) {
        super(i);
    }

    @Override
    public Inimigo clonar() {
        InimigoPesado i= new InimigoPesado(this);
        return i;
    }

    @Override
    public void atacar() {
        System.out.println("O inimigo ataca com uma marreta enorme");
    }
}
