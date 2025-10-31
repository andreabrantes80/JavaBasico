package LIstas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exemplo_7 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(6,3,15,2,8,7,14));

        System.out.println("Lista de Numeros: "+numeros);

        int tamanho = numeros.size();

        System.out.println("Numero de elementos na lista é: "+tamanho);

        int maiorValor = Collections.max(numeros);

        System.out.println("O maior valor na lista é: "+maiorValor);

        int menorValor = Collections.min(numeros);

        System.out.println("O menor valor na lista é: " +menorValor);

        int somaTotal = 0;

        for (int num : numeros){
            somaTotal += num;
        }

        System.out.println("A soma dos elementos da lista é: "+somaTotal);


    }
}
