package pacote;
/**
 *Esta classe é uma das possíveis classes que poderiam implementar ICommand.
 *Neste caso, ela seria "utilizada" para acender e apagar luzes.
 *Esta é uma implementação ficitícia, com o tema de ser uma possível Alexa.
 *Qualquer semelhança é uma mera coincidência.
 *
 *
 */
public class ControlarLuz implements ICommand {

    @Override
    public void execute() {
        System.out.println("Luz ligada!");

    }
    @Override
    public void undo() {
        System.out.println("luz apagada!");
    }

}
