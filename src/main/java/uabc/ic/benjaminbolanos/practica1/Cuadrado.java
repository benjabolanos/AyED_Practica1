package uabc.ic.benjaminbolanos.practica1;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author benjabolanos
 */
public class Cuadrado extends Figura{
    
    public Cuadrado(int posX, int posY, int tam){
        super(posX, posY, tam);
    }
    
    @Override
    public void dibujar(Graphics g) {
        g.setColor(new Color(0,163,255));
        g.fillRect(posX, posY, tam, tam);
        
        g.setColor(Color.black);
        g.drawRect(posX, posY, tam, tam);
    }

}
