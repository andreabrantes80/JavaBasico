package Biblioteca;

import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {

        final int LIMITE_LIVROS = 5;
        final double MULTA_POR_LIVRO = 2.00;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o número de dias em que você pegou livros neste mês: ");
        int numeroDias = entrada.nextInt();
        int totalLivrosExcedentes = 0;
        double totalMulta = 0.0;
        for (int dia =1; dia <= numeroDias; dia++){
            System.out.println("Quantos livros você pegou no dia : "+dia+"? ");
            int livrosPegos = entrada.nextInt();
            int excesso = Math.max(0, livrosPegos - LIMITE_LIVROS);
            double multaDoDia = excesso * MULTA_POR_LIVRO;

            if(excesso > 0 ){
                System.out.printf("\nNo dia %d, você recebeu em %d livro(s) e deve pagar R$ %.2f de multa.\n", dia, excesso, multaDoDia);

            }else{
                System.out.printf("\nNo dia %d, você não excedeu o limite de livros.\n", dia);
            }
            totalLivrosExcedentes += excesso;

            totalMulta += multaDoDia;

        }
        if(totalLivrosExcedentes > 0){
            System.out.printf("\nAo longo do mês, você excedeu um total de %d livros(s) e deve pagar R$ %.2f de multa.\n", totalLivrosExcedentes,totalMulta);
        }else{
            System.out.println("\nParabéns por seguir as regras da biblioteca durante todo o mês !");
        }
        entrada.close();
    }
}
