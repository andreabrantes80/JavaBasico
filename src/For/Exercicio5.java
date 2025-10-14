package For;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

    System.out.print("Digite palavras separadas por virgula: ");

    String linhaDigitada = entrada.nextLine();
        List<String> palavras = Arrays.asList(linhaDigitada.split(","));

        for(String palavra : palavras){
            palavra = palavra.trim();

            if (palavra.length() > 4){
                System.out.println(palavra);
            }
        }
        entrada.close();

    }
}
