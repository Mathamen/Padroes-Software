package pacote;

/**
 * Esta seria a inteface dos comandos. Todos os comandos derivam dela.
 *
 */
public interface ICommand {
    void execute();

    void undo();
}
