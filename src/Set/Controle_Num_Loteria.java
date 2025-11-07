package Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Controle_Num_Loteria {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Set<Integer> numeros = new HashSet<>();

        System.out.println("=== SIMULADOR DE LOTERIA ===");
        System.out.println("Escolha 6 números entre 1 e 60 (sem repetir).");

        while (numeros.size() < 6){
            System.out.print("Digite um número: ");

            if(!entrada.hasNextInt()){
                System.out.println("Digite apenas números!");

                entrada.next();
                continue;
            }

            int num = entrada.nextInt();

            if(num < 1 || num > 60){
                System.out.println("Número inválido! Escolha entre 1 e 60.");
                continue;
            }
            if(numeros.add(num)){
                System.out.println("Número "+num+ " adicionado com sucesso!");
            }else{
                System.out.println("Número repetido! Tente outro.");
            }

            System.out.println("Números escolhidos até agora: "+ numeros.size());
        }

        System.out.println("\n ===RESULTADO FINAL===");

        System.out.println("Seus números: "+ numeros);

        System.out.println("Boa sorte!!!");

        entrada.close();


    }
}
