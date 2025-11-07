package Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MenuSet {

    public static void main(String[] args) {

        Set<String> conjunto = new HashSet<>();

        Scanner entrada = new Scanner(System.in);

        int opcao ;

        do{
            System.out.println("\n====MENU SET=====");
            System.out.println("1. Adicionar elemento");
            System.out.println("2. Remover elemento");
            System.out.println("3. Editar elemento");
            System.out.println("4. Listar todos os elemento");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: ");

            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Digite o elemento para adicionar: ");

                    String novo = entrada.nextLine();
                    if(conjunto.add(novo)){
                        System.out.println("Elemento adicionado com sucesso!");
                    }else{
                        System.out.println("Elemento já existe no conjunto!");
                    }
                    break;

                case 2:

                    System.out.println("Digite o nome do elemento para remover: ");

                    String rem = entrada.nextLine();
                    if(conjunto.remove(rem)){
                        System.out.println("Elemento removido com sucesso!");
                    }else{
                        System.out.println("Elemento não encontrado no conjunto!");
                    }
                    break;

                case 3:
                    System.out.println("Digite o nome do elemento que deseja editar: ");

                    String antigo = entrada.nextLine();

                    if(conjunto.contains(antigo)){
                        System.out.println("Digite o novo valor: ");

                        String novoValor = entrada.nextLine();

                        conjunto.remove(antigo);
                        conjunto.add(novoValor);
                        System.out.println("Elemento editado com sucesso!");
                    }else{
                        System.out.println("Elemento não encontrado!");
                    }
                    break;

                case 4:
                    if(conjunto.isEmpty()){
                        System.out.println("O conjunto está vazio.");
                    }else{
                        System.out.println("Elementos no conjunto: "+conjunto);
                    }
                    break;

                case 5:
                    conjunto.clear();
                    System.out.println("Conjunto limpo com sucesso!");
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        }while (opcao != 0);
        entrada.close();

    }
}
