package While;

import java.util.Scanner;

public class LerSenha {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String senha = "";

        while(!senha.equals("1234")){
            System.out.println("Digite  a senha: ");

            senha = entrada.nextLine();

            if(!senha.equals("1234")){
                System.out.println("Senha Incorreta. Tente novamente.");

            }

        }
        System.out.println("Senha correta! Acesso permitido.");
        entrada.close();


    }


}
