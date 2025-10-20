package Vetor_Array;

public class Exemplo_4 {

    public static void main(String[] args) {
        int [] vetor={7,3,5,6,7,1,6,7};

        int contador = 0;

        for(int valor: vetor){
            if(valor == 7){
                contador++;
            }
        }
        System.out.println("O numero 7 aparece " +contador+ " vezes ");
    }
}
