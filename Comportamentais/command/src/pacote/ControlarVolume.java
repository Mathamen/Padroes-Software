package pacote;

public class ControlarVolume implements ICommand{
    private static int volume =0;
    private final int VOLUME_MAXIMO = 10;

    @Override
    public void execute() {
        volume= volume +1;
        if (volume> VOLUME_MAXIMO) {
            volume = VOLUME_MAXIMO;
            System.out.println("O volume já está no máximo!!!");
        }else {
            System.out.println("volume alterado para: " + volume);
        }
    }

    @Override
    public void undo() {
        if (volume >0) {
            volume --;
        }
        System.out.println("Volume reduzido para: " + volume);

    }

}
