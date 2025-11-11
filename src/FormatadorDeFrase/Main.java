package FormatadorDeFrase;

import java.util.Scanner;

public class Main {

    public static void motrarMenu(){
        System.out.println("\nEscolha uma opção: ");

        System.out.println("1. Converter para MAIÚSCULAS");
        System.out.println("2. Converter para minúsculas");
        System.out.println("3. Capitalizar a primeira letra da frase");
        System.out.println("4. Formato Título");
        System.out.println("5. Contar vogais");
        System.out.println("6. Contar consoantes");
        System.out.println("7. Contar letra 'a'");
        System.out.println("8. Pesquisar palavra (contar ocorrências)");
        System.out.println("9. Mostrar frase atual");
        System.out.println("10. Sair");

        System.out.print("Digite sua opção: ");



    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nBem vindo ao formatador de frases em (Java)!");

        System.out.println("Por favor digite uma frase: ");

        String fraseInicial = sc.nextLine();

        FormatadorDeFrase formtador = new FormatadorDeFrase(fraseInicial);

        while (true){

            motrarMenu();

            String escolha = sc.nextLine().trim();

            switch (escolha){
                case "1" -> {
                    formtador.paraMaisuculas();
                    System.out.println("Frase atual: "+ formtador.obterFrase());

                }

                case "2" -> {
                    formtador.paraMinusculas();
                    System.out.println("Frase atual: "+formtador.obterFrase());
                }

                case "3"->{
                    formtador.capitalizar();
                    System.out.println("Frase atual: "+formtador.obterFrase());

                }
                case "4"->{
                    formtador.formatoTitulo();
                    System.out.println("Frase atual: "+formtador.obterFrase());
                }
                case "5"->{

                    int total = formtador.contarVogais();
                    System.out.println("Total de vogais: "+total);
                }

                case "6"->{
                    int total = formtador.contarConsoantes();
                    System.out.println("Total de consoantes: " +total);
                }
                case "7"->{
                    int total = formtador.contarLetraA();
                    System.out.println("Total de ocorrências letra 'a': "+total);
                }

                case "8"->{
                    System.out.print("digite a palavra a pesquisar:  ");

                    String palavra = sc.nextLine();

                    int total = formtador.procurarPalavras(palavra);
                    if(total > 0){
                        System.out.println("A palavra \"" +palavra+ "\" aparece " +total+ " vezes.");
                    }else{
                        System.out.println("A palavra \""+palavra+"\" não foi encontrada.");
                    }
                }

                case "9"->{
                    System.out.println("Frase atual: "+formtador.obterFrase());
                }

                case "10"-> {
                    System.out.println("Saindo ...até mais");
                    sc.close();
                    return;
                }
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        }

    }
}
