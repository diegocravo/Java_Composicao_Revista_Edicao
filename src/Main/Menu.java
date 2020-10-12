package Main;

import Entities.Revista;

import java.util.Scanner;

public class Menu {

    public static void Menu(){

        System.out.println("Escolha uma das opções:");
        System.out.println("1. Adicionar Revista");
        System.out.println("2. Adicionar Edição na Revista");
        System.out.println("3. Remover Edição de uma Revista");
        System.out.println("4. Reciclar edição");
        System.out.println("5. Destruir revista");
        System.out.println("0. Sair");

        escolha();


    }

    public static void escolha(){
        Scanner ler = new Scanner(System.in);
        String option = ler.nextLine();

        switch (option){
            case "1":
                AdicionarRevista.adicionarRevista();
                Menu();
                break;
            case "2":
                Revista.adicionaEdicao();
                Menu();
                break;
            case "3":
                Revista.removeEdicao();
                Menu();
                break;
            case "4":
                ReciclarEdicao.reciclarEdicao();
                Menu();
                break;
            case "5":
                DestruirRevista.destruirRevista();
                Menu();
                break;
            case "0":
                System.out.println("Obrigado e até a próxima.");
                break;
            default:
                 System.out.println("Opção Inválida");
                 Menu();
        }
    }

}
