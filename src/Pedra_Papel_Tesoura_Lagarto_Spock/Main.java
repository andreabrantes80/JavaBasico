package Pedra_Papel_Tesoura_Lagarto_Spock;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        try (Scanner entrada = new Scanner(System.in)) {
            Jogo jogo = new Jogo(entrada);

            jogo.jogar();

        }
    }
}
