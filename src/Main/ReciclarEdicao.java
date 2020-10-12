package Main;

import Entities.Revista;

import java.util.Scanner;

public class ReciclarEdicao {

    public static void reciclarEdicao(){

        Scanner ler = new Scanner(System.in);

        try{
            System.out.println("Digite o código da revista");
            int codRevista = ler.nextInt();
            ler.nextLine();
            System.out.println("Digite o código da edição");
            int codEdicao = ler.nextInt();
            ler.nextLine();

            for(var x = 0; x < Revista.listaRevistas.size(); x++){
                if(Revista.listaRevistas.get(x).getCodigo() == codRevista){
                    for (var y = 0; y < Revista.listaEdicao.size(); y++){
                        if(Revista.listaEdicao.get(y).getNum() == codEdicao && !Revista.listaEdicao.get(y).isReciclagemAtualizada()){
                            Revista.listaRevistas.get(x).setReciclagemProduzida(Revista.listaEdicao.get(y).qtdeRecicladas());
                            System.out.println("Edição recilcada com sucesso.");
                            System.out.println(Revista.listaRevistas.get(x));
                        }else{
                            System.out.println("Edição não cadastrada");
                        }
                    }
                }else{
                    System.out.println("Revista não cadastrada.");
                }
            }
        }catch (Exception e){
            System.out.println("Entrada Inválida.");
        }

    }
}
