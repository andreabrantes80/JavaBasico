package LIstas;

import java.util.ArrayList;
import java.util.Scanner;

public class Exemplo_Sistema_de_Lista {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();

        int opcao = 0;

        do{
            System.out.println("\n===MENU DA LISTA===");
            System.out.println("1. Adicionar Item");
            System.out.println("2. Remover Item");
            System.out.println("3. Alterar Item");
            System.out.println("4. Listar Itens");
            System.out.println("5. Limpar Lista");
            System.out.println("6. Sair");
            System.out.println("Escolha uma opção: ");

            opcao = scanner.nextInt();

            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("Digite o item a adicionar: ");
                    String novoItem = scanner.nextLine();
                    lista.add(novoItem);

                    System.out.println("Item adicionado com sucesso!");
                    break;

                case 2:

                    if(lista.isEmpty()){
                        System.out.println("A lista está vazia: ");
                    }else{
                        System.out.println("Digite o nome do item que deseja remover: ");
                        String itemRemover= scanner.nextLine();

                        if(lista.remove(itemRemover)){
                            System.out.println("Item removido com sucesso!");
                        }else{
                            System.out.println("Item não encontrado.");
                        }
                    }
                    break;

                case 3:
                    if(lista.isEmpty()){
                        System.out.println("A lista está vazia!");
                    }else{
                        System.out.println("Digite o nome do item que deseja alterar: ");

                        String itemAntigo = scanner.nextLine();
                        if(lista.contains(itemAntigo)){
                            System.out.println("Digite o novo valor: ");

                            String itemNovo = scanner.nextLine();

                            int indice = lista.indexOf(itemAntigo);

                            lista.set(indice,itemNovo);

                            System.out.println("Item alterado com sucesso!");

                        }else{
                            System.out.println("Item não encontrado.");
                        }
                    }
                        break;

                case 4:

                    if(lista.isEmpty()){
                        System.out.println("A lista está vazia!");
                    }else{
                        System.out.println("Itens da lista: ");
                        for(int i =0; i< lista.size(); i++){
                            System.out.println((i +1)+". "+lista.get(i));
                        }
                    }
                    break;

                case 5:
                    lista.clear();
                    System.out.println("Lista limpa com sucesso!");
                    break;

                case 6:

                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");




            }


        }while(opcao != 6);

        scanner.close();

    }


}
