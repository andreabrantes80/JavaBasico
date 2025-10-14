package Do_while;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner  entrada = new Scanner(System.in);

        int numero;
        int contador = 0;

        do{
            System.out.print("Digite um numero (0 para encerrar): ");

            numero = entrada.nextInt();

            if(numero > 0){
                contador++;
            }
        }while (numero !=0);
        System.out.println("Você digitou "+ contador + " numeros positivos. ");
    }
}
