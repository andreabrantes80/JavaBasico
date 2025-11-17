package Desafios;

import java.util.Scanner;

public class Calcula_Metros_Tintas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double COBERTURA_POR_LITRO = 5.0;
        final double LITROS_POR_LATA = 18.0;
        final double PRECO_POR_LATA = 100.0;

        try {

            System.out.print("Digite o tamanho da área a ser pintada (em metros quadrados): ");

            double area = Double.parseDouble(scanner.nextLine());

            if (area <= 0) {
                System.out.println("A área deve ser maior que zero!");
            } else {
                double litrosNecessarios = area / COBERTURA_POR_LITRO;
                int latasNecessarias = (int) Math.ceil(litrosNecessarios / LITROS_POR_LATA);
                double precoTotal = latasNecessarias * PRECO_POR_LATA;

                System.out.println("\nQuantidade de latas de tintas necessárias: " + latasNecessarias + " latas(s)");

                System.out.printf("Preço total: R$ %.2f\n", precoTotal);
            }


        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida! Insira um valor numérico válido.");
        }
        scanner.close();


    }
}
