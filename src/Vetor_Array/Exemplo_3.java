package Vetor_Array;

import java.util.Scanner;

public class Exemplo_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] numeros = new int[10];

        int pares = 0;

        for (int i = 0; i < 10 ; i++){
            System.out.println("Digite o número "+ (i+1) + ": ");

            numeros[i] = scanner.nextInt();

            if(numeros[i] % 2 == 0){
                pares++;
            }
        }

        System.out.println("Quantidades de numeros pares: "+ pares);

        scanner.close();


    }
}
