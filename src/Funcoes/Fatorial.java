package Funcoes;

public class Fatorial {
    public static void main(String[] args) {

        System.out.println("Fatorial de 5: " + fatorial(5));

    }

    public static int fatorial(int n) {


        int resultado = 1;

        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
