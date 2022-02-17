package uabc.ic.benjaminbolanos.practica1;

import java.awt.Graphics;

/**
 *
 * @author benjabolanos
 */
public abstract class Figura {
    protected int posX;
    protected int posY;
    protected int tam;
    
    public Figura(int posX, int posY, int tam){
        this.posX = posX;
        this.posY = posY;
        this.tam = tam;
    }
    
    public abstract void dibujar(Graphics g);
}
