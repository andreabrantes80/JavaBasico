package For;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //CÁLCULO DA MÉDIA DE 10 NUMEROS

        Scanner entrada = new Scanner(System.in);

        double soma = 0;

        for (int i = 1; i<=10;i++){
        System.out.print("Digite o "+ i + " numero: ");

        double numero = entrada.nextDouble();

        soma += numero;
        }
        double media = soma / 10;

        System.out.println("\n A média dos numeros é:  " + media);

    }
}
