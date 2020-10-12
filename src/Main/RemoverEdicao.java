package Main;

import Entities.Revista;

import java.util.Scanner;

public class RemoverEdicao {

    public  static void removerEdicao(){

        Scanner ler = new Scanner(System.in);

        if(Revista.listaRevistas.size() == 0) {
            System.out.println("Não há revistas cadastradas");
        }else{
            try {
                System.out.println("Digite o id da Revista.");
                int idRevista = ler.nextInt();
                ler.nextLine();
                boolean revistaExiste = false;

                for(int x = 0; x < Revista.listaRevistas.size(); x++){
                    if (Revista.listaRevistas.get(x).getCodigo() == idRevista){
                        revistaExiste = true;
                        System.out.println("Digite o número da edição.");
                        int edicaoRevista = ler.nextInt();
                        ler.nextLine();

                        for(var y = 0; y < Revista.listaEdicao.size(); y++ ){
                            if(Revista.listaEdicao.get(y).getNum() == edicaoRevista){
                                Revista.listaRevistas.get(x).listaEdicao.remove(Revista.listaEdicao.get(edicaoRevista - 1));
                                System.out.println("Exclusão de edição feita com sucesso.");
                            }else{
                                System.out.println("Edição não existe");
                            }
                        }
                        System.out.println(Revista.listaRevistas);
                    }
                }
                if (!revistaExiste){
                    System.out.println("Revista não existe");
                }
                System.out.println(Revista.listaRevistas);
            }catch (Exception e){
                System.out.println(e);
                System.out.println("Entrada Inválida.");
            }
        }
    }
}
