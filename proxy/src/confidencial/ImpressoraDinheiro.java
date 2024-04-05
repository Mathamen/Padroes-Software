package confidencial;

public class ImpressoraDinheiro implements ServicoConfidencial{
    @Override
    public void executar(String user) {
        System.out.println("Você, " + user+  ", tem a permissão de imprimir dinheiro");
        System.out.println("Imprimindo dinheiro");
        try {
            Thread.sleep(2000);
            System.out.println("Imprimiu um milhão");
            Thread.sleep(2000);
            System.out.println("Imprimiu mais um milhão");
            Thread.sleep(2000);
            System.out.println("Imprimiu mais um milhão");
            Thread.sleep(2000);
            System.out.println("Imprimiu mais um milhão");
            Thread.sleep(2000);
            System.out.println("Imprimiu mais um milhão");
            System.out.println("Pronto, você acaba de imprimir 5 milhões");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
