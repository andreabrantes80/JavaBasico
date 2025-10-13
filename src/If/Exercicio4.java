package If;


import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");

        int numero = entrada.nextInt();

        if (numero >= 10 && numero <= 100) {
            System.out.println("O numero esta entre 10 e 100");
        } else {
            System.out.println("O numero está fora do intervalo");

        }
        entrada.close();

    }
}
