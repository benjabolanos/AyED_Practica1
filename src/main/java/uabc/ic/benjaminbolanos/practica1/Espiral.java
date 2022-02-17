package uabc.ic.benjaminbolanos.practica1;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author benjabolanos
 */
public class Espiral extends Figura{
    private final int radioInicial;
    private final int incremento;
    private int radio;
    
    public Espiral(int posX, int posY, int ciclos, 
            int radioInicial, int incremento){
        super(posX, posY, ciclos);
        this.radioInicial = radioInicial;
        this.incremento = incremento;
    }
    
    @Override
    public void dibujar(Graphics g) {
        g.setColor(Color.black);
        radio = radioInicial;
        for(int i=0; i<tam;i++){
            g.drawArc(posX-radio, posY-radio, 2*radio, 2*radio, 0, 180);
            radio += incremento;
            g.drawArc(posX-radio, posY-radio, 2*radio-incremento, 2*radio, 180, 180);
        }
    }

}
