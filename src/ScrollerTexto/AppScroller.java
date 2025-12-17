package ScrollerTexto;

import javax.swing.*;

public class AppScroller {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            JFrame janela = new JFrame("Scroller de Texto Interrativo");

            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            String textoExemplo = "Este é um  exemplo de Java...";

            ScrollerTexto painel = new ScrollerTexto(textoExemplo);

            janela.getContentPane().add(painel);
            janela.pack();
            janela.setLocationRelativeTo(null);
            janela.setVisible(true);
        });
    }
}
