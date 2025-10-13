package While;

import java.util.Scanner;

public class TabuadaMultiplicacao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.print("Digite um número para ver a sua tabuada.");

        int numero = entrada.nextInt();

        int i = 1;

        while (i < 10) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
            i++;
        }
        entrada.close();

    }
}
