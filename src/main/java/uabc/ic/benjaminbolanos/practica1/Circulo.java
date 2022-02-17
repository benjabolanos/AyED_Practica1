package uabc.ic.benjaminbolanos.practica1;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author benjabolanos
 */
public class Circulo extends Figura{
    public Circulo(int posX, int posY, int diametro){
        super(posX, posY, diametro);
    }
    
    @Override
    public void dibujar(Graphics g) {
        g.setColor(new Color(0,163,255));
        g.fillOval(posX, posY, tam, tam);
        
        g.setColor(Color.black);
        g.drawOval(posX, posY, tam, tam);
    }

}
