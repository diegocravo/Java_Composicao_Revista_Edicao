package Main;

import Entities.*;

import java.util.Scanner;

public class AdicionarRevista {

    public static void adicionarRevista(){

        Scanner ler = new Scanner(System.in);

        int codRevista;

        try{
            System.out.println("Digite o código da revista.");
            codRevista = ler.nextInt();
            ler.nextLine();
            System.out.println("Digite o título da revista.");
            String tituloRevista = ler.nextLine();

            Revista revista = new Revista(codRevista, tituloRevista, 0);
            Revista.adicionarRevistaLista(revista);
            System.out.println("Revista adicionada com sucesso.");

            System.out.println(Revista.listaRevistas);
        }catch (Exception e){
            System.out.println("Entrada Inválida.");
        }

    }
}
