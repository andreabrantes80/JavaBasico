package If;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma letra: ");

        char letra = entrada.next().toLowerCase().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra
                == 'u') {
            System.out.println("É uma vogal");
        } else {
            System.out.println("É uma consoante");
        }
        entrada.close();
    }
}
