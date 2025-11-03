package LIstas;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Lucas");
        nomes.add("João");
        nomes.add("Ana");
        nomes.add("Pedro");
        nomes.add("Maria");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um nome para procurar: ");

        String nomeBusca = scanner.nextLine();

        if(nomes.contains(nomeBusca)){
            System.out.println("Nome encontrado na lista!");
        }else{
            System.out.println("Nome não encontrado.");
        }

        scanner.close();

    }
}
