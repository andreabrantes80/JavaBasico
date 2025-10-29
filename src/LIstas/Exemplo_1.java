package LIstas;

import java.util.ArrayList;

public class Exemplo_1 {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Ana");

        nomes.add("Carlos");
        nomes.add("João");

        System.out.println("Lista completa (formato padrão):");

        System.out.println(nomes);

        System.out.println("\nLista formatada com numeração:");

        for (int i=0; i<nomes.size(); i++){
            System.out.println((i +1)+ " nome: "+  nomes.get(i));
        }

        System.out.println("\nTotal de nomes na lista: "+nomes.size());


    }

}
