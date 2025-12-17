package ScrollerTexto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ScrollerTexto extends JPanel implements MouseListener {

    private static final int LARGURA = 800;
    private  static final  int ALTURA = 100;
    private static final int DELAY = 50;

    private static final int VELOCIDADE = -2;

    private String texto;
    private int posX;
    private Timer temporizador;

    public  ScrollerTexto(String textoInicial){
        this.texto = textoInicial;
        this.posX = LARGURA;
        setPreferredSize(new Dimension(LARGURA, ALTURA));
        setBackground(Color.BLACK);
        addMouseListener(this);
        temporizador = new Timer(DELAY, e -> moverTexto());
        temporizador.start();
    }

    private void moverTexto(){
        posX += VELOCIDADE;
        FontMetrics fm = getFontMetrics(new Font("SansSerif", Font.PLAIN, 50));
        int larguraTexto = fm.stringWidth(texto);

        if(posX + larguraTexto < 0){
            posX = LARGURA;
        }

        repaint();
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.green);
        Font fonte = new Font("SansSerif", Font.PLAIN, 50);
        g.setFont(fonte);
        FontMetrics fm = g.getFontMetrics(fonte);
        int posY = (ALTURA - fm.getHeight()) / 2 + fm.getAscent();
        g.drawString(texto, posX, posY);
    }

    @Override
    public void mouseEntered(MouseEvent e){
        temporizador.stop();

    }

    @Override
    public void mouseExited(MouseEvent e){
        temporizador.start();
    }

    @Override
    public void mouseClicked(MouseEvent e ){

    }

    @Override
    public void mousePressed(MouseEvent e ){

    }

    @Override
    public void mouseReleased(MouseEvent e ){

    }
}
