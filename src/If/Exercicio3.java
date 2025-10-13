package If;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int num1 = entrada.nextInt();
        System.out.print("Digite o segundo numero: ");
        int num2 = entrada.nextInt();

        if(num1 > num2){
            System.out.println("O maior numero é:  " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior numero é: " + num2);

        }else{
            System.out.println("Os numeros são iguais ");
        }
        entrada.close();


    }
}
