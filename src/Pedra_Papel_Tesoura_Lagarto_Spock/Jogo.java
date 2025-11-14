package Pedra_Papel_Tesoura_Lagarto_Spock;

import java.util.Random;
import java.util.Scanner;

public class Jogo {

    public enum Escolha {
        PEDRA(1, "Pedra"),
        PAPEL(2, "Papel"),
        TESOURA(3, "Tesoura"),
        LAGARTO(4, "Lagarto"),
        SPOCK(5, "Spock");

        private final int codigo;

        private final String rotulo;

        Escolha(int codigo, String rotulo) {
            this.codigo = codigo;

            this.rotulo = rotulo;
        }

        public String getRotulo() {
            return rotulo;
        }

        public static Escolha fromCodigo(int codigo) {

            for (Escolha e : values()) {
                if (e.codigo == codigo)
                    return e;


            }
            return null;
        }
    }


    private int pontuacaoJogador = 0;
    private int pontuacaoComputador = 0;

    private final Random random = new Random();

    private final Scanner scanner;

    public Jogo(Scanner scanner) {
        this.scanner = scanner;
    }

    private Escolha obterEcolhaJogador() {
        while (true) {
            System.out.println("\nEscolha sua opção: ");
            System.out.println("1. Pedra");
            System.out.println("2. Papel");
            System.out.println("3. Tesoura");
            System.out.println("4. Lagarto");
            System.out.println("5. Spock");
            System.out.print("Digite (1 a 5): ");

            String linha = scanner.nextLine().trim();

            try {
                int codigo = Integer.parseInt(linha);

                Escolha escolha = Escolha.fromCodigo(codigo);

                if (escolha != null) {
                    return escolha;
                }
                System.out.println("Opção inválida. Tente novamente. ");

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número entre 1 e 5.");
            }


        }
    }

    private Escolha obterEscolhaComputador() {
        int codigo = 1 + random.nextInt(5);

        return Escolha.fromCodigo(codigo);
    }

    private void determinarVencedor(Escolha jogador, Escolha computador) {
        System.out.println("👉 Você escolheu: " + jogador.getRotulo());


        System.out.println("🤖 Computador escolheu: " + computador.getRotulo());


        if (jogador == computador) {
            System.out.println("🤝 Resultado: Empate!");
            return;
        }
        if (vence(jogador, computador)) {
            String motivo = motivoVitoria(jogador, computador);

            System.out.println("🏆 Você venceu esta rodada porque "
                    + jogador.getRotulo() + " " + motivo + " "
                    + computador.getRotulo() + "!");
            pontuacaoJogador++;
        } else {
            String motivo = motivoVitoria(computador, jogador);
            System.out.println("💥 Você perdeu esta rodada porque "
                    + computador.getRotulo() + " " + motivo + " "
                    + jogador.getRotulo() + "!");
            pontuacaoComputador++;
        }
        System.out.println("🏁 Placar após esta rodada: Você "
                + pontuacaoJogador + " x " + pontuacaoComputador + " Computador");

        System.out.println("-------------------------------------------------------------");
    }

    private boolean vence(Escolha a, Escolha b) {
        return switch (a) {
            case PEDRA -> (b == Escolha.TESOURA || b == Escolha.LAGARTO);
            case PAPEL -> (b == Escolha.PEDRA || b == Escolha.SPOCK);
            case TESOURA -> (b == Escolha.PAPEL || b == Escolha.LAGARTO);
            case LAGARTO -> (b == Escolha.SPOCK || b == Escolha.PAPEL);
            case SPOCK -> (b == Escolha.TESOURA || b == Escolha.PEDRA);
        };
    }

    private String motivoVitoria(Escolha vencedor, Escolha perdedor) {
        return switch (vencedor) {
            case PEDRA -> (perdedor == Escolha.TESOURA) ? "amassa" : "esmaga";
            case PAPEL -> (perdedor == Escolha.PEDRA) ? "cobre" : "refuta";
            case TESOURA -> (perdedor == Escolha.PAPEL) ? "corta" : "decapita";
            case LAGARTO -> (perdedor == Escolha.SPOCK) ? "envenena" : "come";
            case SPOCK -> (perdedor == Escolha.TESOURA) ? "esmaga" : "vaporiza";
        };
    }

    private int lerQuantidadeRodadas() {
        while (true) {
            System.out.println("\nQuantas rodadas você quer jogar: ");

            String linha = scanner.nextLine().trim();

            try {
                int n = Integer.parseInt(linha);
                if (n > 0) return n;
                System.out.println("Informe um número inteiro positivo.");


            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }
    }

    public void jogar() {
        System.out.println("🎮 Bem-vindo ao jogo Pedra, Tesoura, Papel, Lagarto e Spock!");

        int rodadas = lerQuantidadeRodadas();

        for (int i = 1; i <= rodadas; i++) {
            System.out.println("\n==== Rodada " + i + " de " + rodadas + " ====");
            Escolha escolhaJogador = obterEcolhaJogador();

            Escolha escolhaComputador = obterEscolhaComputador();

            determinarVencedor(escolhaJogador, escolhaComputador);
        }

        System.out.println("\n🏁 Fim de jogo!");

        if (pontuacaoJogador > pontuacaoComputador) {
            System.out.println("🏆 Você venceu com placar final!");
        } else if (pontuacaoJogador < pontuacaoComputador) {
            System.out.println("🤖🏆 O computador venceu o placar final!");

        } else {
            System.out.println("🤝 Resultado: Empate!");
        }
    }


}
