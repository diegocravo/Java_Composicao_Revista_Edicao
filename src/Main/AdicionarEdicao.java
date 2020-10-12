package Main;

import Entities.*;

import java.util.Scanner;

public class AdicionarEdicao {

    public static void adicionarEdicao(){

        Scanner ler = new Scanner(System.in);

        if(Revista.listaRevistas.size() == 0) {
            System.out.println("Não há revistas cadastradas");
        }else{
            try {
                System.out.println("Digite o id da Revista.");
                int idRevista = ler.nextInt();
                boolean revistaExiste = false;

                for(int x = 0; x < Revista.listaRevistas.size(); x++){
                    if (Revista.listaRevistas.get(x).getCodigo() == idRevista){
                        revistaExiste = true;
                        System.out.println("Digite o número da edição.");
                        int edicao = ler.nextInt();
                        ler.nextLine();
                        System.out.println("Digite o quantidade vendida.");
                        int quantVendida = ler.nextInt();
                        ler.nextLine();
                        Edicao edicao1 = new Edicao(edicao, 1000, quantVendida);
                        Revista.listaRevistas.get(x).adicionarListaEdicao(edicao1);
                        System.out.println("Edição adicionado com sucesso.");
                    }
                }
                if (!revistaExiste){
                    System.out.println("Revista não existe");
                }
                System.out.println(Revista.listaRevistas);
            }catch (Exception e){
                System.out.println("Entrada Inválida.");
            }
        }

    }

}
