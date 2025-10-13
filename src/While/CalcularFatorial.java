package While;

import java.util.Scanner;

public class CalcularFatorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");

        int numero = entrada.nextInt();
        int fatorial = 1;
        int i =1;

        while (i <= numero){
            fatorial *= i;
            i++;
        }
        System.out.println("Fatorial de " + numero + " é " + fatorial);

        entrada.close();

    }
}
