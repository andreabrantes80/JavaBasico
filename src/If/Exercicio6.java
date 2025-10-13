package If;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");

        int numero = entrada.nextInt();

        if (numero > 0) {
            System.out.println("O numero é positivo.");
        } else if (numero < 0) {
            System.out.println("O numero é negativo.");

        } else {
            System.out.println("O numero é zero.");

        }
        entrada.close();
    }
}
