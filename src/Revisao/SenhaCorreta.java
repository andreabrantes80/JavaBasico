package Revisao;

import java.util.Scanner;

public class SenhaCorreta {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String senhaCorreta = "1234";

        for (int tentativas = 1; tentativas <= 3; tentativas++){
            System.out.print("Digite a Senha: ");

            String senha = entrada.nextLine();

            if(senha.equals(senhaCorreta)){
                System.out.println("Acesso permitido!");
                break;
            }else{
                System.out.println("Senha incorreta. Tenativa "+ tentativas+" de 3.");
            }

            if(tentativas == 3){
                System.out.println("Numero de tentativas excedido. Acesso bloqueado!");
            }

        }


        entrada.close();

    }
}
