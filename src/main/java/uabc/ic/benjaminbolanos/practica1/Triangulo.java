package uabc.ic.benjaminbolanos.practica1;

import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author benjabolanos
 */
public class Triangulo extends Figura{
    private final int[] puntosX;
    private final int[] puntosY;
    
    public Triangulo(int posX, int posY, int tam){
        super(posX, posY, tam);
        puntosX = new int[3];
        puntosY = new int[3];
        calcularPuntos();
    }
    
    @Override
    public void dibujar(Graphics g) {
        g.setColor(new Color(0,163,255));
        g.fillPolygon(puntosX, puntosY, 3);
        
        g.setColor(Color.black);
        g.drawPolygon(puntosX, puntosY, 3);
    }
    
    private void calcularPuntos(){
        puntosX[0] = posX;
        puntosX[1] = posX + tam/2;
        puntosX[2] = posX - tam/2;
        
        puntosY[0] = posY;
        puntosY[1] = (int) (posY + sqrt(pow(tam,2)-pow(tam/2,2)));
        puntosY[2] = puntosY[1];
    }
}
