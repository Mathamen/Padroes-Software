package inimigos;

public class InimigoLeve extends Inimigo{
    public InimigoLeve(int hp, int danoCausado, String race) {
        super(hp, danoCausado, race);
    }

    public InimigoLeve(Inimigo i) {
        super(i);
    }

    @Override
    public Inimigo clonar() {
        InimigoLeve i= new InimigoLeve(this);
        return i;
    }

    @Override
    public void atacar() {
        System.out.println("Ataca com lanças finas");
    }
}
