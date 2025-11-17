package Desafios;

import java.util.Scanner;

public class Media_Dez_Alunos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] medias = new double[10];
        int alunosComMediaMaiorIgualSete = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("\nInsira as 4 notas do aluno " + (i + 1) + ":");

            double somaNotas = 0;

            for (int j = 0; j < 4; j++) {
                while (true) {
                    System.out.println("Digite a " + (j + 1) + "ª nota: ");

                    if (scanner.hasNextDouble()) {
                        double nota = scanner.nextDouble();
                        if (nota >= 0 && nota <= 10) {
                            somaNotas += nota;
                            break;
                        } else {
                            System.out.println("Nota inválida! Digite entre 0 e 10.");
                        }
                    } else {
                        System.out.println("Entrada inválida! Digite um número.");
                        scanner.next(); // consome entrada inválida
                    }
                }
            }

            double media = somaNotas / 4.0;
            medias[i] = media;

            if (media >= 7.0) {
                alunosComMediaMaiorIgualSete++;
            }

            System.out.println("Média do aluno " + (i + 1) + ": " + media);
        }

        System.out.println("\nNúmero de alunos com média maior ou igual a 7.0: " + alunosComMediaMaiorIgualSete);
        scanner.close();
    }
}