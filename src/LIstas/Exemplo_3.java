package LIstas;

import java.util.ArrayList;
import java.util.Arrays;

public class Exemplo_3 {

    public static void main(String[] args) {

        System.out.println("====1. ADCIONAR ELEMENTOS====");
        ArrayList<String> frutas = new ArrayList<>(Arrays.asList("maça", "banana"));

        frutas.add("cereja");

        System.out.println("add (append): "+ frutas);

        frutas = new ArrayList<>(Arrays.asList("maça", "banana", "cereja"));

        frutas.add(1, "Abacate");

        System.out.println("add (index, valor) (insert): "+frutas);

        System.out.println("\n====2. REMOVER ELEMENTOS====");
        frutas = new ArrayList<>(Arrays.asList("maça", "banana", "cereja"));

        frutas.remove("banana");

        System.out.println("remove (valor): "+frutas);

        frutas.remove(frutas.size() - 1);

        System.out.println("remove ultimo: "+frutas);

        System.out.println("\n====3. CONCATENAR LISTAS====");
        ArrayList<Integer> lista1 = new ArrayList<>(Arrays.asList(1,3,4));
        ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(4,5,6));

        ArrayList<Integer> uniao = new ArrayList<>(lista1);

        uniao.addAll(lista2);

        System.out.println("Concatenação (+ / extend): "+uniao);

        lista1 = new ArrayList<>(Arrays.asList(1,2,3));
        lista2 = new ArrayList<>(Arrays.asList(4,5,6));

        lista1.addAll(lista2);

        System.out.println("addAll (extend): "+lista1);

        System.out.println("\n====4. REPETIR LISTAS====");

        ArrayList<String> repeticao = new ArrayList<>();

        for (int i=0; i< 3;i++){
            repeticao.add("a");
            repeticao.add("b");
        }

        System.out.println("Repetição manual: "+ repeticao);

        System.out.println("\n====5. VERIFICAR SE UM ITEM ESTA NA LISTA====");

        frutas = new ArrayList<>(Arrays.asList("maça", "banana", "cereja"));

        System.out.println("Contém a banana? "+ frutas.contains("banana"));











    }
}
