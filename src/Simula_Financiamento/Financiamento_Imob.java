package Simula_Financiamento;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Financiamento_Imob {

    public static boolean validarEmail(String email){
        String padrao = "^[a-zA-Z0-9_.+-]+@[a-zA-Z09-]+\\.[a-zA0-9-.]+$";
        Pattern pattern = Pattern.compile(padrao);

        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu e-mail: ");

        String email = scanner.nextLine();

        if(!validarEmail(email)){
            System.out.println("E-mail inválido!");
            System.exit(0);
        }

        System.out.println("Qual o valor da casa a comprar? ");

        double valorCasa = scanner.nextDouble();

        System.out.print("Qual seu salário? ");

        double salario = scanner.nextDouble();

        System.out.print("Quantos anos você planeja pagar? ");

        int anos = scanner.nextInt();

        int totalMeses = anos * 12;

        double prestacao = valorCasa / totalMeses;

        if(prestacao > salario * 0.3 ){
            System.out.println("Empréstimo negado! O valor é maior que 30% do seu salário.");

            System.exit(0);
        }else{
            System.out.printf("Empréstimo aprovado ! O valor da prestação será de R$ %.2f%n", prestacao);
        }

        scanner.close();

    }
}
