package If;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new  Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = entrada.nextInt();

        if(numero > 0 ){
            System.out.println("O numero é positivo");
        }else{
            System.out.println("O numero não é positivo");
        }
        entrada.close();
    }
}
