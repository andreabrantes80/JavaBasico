package Valida_End_Site;

import java.util.Scanner;

public class Valida_End_Site {
    public static boolean validarEnderecoSite(String endereco){
        if(endereco.startsWith("www.") && endereco.endsWith(".com.br")){
            return  true;
        }else{
            return false;
        }
    }

    public static void solicitarEnderecoSite(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Digite o endereço dlo site (deve começar com 'www.' e terminar com ' .com.br'):  ");

            String endereco = scanner.nextLine();

            if(validarEnderecoSite(endereco)){
                System.out.println("Endereço validado!");
                break;
            }else{
                System.out.println("Endereço inválido. Tente novamente.");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {

        solicitarEnderecoSite();

    }
}
