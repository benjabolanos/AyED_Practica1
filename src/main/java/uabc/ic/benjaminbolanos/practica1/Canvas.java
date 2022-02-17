package uabc.ic.benjaminbolanos.practica1;

import java.util.ArrayList;

import javax.swing.JPanel;

/**
 *
 * @author jorgeeie
 */
public class Canvas extends JPanel{
    private final ArrayList<Figura> figuras;
    
    public Canvas(){
        figuras = new ArrayList();
    }
    
    public void crearCuadrado(int posX, int posY, int tam){
        figuras.add(new Cuadrado(posX, posY, tam));
    }
    
    public void crearTriangulo(int posX, int posY, int tam){
        figuras.add(new Triangulo(posX, posY, tam));
    }
    
    public void crearEspiral(int posX, int posY, int ciclos, int radioInicial, int incremento){
        figuras.add(new Espiral(posX, posY, ciclos, radioInicial, incremento));
    }
    
    public void crearCirculo(int posX, int posY, int diametro){
        figuras.add(new Circulo(posX, posY, diametro));
    }
    
    public void crearPoligono(ArrayList<Integer> puntosX, ArrayList<Integer> puntosY){
        figuras.add(new Poligono(puntosX, puntosY));
    }
    
    public void dibujarFiguras(boolean cuadrados, boolean triangulos, boolean espirales, boolean circulos, boolean poligonos){
        figuras.forEach(fig -> {
            Class clase = fig.getClass();
            if (clase == Cuadrado.class && cuadrados ||
                    clase == Triangulo.class && triangulos ||
                    clase == Espiral.class && espirales ||
                    clase == Circulo.class && circulos ||
                    clase == Poligono.class && poligonos) {
                fig.dibujar(getGraphics());
            }
        });
    }
    
    public void limpiar(){
        super.paint(getGraphics());
    }
    
    public void reiniciarFiguras(){
        figuras.clear();
    }
    
    public int cantidadFiguras(){
        return figuras.size();
    }
}
