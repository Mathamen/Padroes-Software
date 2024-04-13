package confidencial;

import java.util.ArrayList;

public class Proxy implements ServicoConfidencial{
    ArrayList<String> usuariosAutorizados= new ArrayList<>();
    private ImpressoraDinheiro impressora = new ImpressoraDinheiro();
    public Proxy(){
        // Se fosse uma aplicação real, poderia modularizar essa parte aqui
        usuariosAutorizados.add("Marcelo Arêas");
        usuariosAutorizados.add("Matheus Narrador");
        usuariosAutorizados.add("Júlia Sensitiva");
    }


    @Override
    public void executar(String usuario) {
        // Se estiver na lista, autoriza
        if (usuariosAutorizados.contains(usuario)) {
               impressora.executar(usuario);
            System.out.println("Acesso registrado para o usuário: " + usuario);
        } else {
            // Se não estiver, ele não dá acesso
            System.out.println("EI! Você, " + usuario + ", não pode imprimir dinheiro não!!!");
        }
    }
}
