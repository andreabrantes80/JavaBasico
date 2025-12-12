package Sorteador_Numeros;

import javax.swing.*;

public class SorteadorDeNumerosApp {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(()->{
            new SorteadorDeNumerosJanela().setVisible(true);
        });
    }

    private SorteadorDeNumerosApp(){}
}
