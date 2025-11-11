package FormatadorDeFrase;

import java.text.Normalizer;

public class FormatadorDeFrase {

    private String frase;

    public FormatadorDeFrase(String frase) {
        this.frase = frase;
    }

    public void paraMaisuculas() {
        this.frase = this.frase.toUpperCase();
    }

    public void paraMinusculas() {
        this.frase = this.frase.toLowerCase();
    }

    public void capitalizar() {
        if (frase == null || frase.isEmpty()) return;

        String f = frase.trim();

        if (f.isEmpty()) {
            this.frase = f;
            return;

        }
        String primeira = f.substring(0, 1).toUpperCase();
        String restante = f.substring(1).toLowerCase();

        this.frase = primeira + restante;
    }

    public void formatoTitulo() {
        if (frase == null || frase.isEmpty()) return;

        String[] palavras = frase.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < palavras.length; i++) {

            String p = palavras[i];
            if (p.length() > 0) {
                String primeira = p.substring(0, 1).toUpperCase();
                String resto = p.substring(1);
                sb.append(primeira).append(resto);
            }
            if (i < palavras.length - 1) sb.append(" ");
        }
        this.frase = sb.toString();
    }

    public int contarVogais() {
        if (frase == null || frase.isEmpty()) return 0;

        final String VOGAIS = "aeiouáéíóúàèìòùâêîôûãõ";
        int contagem = 0;

        String f = frase.toLowerCase();

        for (int i = 0; i < f.length(); i++) {

            char c = f.charAt(i);

            if (VOGAIS.indexOf(c) >= 0) contagem++;

        }
        return contagem;

    }

    public int contarConsoantes() {

        if (frase == null || frase.isEmpty()) return 0;

        final String CONSOANTES = "bcdfghjklmnpqrstwxyzç";

        int contagem = 0;

        String f = frase.toLowerCase();

        for (int i = 0; i < f.length(); i++) {

            char c = f.charAt(i);

            if (CONSOANTES.indexOf(c) >= 0) contagem++;

        }


        return contagem;
    }

    public int contarLetraA() {
        if (frase == null || frase.isEmpty()) return 0;

        String f = frase.toLowerCase();

        int total = 0;

        int idx = f.indexOf('a');

        while (idx != -1) {
            total++;
            idx = f.indexOf('a', idx + 1);
        }
        return total;

    }

    public int procurarPalavras(String palavra) {
        if (frase == null || palavra == null) return 0;

        String f = frase.toLowerCase();
        String p = palavra.toLowerCase();

        if (p.isEmpty()) return 0;

        int total = 0;

        int from = 0;
        int pos;

        while ((pos = f.indexOf(p, from)) != -1) {
            total++;
            from = pos + p.length();
        }
        return total;
    }

    public String obterFrase() {

        return this.frase;

    }

    public static String removerAcentos(String texto) {
        if (texto == null) return null;

        String norm = Normalizer.normalize(texto, Normalizer.Form.NFD);

        return norm.replaceAll("\\p{InCOMBINING_DIACRITICAL_MARKS}+ ", "");
    }


}
