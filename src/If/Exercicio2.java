package If;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

    System.out.print("Digite um numero inteiro: ");

    int numero = entrada.nextInt();

    if(numero % 2 == 0){
        System.out.println("O numero é par");
    }else{
        System.out.println("O numero é impar");
    }

    }
}
