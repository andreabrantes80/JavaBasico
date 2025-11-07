package Map;

import java.util.HashMap;
import java.util.Map;

public class Tradutor_Ingles_Port {

    /*
    * Usa um Map<String, String> para armazenar 5 palavras em Pt como chave e suas traduções em inglês com valor
    * */

    public static void main(String[] args) {

        Map<String, String> dicionario = new HashMap<>();

        dicionario.put("cachorro", "dog");
        dicionario.put("gato", "cat");
        dicionario.put("casa", "house");
        dicionario.put("livro", "book");
        dicionario.put("carro", "car");

        System.out.println("Dicionário Português -> Inglês:  ");

        for(Map.Entry<String, String> entrada: dicionario.entrySet()){
            System.out.println(entrada.getKey()+ " -> "+entrada.getValue());
        }

        String palavra = "casa";

        if(dicionario.containsKey(palavra)){
            System.out.println("\nTradução de '" + palavra + "': "+dicionario.get(palavra));
        }else{
            System.out.println("\nA palavra '"+ palavra +"' não está no dicionário.");
        }

        dicionario.remove("gato");
        System.out.println("\nDicionário após remover o 'gato':");

        for (Map.Entry<String,String> entrada: dicionario.entrySet()){
            System.out.println(entrada.getKey()+ " -> "+entrada.getValue());
        }




    }
}
