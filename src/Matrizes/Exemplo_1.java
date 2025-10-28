package Matrizes;

public class Exemplo_1 {

    public static void main(String[] args) {
        int [][] matriz ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("Exemplo 1 - Imprimindo uma matriz 3 x3 ");

        for (int linha = 0; linha < 3; linha++){
            for(int coluna =0; coluna < 3; coluna++){
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }

        System.out.println("\n----------------------------------------\n");

        int[][] tabela = new int[2][3];

        tabela[0][0] = 10;
        tabela[0][1] = 20;
        tabela[0][2] = 30;

        tabela[1][0] = 40;
        tabela[1][1] = 50;
        tabela[1][2] = 60;

        System.out.println("Exemplo 2 =  Preenchendo matriz manualmente: ");

        for (int i=0; i< 2; i++){
            for (int j = 0; j<3; j++){
                System.out.println(tabela[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("\n----------------------------------------\n");

        int[][] dados = {
                {5, 20},
                {15, 30}
        };

        int soma = 0;
        for (int i =0; i< dados.length; i++){
            for (int j=0; j < dados.length; j++){
                soma += dados[i][j];
            }
        }
        System.out.println("Exemplo 3 = Soma de todos elementos da matriz: "+ soma);

        System.out.println("\n----------------------------------------\n");
        int [][] numeros ={
                {7,2,9},
                {1,6,3}
        };

        int maior = numeros[0][0];

        for(int i = 0; i< numeros.length; i++){
            for (int j = 0; j< numeros[i].length; j++ ){
                if(numeros[i][j] > maior){
                    maior = numeros[i][j];
                }
            }
        }
        System.out.println("Exemplo 4 - Maior numeros da matriz "+ maior);

        System.out.println("\n----------------------------------------\n");


    }


}
