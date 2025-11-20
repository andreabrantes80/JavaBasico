package Quiz_Matematica;

import java.util.Random;
import java.util.Scanner;

public class Quiz_Matematica {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Random aleatorio = new Random();

        int pontuacao =0;

        int nivel = 1;

        boolean continuarJogo = true;

        System.out.println("Bem vindo ao Quiz de matématica!\n");

        while (continuarJogo){
            int num1, num2, resultado =0;
            String operacao;

            if(nivel == 1){
                num1 = aleatorio.nextInt(10)+ 1;

                num2 = aleatorio.nextInt(10)+ 1;

                operacao = aleatorio.nextBoolean() ? "+" : "-";
                if(operacao.equals("+")){
                    resultado = num1 + num2;
                }else{
                    resultado = num1 - num2;
                }

            }else{
                num1 = aleatorio.nextInt(20)+ 1;
                num2 = aleatorio.nextInt(10)+ 1;

                operacao = aleatorio.nextBoolean() ? "*" : "/";
                if(operacao.equals("*")){
                    resultado = num1 * num2;
                }else{
                    num2 = aleatorio.nextInt(9) + 1; // evita zero
                    int fator = aleatorio.nextInt(10) + 1;
                    num1 = num2 * fator;
                    resultado = num1 / num2;

                }

            }
            System.out.printf("Pergunta %d: Quanto é %d %s %d\n", nivel, num1, operacao, num2);

            int respostaUsuario;

            try{

                System.out.print("Resposta: ");

                respostaUsuario = Integer.parseInt(entrada.nextLine());

            }catch (NumberFormatException e){
                System.out.println("Entrada inválida! O jogo foi encerrado.");
                break;
            }
            if(respostaUsuario == resultado){
                pontuacao += 10;
                System.out.println("Correto! Sua pontuação: "+pontuacao+ " pontos.\n");
                nivel++;
            }else{
                System.out.println("Resposta incorreta ! A resposta correta era : "+resultado+"." );
                break;
            }
            System.out.println("Deseja continuar? (s/n): ");

            String continuar = entrada.nextLine().toLowerCase();

            if(!continuar.equals("s")){
                continuarJogo = false;
            }
        }
        System.out.println("\nJogo encerrado! Sua pontuação final: "+pontuacao+ " pontos.");
        entrada.close();
    }
}
