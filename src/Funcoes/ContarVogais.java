package Funcoes;

public class ContarVogais {
    public static void main(String[] args) {

        System.out.println("Vogais: "+contarVogais("Exercicio"));

    }

    public static int contarVogais(String texto){
        int contador =0;

        texto = texto.toLowerCase();

        for (char c : texto.toCharArray()){
            if("aeiou".indexOf(c) != -1){
                contador++;
            }
        }
        return contador;
    }
}
