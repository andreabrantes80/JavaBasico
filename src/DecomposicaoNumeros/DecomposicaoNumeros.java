package DecomposicaoNumeros;

import java.util.ArrayList;
import java.util.Scanner;

public class DecomposicaoNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true){
            try{

                System.out.print("Digite um número inteiro menor que 10.000: ");
                int numero = Integer.parseInt(entrada.nextLine());
                if(numero >= 0 && numero < 10000){
                    int milhares = numero / 1000;
                    int centenas = (numero % 1000) / 100;
                    int dezenas = (numero % 100) / 10;
                    int unidades = numero % 10;

                    ArrayList<String> partes = new ArrayList<>();
                    if(milhares > 0){
                        partes.add(milhares +" "+ (milhares > 1 ? "milhares" : "milhar"));

                    }
                    if(centenas > 0 ){
                        partes.add(centenas+ " "+ (centenas > 1 ? "centenas" : "centena"));
                    }
                    if(dezenas > 0){
                        partes.add(dezenas+ " "+ (dezenas > 1 ? "dezenas": "dezena"));
                    }
                    if(unidades > 0 ){
                        partes.add(unidades+ " "+ (unidades > 1 ? "unidades" : "unidade"));
                    }
                    String resultado;
                    if(numero == 0){
                        resultado = "0";
                    } else if (partes.size() > 1) {
                        resultado = String.join(", ", partes.subList(0, partes.size() - 1));
                        resultado += " e "+ partes.get(partes.size() -1);

                    }else{
                        resultado = partes.get(0);
                    }
                    System.out.println(resultado);
                    System.out.print("Deseja decompor outro número? (sim/não): ");
                    String continuar = entrada.nextLine().trim().toLowerCase();

                    if(!continuar.equals("sim")){
                        System.out.println("Obrigado por usar o programa!");
                        break;
                    }
                }

            }catch (NumberFormatException e){
                System.out.println("Por favor, digite um número válido.");
                System.out.println("Deseja tentar novamente? (sim/não): ");

                String tentarNovamente = entrada.nextLine().trim().toLowerCase();

                if(!tentarNovamente.equals("sim")){
                    System.out.println("Obrigado por usar o programa!");
                    break;
                }
            }
        }
        entrada.close();
    }
}
