package LIstas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exemplo_4 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(23,1,45,6,12));

        ArrayList<String> frutas = new ArrayList<>(Arrays.asList("maça", "banana", "banana", "cereja", "damasco"));

        System.out.println("====LISTA ORIGINAL DE NUMEROS======");

        System.out.println(numeros);

        Collections.sort(numeros);

        System.out.println("\n===NUMEROS ORDENADOS (CRESCENTE):====" +numeros);

        System.out.println("\n====LISTA ORIGINAL DE FRUTAS====");

        System.out.println(frutas);

        Collections.sort(frutas);

        System.out.println("FRUTAS ORDENADAS EM ORDEM ALFABETICA: "+frutas);

        Collections.sort(numeros, Collections.reverseOrder());

        System.out.println("\nNumeros em ordenados (ordem decrescente):"+numeros);

        System.out.println("\n===Invertendo a ordem ====");

        Collections.reverse(numeros);

        System.out.println("Numeros após reverse(): "+numeros);

        System.out.println("\n==== CONTANDO OCORRÊNCIAS ====");

        int ocorrenciasBanana = 0;

        for (String fruta: frutas){
            if(fruta.equals("banana")){
                ocorrenciasBanana++;
            }

        }

        System.out.println("Ocorrências de banana: "+ ocorrenciasBanana);

        System.out.println("\n==== BUSCANDO INDICES ====");

        int indiceBanana = frutas.indexOf("banana");

        if(indiceBanana != -1){
            System.out.println("Indice da primeira banana: " +indiceBanana);
        }else{
            System.out.println("'banana' não está na lista.");
        }





    }
}
