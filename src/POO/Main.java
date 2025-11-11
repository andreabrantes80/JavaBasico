package POO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa: ");

        String nomePessoa = entrada.nextLine();

        Pessoa pessoa = new Pessoa(nomePessoa);

        int opcao;

        do {

            System.out.println("\n===================================");
            System.out.println("Simulação da Rotina de " + nomePessoa);
            System.out.println("=====================================");
            System.out.println("1- Acordar");
            System.out.println("2- Comer");
            System.out.println("3- Parar de Comer");
            System.out.println("4= Dirigir");
            System.out.println("5- Parar de Dirigir");
            System.out.println("6- Dormir");
            System.out.println("0- Sair");
            System.out.println("Escolha uma opção: ");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1 -> pessoa.acordar();
                case 2 -> pessoa.comer();
                case 3 -> pessoa.pararDeComer();
                case 4 -> pessoa.dirigir();
                case 5 -> pessoa.pararDeDirigir();
                case 6 -> pessoa.dormir();
                case 0 -> System.out.println("Encerrando simulação...");
                default -> System.out.println("Opção inválida, tene novamente.");

            }


        } while (opcao != 0);

        entrada.close();
    }
}
