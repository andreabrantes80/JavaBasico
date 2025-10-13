package Switch;

import java.util.Scanner;

public class switch_ex_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha a sua cor favorita: ");

        System.out.println("1 - Azul: ");

        System.out.println("2 -  Verde: ");

        System.out.println("3 - Vermelho: ");

        System.out.print("Digite o numero da opção: ");

        int opcao = entrada.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("Voce escolheu a cor azul.");
                break;
            case 2:
                System.out.println("Voce escolheu a cor verde.");
                break;
            case 3:
                System.out.println("Voce escolheu a cor vermelho.");
                break;
            default:

                System.out.println("Opção inválida.");
        }

        entrada.close();


    }
}
