package LIstas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exemplo_5 {

    public static void main(String[] args) {

        System.out.println("==== Slicing de Listas em Java (Simulando_ ===");

        ArrayList<Integer> minhaLista = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));

        System.out.println("Lista Original: "+minhaLista);

        List<Integer> subconjunto = minhaLista.subList(1,4);

        System.out.println("\nSubconjunto [1:4]: "+subconjunto);

        List<Integer> primeirosElementos = minhaLista.subList(0,2);

        System.out.println("Primeiros elementos [:2]: "+primeirosElementos);

        List<Integer> elementosDepoisDe2 = minhaLista.subList(2, minhaLista.size());

        System.out.println("Elementos a partir do índice 2 [2:]: "+elementosDepoisDe2);

        ArrayList<Integer> elementosAlternardos = new ArrayList<>();

        for (int i=0; i <minhaLista.size(); i += 2){
            elementosAlternardos.add(minhaLista.get(i));
        }

        System.out.println("Elementos alternados [::2]: "+elementosAlternardos);


        ArrayList<Integer> subconjuntoAlternardos = new ArrayList<>();

        for (int i = 2; i<8; i+=2){
            subconjuntoAlternardos.add(minhaLista.get(i));
        }

        System.out.println("Subconjunto alternado [2:8:2]: "+subconjuntoAlternardos);

        System.out.println("minha lista [2] = "+minhaLista.get(2));

        System.out.println("minha lista [4] = "+minhaLista.get(4));

        System.out.println("minha lista [6] = "+minhaLista.get(6));



    }
}
