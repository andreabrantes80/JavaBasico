package Carrinho_De_Compras;

import java.util.ArrayList;
import java.util.Scanner;

public class CarrinhoDeCompras {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<String> carrinho = new ArrayList<>();

        while (true) {
            System.out.print("Digite 'adicionar' para incluir um item, 'remover' para excluir, 'ver' para exibir o carrinho ou 'sair' para encerrar: ");
            String comando = entrada.nextLine().toLowerCase();

            if (comando.equals("adicionar")) {
                System.out.println("Digite o nome do item que deseja adicionar: ");

                String item = entrada.nextLine();

                carrinho.add(item);

                System.out.println("'" + item + "' adicionado ao carrinho.");
            } else if (comando.equals("remover")) {

                if (carrinho.size() > 0) {
                    System.out.println("Digite o nome do item que deseja remover: ");
                    String item = entrada.nextLine();
                    if (carrinho.contains(item)) {
                        carrinho.remove(item);
                        System.out.println("'" + item + "' removido do carrinho.");
                    } else {
                        System.out.println("'" + item + "' não está no carrinho.");
                    }
                } else {
                    System.out.println("O carrinho está vazio.");
                }


            } else if (comando.equals("ver")) {
                if (carrinho.size() > 0) {
                    System.out.println("Itens no carrinho: " + carrinho);
                } else {
                    System.out.println("O carrinho está vazio.");
                }
            } else if (comando.equals("sair")) {
                System.out.println("Encerrando o sistema de carrinho.");
                break;
            } else {
                System.out.println("Comando inválido. Tente novamente.");
            }

        }
        entrada.close();
    }
}
