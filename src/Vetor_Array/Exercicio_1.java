package Vetor_Array;

public class Exercicio_1 {

    public static void main(String[] args) {
        int [] vetor = {10,20,30,40,50,60};

        System.out.println("Emementos em ordem inversa:");

        for(int i = vetor.length -1; i >=0; i--){
            System.out.println(vetor[i]);
        }
    }
}
