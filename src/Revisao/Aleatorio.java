package Revisao;

import java.util.Random;

public class Aleatorio {

    public static void main(String[] args) {
        Random aleatorio = new Random();

        int numero;

        while (true){
            numero = aleatorio.nextInt(20);

            System.out.println("Numero gerado: "+numero);
            if(numero == 10 ){
                System.out.println("Numero 10 encontrado. Encerrando...");
                break;

            }
        }
    }
}
