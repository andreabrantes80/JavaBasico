package LIstas;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();

        String nome;

        System.out.println("Digite os nomes (ou 'sair' para encerrar): ");

        while (true){
            System.out.print("Nome: ");

            nome = scanner.nextLine();

            if(nome.equalsIgnoreCase("sair")){
                break;
            }

            nomes.add(nome);
        }
        System.out.println("\nNomes cadastrados.");

        for(String n : nomes){
            System.out.println("- "+n);
        }
        scanner.close();
    }
}
