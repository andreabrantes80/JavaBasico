package Matrizes;

public class Exercicio_1 {

    public static void main(String[] args) {
        int [][] matriz ={
                {2,4,6},
                {8,10,12}
        };

        int soma =0;
        int total = 0;

        for (int [] linha : matriz){
            for (int valor : linha){
                soma += valor;
                total++;
            }
        }
        double media = (double) soma / total;

        System.out.println("A média dos elementos : "+media);
    }
}
