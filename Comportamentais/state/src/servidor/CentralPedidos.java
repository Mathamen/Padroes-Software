package servidor;

import java.util.Scanner;

public class CentralPedidos {
    private static Scanner sc= new Scanner(System.in);
    private State estado;

    public CentralPedidos() {
    }

    public void setEstado(State estado) {
        this.estado = estado;
    }

    public void pedir() throws InterruptedException {
        boolean pago=false;
        setEstado(new AguardandoConfirm(this));
        Thread.sleep(1000);

        estado.confirmarPedido();
        Thread.sleep(1000);

        estado.prepararPedido();
        Thread.sleep(1000);

        estado.irParaEntrega();
        Thread.sleep(1000);

        System.out.println("Crédito ou débito?");
        while(!pago){
            try {
                String resposta = sc.nextLine();
                if (resposta.equals("Crédito")) {
                    Thread.sleep(1000);
                    System.out.println("Pagamento feito nu crédito"); // piada de Nubank, nu crédito
                    pago=true;
                } else if (resposta.equals("Débito")) {
                    System.out.println("Pagamento feito nu débito"); // É sempre mais engraçado na segunda vez
                    pago=true;
                }else{
                    System.out.println("Senhor, é crédito ou débito");
                }
            }catch(Exception e){
                System.out.println("Chefe, não escutei. Pode repetir?");
            }
        }

        estado.concluirPedido();
    }

}
