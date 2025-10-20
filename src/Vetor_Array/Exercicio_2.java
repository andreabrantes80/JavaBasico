package Vetor_Array;

import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[5];

        double soma = 0;

        for(int i =0; i < 5; i++){
            System.out.print("Digite um numero: ");

            numeros[i] = scanner.nextDouble();
            soma += numeros[i];

        }
        double media = soma / numeros.length;

        System.out.println("A média : "+ media);

        scanner.close();

    }
}
