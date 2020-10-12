package Main;

import Entities.*;

import java.util.Scanner;

public class DestruirRevista {

    public static void destruirRevista(){

        Scanner ler = new Scanner(System.in);

        try{
            System.out.println("Digite o código da revista.");
            int option = ler.nextInt();
            ler.nextLine();
            boolean revistaExiste = false;

            for (var x = 0; x < Revista.listaRevistas.size(); x++){
                if (Revista.listaRevistas.get(x).getCodigo() == option){
                    revistaExiste = true;
                    Revista.listaRevistas.remove(Revista.listaRevistas.get(x));
                    System.out.println("Revista excluída com sucesso.");
                }
            }
            if (!revistaExiste){
                System.out.println("Revista não encontrada.");
            }

            System.out.println(Revista.listaRevistas);
        }catch (Exception e){
            System.out.println("Entrada Inválida.");
        }



    }

}
