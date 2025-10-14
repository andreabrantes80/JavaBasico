package Do_while;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String senha;

        do{

            System.out.print("Digite a senha.");
            senha = entrada.nextLine();
            if(!senha.equals("1234")){
                System.out.println("Senha incorreta. Tente novamente.");
            }

        }while (!senha.equals("1234"));
        System.out.println("Acesso permitido ");
        entrada.close();
    }
}
