package Funcoes;

public class Ex_2 {

    public static void main(String[] args) {

        linhaSeparadora();
        repetirMensagem("Estudar funções é legal", 3);

        linhaSeparadora();

        int x=32, y=5;
        System.out.println(x + "é multiplo de "+y+"? "+ehMultiplo(x,y));

        linhaSeparadora();

        String nome = "Carlos";

        System.out.println("A primeira letra do nome \""+nome+"\" é:"+primeiraLetra(nome) );

    }

    public static void linhaSeparadora(){
        System.out.println("============================");
    }

    public static void repetirMensagem(String msg, int vezes){
        for (int i=0; i< vezes;i++){
            System.out.println(msg);
        }

    }

    public static boolean ehMultiplo(int a, int b){
        return a % b == 0;
    }

    public static char primeiraLetra(String nome){
        return nome.charAt(0);
    }

}
