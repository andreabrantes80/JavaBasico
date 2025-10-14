package Do_while;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero para ver a tabuada. ");

        int numero = entrada.nextInt();

        int i = 1;

        do {
            System.out.println(numero + " x " + i + " = " + (numero*i));
            i++;
        }while(i <= 10);
        entrada.close();
    }
}
