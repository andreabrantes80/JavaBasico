package Sorteador_Numeros;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public final class SorteioController implements ActionListener {

    private final SorteadorDeNumerosJanela ui;

    private javax.swing.Timer temporizador;
    private int contador;

    public SorteioController(SorteadorDeNumerosJanela ui) {
        this.ui = ui;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        iniciarProcedimentoDeSorteio();
    }

    private void iniciarProcedimentoDeSorteio() {
        ui.exibirContagem("");
        ui.exibirResultado("");

        final int minimo;
        final int maximo;

        try {
            minimo = Integer.parseInt(ui.getTextoMinimo().trim());
            maximo = Integer.parseInt(ui.getTextoMaximo().trim());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite valores de numericos inteiros!",
                    "Erro de Entrada",
                    JOptionPane.ERROR_MESSAGE);
            return;

        }
        if (minimo > maximo) {
            JOptionPane.showMessageDialog(null, "O valor mínimo não pode ser maior que o máximo!",
                    "Intervalo Inválido", JOptionPane.WARNING_MESSAGE);
            return;
        }

        ui.habilitarBotao(false);

        contador = 5;

        ui.exibirContagem("Começando em: " + contador);
        temporizador = new Timer(1_000, evento -> {
            contador--;
            if (contador > 0) {
                ui.exibirContagem("Revelando em: " + contador);
            } else {
                temporizador.stop();
                int resultado = UtilNumeroAleatorio.sortear(minimo, maximo);
                ui.exibirContagem("Fim da contagem!");
                ui.exibirContagem("Número sorteado: " + resultado);
                ui.habilitarBotao(true);

            }
        });

        temporizador.start();
    }


}
