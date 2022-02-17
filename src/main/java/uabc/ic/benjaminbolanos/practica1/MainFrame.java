package uabc.ic.benjaminbolanos.practica1;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author bbola
 */
public class MainFrame extends javax.swing.JFrame {
    private boolean dibujandoPoligono;
    private final ArrayList<Integer> ptsPolX;
    private final ArrayList<Integer> ptsPolY;
    private int contadorLadosPol;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        dibujandoPoligono = false;
        ptsPolX = new ArrayList();
        ptsPolY = new ArrayList();
        contadorLadosPol = 0;
    }
    
    private void dibujarFiguras(){
        canvas.limpiar();
        canvas.dibujarFiguras(cuadradoCB.isSelected(), trianguloCB.isSelected(), 
            espiralCB.isSelected(), circuloCB.isSelected(), poligonoCB.isSelected());
        actualizarContadorFiguras();
    }
    
    private void actualizarContadorFiguras(){
        contadorLabel.setText("Figuras Creadas: " + canvas.cantidadFiguras());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCBoxes = new javax.swing.JPanel();
        cuadradoCB = new javax.swing.JCheckBox();
        trianguloCB = new javax.swing.JCheckBox();
        espiralCB = new javax.swing.JCheckBox();
        circuloCB = new javax.swing.JCheckBox();
        poligonoCB = new javax.swing.JCheckBox();
        panelBotones = new javax.swing.JPanel();
        practicaLabel = new javax.swing.JLabel();
        cuadradoBtn = new javax.swing.JButton();
        trianguloBtn = new javax.swing.JButton();
        espiralBtn = new javax.swing.JButton();
        circuloBtn = new javax.swing.JButton();
        poligonoBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        dibujarBtn = new javax.swing.JButton();
        limpiarBtn = new javax.swing.JButton();
        eliminarBtn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        contadorLabel = new javax.swing.JLabel();
        canvas = new uabc.ic.benjaminbolanos.practica1.Canvas();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Practica 1 Bolaños Garrido");
        setLocationByPlatform(true);
        setResizable(false);

        panelCBoxes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cuadradoCB.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        cuadradoCB.setSelected(true);
        cuadradoCB.setText("Cuadrados");
        panelCBoxes.add(cuadradoCB);

        trianguloCB.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        trianguloCB.setSelected(true);
        trianguloCB.setText("Triangulos");
        panelCBoxes.add(trianguloCB);

        espiralCB.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        espiralCB.setSelected(true);
        espiralCB.setText("Espirales");
        panelCBoxes.add(espiralCB);

        circuloCB.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        circuloCB.setSelected(true);
        circuloCB.setText("Circulos");
        panelCBoxes.add(circuloCB);

        poligonoCB.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        poligonoCB.setSelected(true);
        poligonoCB.setText("Poligonos");
        panelCBoxes.add(poligonoCB);

        panelBotones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        practicaLabel.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        practicaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        practicaLabel.setText("Practica 1 Benjamin Bolaños");

        cuadradoBtn.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        cuadradoBtn.setText("Cuadrado");
        cuadradoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadradoBtnActionPerformed(evt);
            }
        });

        trianguloBtn.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        trianguloBtn.setText("Triangulo");
        trianguloBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trianguloBtnActionPerformed(evt);
            }
        });

        espiralBtn.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        espiralBtn.setText("Espiral");
        espiralBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espiralBtnActionPerformed(evt);
            }
        });

        circuloBtn.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        circuloBtn.setText("Circulo");
        circuloBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circuloBtnActionPerformed(evt);
            }
        });

        poligonoBtn.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        poligonoBtn.setText("Poligono");
        poligonoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poligonoBtnActionPerformed(evt);
            }
        });

        dibujarBtn.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        dibujarBtn.setText("Dibujar Figuras");
        dibujarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dibujarBtnActionPerformed(evt);
            }
        });

        limpiarBtn.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        limpiarBtn.setText("Limpiar Canvas");
        limpiarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBtnActionPerformed(evt);
            }
        });

        eliminarBtn.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        eliminarBtn.setText("Eliminar Figuras");
        eliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBtnActionPerformed(evt);
            }
        });

        contadorLabel.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        contadorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contadorLabel.setText("Figuras Creadas: 0");

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(practicaLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(poligonoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(circuloBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(espiralBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(trianguloBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cuadradoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(eliminarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(limpiarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dibujarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(40, 40, 40))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                        .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(contadorLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(practicaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuadradoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(trianguloBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(espiralBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(circuloBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(poligonoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dibujarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(limpiarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contadorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        canvas.setBackground(new java.awt.Color(204, 204, 204));
        canvas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        canvas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                canvasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout canvasLayout = new javax.swing.GroupLayout(canvas);
        canvas.setLayout(canvasLayout);
        canvasLayout.setHorizontalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        canvasLayout.setVerticalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCBoxes, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(canvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(canvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelCBoxes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cuadradoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadradoBtnActionPerformed
        InfoDialog infoDialog = new InfoDialog(this,true, "Cuadrado");
        infoDialog.setVisible(true);
        if(infoDialog.haySalidaExitosa()){
            int[] infoFigura = infoDialog.getInfo();
            canvas.crearCuadrado(infoFigura[0], infoFigura[1], infoFigura[2]);
            dibujarFiguras();
        }
    }//GEN-LAST:event_cuadradoBtnActionPerformed

    private void trianguloBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trianguloBtnActionPerformed
        InfoDialog infoDialog = new InfoDialog(this, true, "Triangulo");
        infoDialog.setVisible(true);
        if(infoDialog.haySalidaExitosa()){
            int[] infoFigura = infoDialog.getInfo();
            canvas.crearTriangulo(infoFigura[0], infoFigura[1], infoFigura[2]);
            dibujarFiguras();
        }
    }//GEN-LAST:event_trianguloBtnActionPerformed

    private void espiralBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espiralBtnActionPerformed
        InfoDialog infoDialog = new InfoDialog(this, true, "Espiral");
        infoDialog.setVisible(true);
        if(infoDialog.haySalidaExitosa()){
            int[] infoFigura = infoDialog.getInfo();
            canvas.crearEspiral(infoFigura[0], infoFigura[1], infoFigura[2], infoFigura[3], infoFigura[4]);
            dibujarFiguras();
        }
    }//GEN-LAST:event_espiralBtnActionPerformed

    private void circuloBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circuloBtnActionPerformed
        InfoDialog infoDialog = new InfoDialog(this, true, "Circulo");
        infoDialog.setVisible(true);
        if(infoDialog.haySalidaExitosa()){
            int[] infoFigura = infoDialog.getInfo();
            canvas.crearCirculo(infoFigura[0], infoFigura[1], infoFigura[2]);
            dibujarFiguras();
        }
    }//GEN-LAST:event_circuloBtnActionPerformed

    private void poligonoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poligonoBtnActionPerformed
        dibujandoPoligono = true;
        for(Component c : panelBotones.getComponents()){
            c.setEnabled(false);
        }
        for(Component c : panelCBoxes.getComponents()){
            c.setEnabled(false);
        }
    }//GEN-LAST:event_poligonoBtnActionPerformed

    private void canvasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvasMouseClicked
        if(dibujandoPoligono){
            if(evt.getClickCount() == 2){
                ptsPolX.add(ptsPolX.get(0));
                ptsPolY.add(ptsPolY.get(0));
                dibujandoPoligono = false;
                canvas.crearPoligono(ptsPolX, ptsPolY);
                contadorLadosPol = 0;
                ptsPolX.clear();
                ptsPolY.clear();
                for(Component c : panelBotones.getComponents())
                    c.setEnabled(true);
                for(Component c : panelCBoxes.getComponents())
                    c.setEnabled(true);
                dibujarFiguras();
            } else{
                ptsPolX.add(evt.getX());
                ptsPolY.add(evt.getY());
                if(contadorLadosPol>0){
                    Graphics g=this.getGraphics();
                    g.setColor(Color.BLACK);
                    g.drawLine(ptsPolX.get(contadorLadosPol-1)+256, ptsPolY.get(contadorLadosPol-1)+30, ptsPolX.get(contadorLadosPol)+256, ptsPolY.get(contadorLadosPol)+30);
                }
                contadorLadosPol++;
            }
        }
    }//GEN-LAST:event_canvasMouseClicked

    private void dibujarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dibujarBtnActionPerformed
        dibujarFiguras();
    }//GEN-LAST:event_dibujarBtnActionPerformed

    private void limpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtnActionPerformed
        canvas.limpiar();
        actualizarContadorFiguras();
    }//GEN-LAST:event_limpiarBtnActionPerformed

    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBtnActionPerformed
        canvas.reiniciarFiguras();
        canvas.limpiar();
        actualizarContadorFiguras();
    }//GEN-LAST:event_eliminarBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private uabc.ic.benjaminbolanos.practica1.Canvas canvas;
    private javax.swing.JButton circuloBtn;
    private javax.swing.JCheckBox circuloCB;
    private javax.swing.JLabel contadorLabel;
    private javax.swing.JButton cuadradoBtn;
    private javax.swing.JCheckBox cuadradoCB;
    private javax.swing.JButton dibujarBtn;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JButton espiralBtn;
    private javax.swing.JCheckBox espiralCB;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelCBoxes;
    private javax.swing.JButton poligonoBtn;
    private javax.swing.JCheckBox poligonoCB;
    private javax.swing.JLabel practicaLabel;
    private javax.swing.JButton trianguloBtn;
    private javax.swing.JCheckBox trianguloCB;
    // End of variables declaration//GEN-END:variables
}
