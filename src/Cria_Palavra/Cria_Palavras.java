package Cria_Palavra;

import java.util.*;

public class Cria_Palavras {

    static List<String> dicionarioPalavras = Arrays.asList("rato", "esto", "ator", "tora", "rosa", "arte", "rota", "ser", "seta");

    static boolean jogoAtivo = true;

    public static List<Character> gerarPalavrasValidas(List<String> dicionario) {
        Random aleatorio = new Random();

        String palavra = dicionario.get(aleatorio.nextInt(dicionario.size()));
        Set<Character> letrasUnicas = new HashSet<>();
        for (char c : palavra.toCharArray()) {
            letrasUnicas.add(c);
        }
        List<Character> letrasLista = new ArrayList<>(letrasUnicas);
        Collections.shuffle(letrasLista);

        int quantidade = Math.min(6, letrasLista.size());
        return letrasLista.subList(0, quantidade);
    }

    public static boolean palavraValida(String palavra, List<Character> letrasDisponiveis) {
        List<Character> letrasTemp = new ArrayList<>(letrasDisponiveis);
        for (char c : palavra.toCharArray()) {
            if (!letrasTemp.contains(c)) {
                return false;
            }
            letrasTemp.remove((Character) c);
        }
        return true;
    }

    public static void iniciarTemporizador(int segundos) {
        Timer temporizador = new Timer();
        temporizador.schedule(new TimerTask() {
            @Override
            public void run() {
                jogoAtivo = false;

                temporizador.cancel();
            }
        }, segundos * 1000L);
    }

    public static void jogoCriacaoPalavras() {
        Scanner entrada = new Scanner(System.in);

        List<Character> letrasDisponiveis = gerarPalavrasValidas(dicionarioPalavras);

        System.out.println("Bem vindo ao Jogo de Criação de Palavras!");
        System.out.println("Você tem 60 segundos para formar palavras.");
        System.out.print("Letras disponíveis: ");

        for (char c : letrasDisponiveis) {
            System.out.print(Character.toUpperCase(c) + " ");
        }
        System.out.println("\n");

        int pontuacao = 0;

        List<String> palavrasFormadas = new ArrayList<>();

        long inicio = System.currentTimeMillis();

        long duracao = 10 * 1000;

        while (System.currentTimeMillis() - inicio < duracao) {
            System.out.print("Digite uma palavra: ");
            String palavra = entrada.nextLine().toLowerCase();

            if (!jogoAtivo) break;
            if (dicionarioPalavras.contains(palavra) && palavraValida(palavra, letrasDisponiveis)) {
                if (!palavrasFormadas.contains(palavra)) {
                    palavrasFormadas.add(palavra);
                    pontuacao += 10;
                    System.out.println("Correto! +10 pontos");
                } else {
                    System.out.println("Você já usou essa palavra!\n");
                }
            } else {
                System.out.println("Incorreto! Palavra inválida ou não pode ser formada.\n");
            }
        }


        List<String> palavrasPossiveis = new ArrayList<>();
        for (String palavra : dicionarioPalavras) {
            if (palavraValida(palavra, letrasDisponiveis)) {
                palavrasPossiveis.add(palavra);
            }
        }

        System.out.println("\nTempo esgotado!");
        System.out.println("\nVocê formou " + palavrasFormadas.size() + " palavras e ganhou " + pontuacao + " pontos.");
        System.out.println("\nPalavras possíveis com as letras disponíveis: " + String.join(", ", palavrasPossiveis));
        entrada.close();

    }

    public static void main(String[] args) {

        jogoCriacaoPalavras();

    }
}
