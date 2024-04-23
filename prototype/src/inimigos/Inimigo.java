package inimigos;

public abstract class Inimigo {
    public int hp;
    public int danoCausado;
    public String race;


    public Inimigo(int hp, int danoCausado, String race){
        this.hp =hp;
        this.danoCausado=danoCausado;
        this.race = race;

    }

    public Inimigo(Inimigo i){
        this.hp = i.hp;
        this.danoCausado = i.danoCausado;
        this.race= i.race;
    }



    public abstract Inimigo clonar();

    public abstract void atacar();


    @Override
    public String toString() {
        return "Inimigo{" +
                "hp=" + hp +
                ", danoCausado=" + danoCausado +
                '}'+ "Raça:" +race;
    }
}
