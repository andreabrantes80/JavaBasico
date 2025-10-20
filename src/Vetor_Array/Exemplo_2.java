package Vetor_Array;

public class Exemplo_2 {

    public static void main(String[] args) {
        int [] original = {10,20,30,40,50};

        int [] copia = new int[5];

        for(int i =0; i <original.length; i++){
            copia[i] = original[i];
        }

        for (int valor : copia){
            System.out.println("Dados copiados : "+ valor);
        }
    }
}
