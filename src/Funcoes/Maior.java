package Funcoes;

public class Maior {

    public static void main(String[] args) {

        System.out.println("Maior: "+ maior(15,22));
    }

    public static int maior(int a,int b){
        return (a > b) ? a : b;
    }
}
