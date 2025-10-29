package LIstas;

import java.util.ArrayList;
import java.util.Arrays;

public class Exemplo_2 {

    public static void main(String[] args) {

        System.out.println("=========Lista de Notas de Alunos========");
        ArrayList<Integer> notasAluno = new ArrayList<>(Arrays.asList(85,90,78,92,88));
        System.out.println("Notas do aluno: "+ notasAluno);

        String mensagem = "Olá";

        System.out.println("Mensagem: "+mensagem);

        System.out.println("Tipo: String");

        ArrayList<String> listaDeStrings = new ArrayList<>(Arrays.asList("Olá", "Mundo"));

        System.out.println("Lista de Strings: "+listaDeStrings);

        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1 ,2, 3));

        lista.set(0, 100);
        lista.set(1,50);

        System.out.println("Lista alterada: "+lista);


    }
}
