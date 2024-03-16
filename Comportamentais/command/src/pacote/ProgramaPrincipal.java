package pacote;

public class ProgramaPrincipal {

    public static void main(String[] args) {
        Alexa alexa = new Alexa();
        for (int i = 0; i < 15; i++) {
            alexa.invoke("volume");
        }
        alexa.desfazerUltimo();

        alexa.invoke("luz");

        // Desfazer o último comando novamente (não deve haver comandos no histórico)
        alexa.desfazerUltimo();

        // A explicação do command está na classe Alexa



    }

}
