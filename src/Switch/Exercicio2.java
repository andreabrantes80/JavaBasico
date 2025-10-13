package Switch;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro  numero: ");

        double num1 = entrada.nextDouble();
        System.out.print("Digite o segundo  numero: ");
        double num2 = entrada.nextDouble();

        System.out.println("Digite a operação: (+, *, -, /): ");

        char operador = entrada.next().charAt(0);

        switch (operador) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));

                } else {
                    System.out.println("Erro: Divisão por zero");
                    break;


                }
            default:
                System.out.println("Operador inválido");
        }
        entrada.close();


    }
}
