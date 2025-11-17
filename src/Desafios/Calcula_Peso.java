package Desafios;

import java.util.Scanner;

public class Calcula_Peso {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double peso;
        double excesso=0;
        double multa =0;

        final double LIMITE = 50.0;
        final double VALOR_MULTA_POR_KILO = 8.0;

        try{
            System.out.print("Digite o peso total de peixes em (kilos): ");

            peso =  Double.parseDouble(scanner.nextLine());

            if(peso > LIMITE){
                excesso = peso - LIMITE;

                multa = excesso * VALOR_MULTA_POR_KILO;
            }
            System.out.printf("\nPeso total de peixes: %.2f kg\n", peso);
            System.out.printf("\nExcesso de Peso: %.2f kg\n", excesso);
            System.out.printf("\nValor da multa: %.2f kg\n", multa);

        }catch (NumberFormatException e){
            System.out.println("Entrada inválida! Insira um valor numérico válido.");
        }

        scanner.close();

    }
}
