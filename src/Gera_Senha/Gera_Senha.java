package Gera_Senha;

import java.util.Random;
import java.util.Scanner;

public class Gera_Senha {

    public static String gerarSenha(int tamanho){
        String letrasMaiusculas = "ABCDEFGHIJKLMNOPQRSTUVXZWY";
        String letrasMinusculas = "abcdefghijklmnopqrstuvxwyz";
        String numeros = "0123456789";

        String caratcteresEspeciais = "!@#$%¨&^*()-+=[]{};.<>/?\\`~";

        String todosCaracteres = letrasMaiusculas + letrasMinusculas + numeros + caratcteresEspeciais;

        Random random = new Random();

        StringBuilder senha = new StringBuilder();

        for (int i =0; i < tamanho; i++){
            int indice = random.nextInt(todosCaracteres.length());

            senha.append(todosCaracteres.charAt(indice));
        }
            return senha.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{

            System.out.print("Digite o tamanho desejado para a senha: ");

            int tamanhoSenha = Integer.parseInt(scanner.nextLine());

            if(tamanhoSenha < 1){
                System.out.println("O tamanho da senha deve ser maior que zero!");
            }else {
                String senhaGerada = gerarSenha(tamanhoSenha);
                System.out.println("Senha gerada: "+ senhaGerada);
            }

        }catch (NumberFormatException e){
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
        }

        scanner.close();

    }
}
