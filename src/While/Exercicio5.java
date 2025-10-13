package While;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int soma = 0;
        int quantidade = 0;
        int numero = 0;

        while (numero != -1) {
            System.out.println("Digite um numero (-1 para sair) :");

            numero = entrada.nextInt();

            if (numero != -1) {
                soma += numero;
                quantidade++;


            }
        }
        if (quantidade > 0) {
            double media = (double) soma / quantidade;

            System.out.println("Media dos numeros: " + media);
        } else {
            System.out.println("Nenhum numero válido foi digitado: ");

        }

        entrada.close();

    }

}
