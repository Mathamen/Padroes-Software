package cliente;

import confidencial.Proxy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite seu nome");
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        Proxy p= new Proxy();
        //Aqui ele vai testar se é ou não. Só digitar igual que ele vai acionar e permitir
        p.executar(s);


        // aqui tem os dois, de forma automatizada. O primeiro não está na lista, o segundo sim
        String naoPermitido= "Rocky Balboa";
        p.executar(naoPermitido);
        String permitido = "Matheus Narrador";
        p.executar(permitido);
        }
    }
