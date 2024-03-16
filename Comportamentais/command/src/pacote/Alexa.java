package pacote;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Esta classe, em um contexto de padrão de projeto de command, seria o "Invoker".
 * A parte de invoke cria um objeto, parametrizando de uma forma que não muda o invoker e nem
 * o receptor.
 *
 *
 * Esta classe também suporta a expansão para mais comandos, neste caso, implmentnado ICommand
 * e também colocando no HashMap de comandos.
 *
 *
 * Além disso, como implementando no desfazer último, percebe-se a possiblidade de ter uma leve
 * lógica para reverter ações. Neste caso, implementar um padrão Memeento tornaria ainda mais
 * poderoso o desfazer.
 *
 */
public class Alexa {

    static HashMap<String,ICommand> comandos = new HashMap<String,ICommand>();
    static ArrayList<ICommand> history = new ArrayList<ICommand>();

    static {
        comandos.put("luz", new ControlarLuz());
        comandos.put("volume",new ControlarVolume());
    }

    public void invoke(String comando) {
        ICommand c = comandos.get(comando);
        if (c instanceof ControlarLuz && history.get(history.size()-1) instanceof ControlarLuz) {
            System.out.println("Não dá pra acender duas vezes a luz né KKKKKKKKKKKK.");

        }
        else {
            c.execute();
            history.add(c);
        }
    }

    public void desfazerUltimo() {
        if (history.size() !=0) {
            ICommand c = history.remove(history.size()-1 );
            c.undo();
        }else {
            System.out.println("O histórico está vazio!");
        }
    }



}
