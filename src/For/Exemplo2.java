package For;

import java.util.Arrays;
import java.util.List;

public class Exemplo2 {

    public static void main(String[] args) {
        List<String> lista = Arrays.asList("A", "B", "C", "D", "E");

        for (String item: lista){
            System.out.println(item);
            if(item.matches("C")){
                break;
            }
        }
        System.out.println();
    }
}
