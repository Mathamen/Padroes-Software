package inimigos;

public class InimigoArqueiro extends Inimigo{
    public InimigoArqueiro(Inimigo i){
        super(i);
    }
    public InimigoArqueiro(int hp, int danoCausado, String race) {
        super(hp, danoCausado, race);
    }

    @Override
    public Inimigo clonar() {
        InimigoArqueiro i= new InimigoArqueiro(this);
        return i;
    }

    @Override
    public void atacar() {
        System.out.println("Flechas são lançadas");
    }
}
