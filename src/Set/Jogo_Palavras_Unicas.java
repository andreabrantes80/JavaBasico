package Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Jogo_Palavras_Unicas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Set<String> palavras = new HashSet<>();

        System.out.println("Digite palavras (digite 'fim' para encerrar): ");

        while (true){
            String palavra = entrada.nextLine().toLowerCase();

            if(palavra.equals("fim")) break;
            if(palavras.add(palavra)){
                System.out.println("Palavra adicionada: "+palavra);
            }else{
                System.out.println("Palavra já foi digitada antes!");
            }
        }
        System.out.println("\n====RESULTADO====");

        System.out.println("Palavras digitadas (sem duplicadas): "+palavras);

        System.out.println("Total de palavras unicas: "+ palavras.size());

        Set<String> ordenadas = new TreeSet<>(palavras);

        System.out.println("Palavras em ordem alfabética: "+ordenadas);

        System.out.println("\nDigite a palavra a ser pesquisada: ");

        String busca = entrada.nextLine().toLowerCase();

        if(palavras.contains(busca)){
            System.out.println("A palavra '"+ busca + "' está na lista!");
        }else{
            System.out.println("A palavra '"+ busca + "' não foi digitada." );
        }

        entrada.close();

    }
}
