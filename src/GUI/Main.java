package GUI;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.IOException;
import java.net.URL;
import javax.imageio.*;
import classes.*;

/**
 *
 * @author Ivo Berger
 */
public class Main extends javax.swing.JFrame implements MouseListener {

    public Main() {
        initComponents();
    }
    
    private String object;
    public int ix,iy,ax,ay;
    IDraw paint;
    private Objektliste Auto;
    private Objektliste Straße;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tp_main = new javax.swing.JTabbedPane();
        p_main = new javax.swing.JPanel();
        l_title = new javax.swing.JLabel();
        l_developers = new javax.swing.JLabel();
        l_Editor = new javax.swing.JLabel();
        l_map = new javax.swing.JLabel();
        b_mapImport = new javax.swing.JButton();
        b_mapExport = new javax.swing.JButton();
        b_addRoad = new javax.swing.JButton();
        b_addCrossroad = new javax.swing.JButton();
        b_addBridge = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        p_main.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p_mainLayout = new javax.swing.GroupLayout(p_main);
        p_main.setLayout(p_mainLayout);
        p_mainLayout.setHorizontalGroup(
            p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 641, Short.MAX_VALUE)
        );
        p_mainLayout.setVerticalGroup(
            p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );

        tp_main.addTab("Ein Dorf", p_main);

        l_title.setFont(new java.awt.Font("Open Sans", 0, 36)); // NOI18N
        l_title.setText("Perfect Traffic");

        l_developers.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        l_developers.setText("developed by Remo Raabe and Ivo Berger");

        l_Editor.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        l_Editor.setText("Editor");

        l_map.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        l_map.setText("Karten");

        b_mapImport.setText("Import");
        b_mapImport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_mapImport.setPreferredSize(new java.awt.Dimension(121, 23));
        b_mapImport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_mapImportMouseClicked(evt);
            }
        });

        b_mapExport.setText("Export / Speichern");
        b_mapExport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_mapExport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_mapExportMouseClicked(evt);
            }
        });

        b_addRoad.setText("Straße");
        b_addRoad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_addRoad.setPreferredSize(new java.awt.Dimension(121, 23));
        b_addRoad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_addRoadMouseClicked(evt);
            }
        });

        b_addCrossroad.setText("Kreuzung");
        b_addCrossroad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_addCrossroad.setPreferredSize(new java.awt.Dimension(121, 23));
        b_addCrossroad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_addCrossroadMouseClicked(evt);
            }
        });

        b_addBridge.setText("Brücke");
        b_addBridge.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_addBridge.setPreferredSize(new java.awt.Dimension(121, 23));
        b_addBridge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_addBridgeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_map)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(l_Editor)
                                .addComponent(b_addCrossroad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b_addRoad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b_mapImport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b_addBridge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b_mapExport)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tp_main))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l_title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(l_developers)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_title)
                    .addComponent(l_developers))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(l_map)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_mapImport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_mapExport)
                        .addGap(18, 18, 18)
                        .addComponent(l_Editor)
                        .addGap(18, 18, 18)
                        .addComponent(b_addRoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b_addCrossroad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b_addBridge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tp_main)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_mapImportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_mapImportMouseClicked
        // TODO add your handling code here: IMPORT MAP
    }//GEN-LAST:event_b_mapImportMouseClicked

    private void b_mapExportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_mapExportMouseClicked
        // TODO add your handling code here: EXPORT/SAVE MAP
    }//GEN-LAST:event_b_mapExportMouseClicked

    private void b_addRoadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_addRoadMouseClicked
        // TODO add your handling code here: PAINT ROAD
        this.object="road";
        this.p_main.addMouseListener(this);
    }//GEN-LAST:event_b_addRoadMouseClicked

    private void b_addCrossroadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_addCrossroadMouseClicked
        // TODO add your handling code here: PLACE CROSSROAD
    }//GEN-LAST:event_b_addCrossroadMouseClicked

    private void b_addBridgeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_addBridgeMouseClicked
        // TODO add your handling code here: PLACE BRIDGE
    }//GEN-LAST:event_b_addBridgeMouseClicked
    
    private void ueberpruefung(){  //Hier werden die Variablen Straßenauslastung,Autos auf Straße, zugehörigkeit,stehende Autos überprüft und aktualisiert
    
    
        if(Auto.getAnfangStraße()==null||Straße.getAnfangAuto()==null){}
        else{
            Autoknoten aktuellAuto=Auto.getAnfangAuto();            //Definition der Variable in der Autoliste
            Straßenknoten aktuellStraße=Straße.getAnfangStraße();   //Definition der Variable in der Straßenliste
        
        
            //Zugehoerigkeit:                                                                                                    //Diese Formeln beachten noch nicht, dass die Autos nicht in der Mitte der Fahrbahn, sondern in der Mitte eines Fahrstreifen fahren.
        
            double r,s;boolean ueberpruefung=false;
            do{
                r=Math.round(((aktuellAuto.getx()-aktuellStraße.getx())/(aktuellStraße.getx2()-aktuellStraße.getx()))*100)/100; //Mit hilfe der Verktorrechnung den Wert fur r, mit den man den Richtungsvektor der Straße bestimmt.
                s=Math.round(((aktuellAuto.gety()-aktuellStraße.gety())/(aktuellStraße.gety2()-aktuellStraße.gety()))*100)/100; //Mit hilfe der Verktorrechnung den Wert fur s, mit den man den Richtungsvektor der Straße bestimmt.
                if(s==r)
                {
                    aktuellAuto.setzugehoerigkeit(aktuellStraße.getindentifikation());  //Wenn r und s gleich sind ist das Auto auf der Straße
                }
            }
            while(aktuellStraße.getNF()!=null||ueberpruefung==false);   
            ueberpruefung=false;
            aktuellStraße=Straße.getAnfangStraße();
            do{                                                                 //Hiermit wird das für jedes Auto auf jeder Straße wiederholt 
                aktuellAuto=aktuellAuto.getNF();
                    do{                                                         //Hier wird das gleiche für jede Straße gemacht.
                    aktuellStraße=aktuellStraße.getNF();
                    r=Math.round(((aktuellAuto.getx()-aktuellStraße.getx())/(aktuellStraße.getx2()-aktuellStraße.getx()))*100)/100;
                    s=Math.round(((aktuellAuto.gety()-aktuellStraße.gety())/(aktuellStraße.gety2()-aktuellStraße.gety()))*100)/100;
                    if(s==r){aktuellAuto.setzugehoerigkeit(aktuellStraße.getindentifikation());ueberpruefung=true;} 
                    }
                    while(aktuellStraße.getNF()!=null||ueberpruefung==false);   //Die Anweisung wird abgebrochen sobald es einen Traffer gibt,da nur eines möglich ist.
                ueberpruefung=false;
                aktuellStraße=Straße.getAnfangStraße();
            }
            while(aktuellAuto.getNF()!=null);
            
            
            //Stehende Autos, Autos auf Straße und Straßenauslastung:
            
            int[] zugehoerigkeit=new int[Straße.getAnzahlStraßen()];                                                                                                    ////////////Noch zu beachten: Identifikation muss bei 0 anfangen, da dies das Array auch tut
            int[] stehend=new int[Straße.getAnzahlStraßen()];               //Diese 2 Arrays sind zählen die der stehenden Autos für jede Straße(i und j)
            int i,j;
            
            aktuellAuto=Auto.getAnfangAuto();
            while(aktuellAuto.getNF()!=null){                   //die sorgt dafür, das es mit allen Autos gemacht wird
                i=aktuellAuto.getzugehoerigkeit();              //Hier wird i als die Straße des Autos definiert
                if(aktuellAuto.getkmh()==0){
                    j=aktuellAuto.getzugehoerigkeit();//Hier wird das gleiche gemacht mit den Autos, die 0kmh fahren
                    stehend[j]=stehend[j]+1;//Dies wird jetzt in den Array gespeichert
                } 
                zugehoerigkeit[i]=zugehoerigkeit[i]+1;  //""
                aktuellAuto=aktuellAuto.getNF();
            }
        
            i=aktuellAuto.getzugehoerigkeit();                              //Das gleiche nochmal, weil dies in der Schleife nicht mit inbegriffen ist.
            if(aktuellAuto.getkmh()==0){
                j=aktuellAuto.getzugehoerigkeit();
                stehend[j]=stehend[j]+1;
            }
            zugehoerigkeit[i]=zugehoerigkeit[i]+1;
            
            while(aktuellStraße.getNF()!=null){                     //Hier werden die Informationen in der Liste gespeichert
                aktuellStraße.setautos_auf_straße(zugehoerigkeit[aktuellStraße.getindentifikation()]);
                aktuellStraße.setstehende_Autos(stehend[aktuellStraße.getindentifikation()]);
                aktuellStraße.setstraßenauslastung();               //Die Straßenauslastung wird aus den Autos und der Länge der Straße ausgerechnet 
                aktuellStraße=aktuellStraße.getNF();
            }
            aktuellStraße.setautos_auf_straße(zugehoerigkeit[aktuellStraße.getindentifikation()]);   //Wurde in der Schleife nicht inbegriffen
            aktuellStraße.setstehende_Autos(stehend[aktuellStraße.getindentifikation()]);
            aktuellStraße.setstraßenauslastung();
        }   
    
    
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         *
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_addBridge;
    private javax.swing.JButton b_addCrossroad;
    private javax.swing.JButton b_addRoad;
    private javax.swing.JButton b_mapExport;
    private javax.swing.JButton b_mapImport;
    private javax.swing.JLabel l_Editor;
    private javax.swing.JLabel l_developers;
    private javax.swing.JLabel l_map;
    private javax.swing.JLabel l_title;
    private javax.swing.JPanel p_main;
    private javax.swing.JTabbedPane tp_main;
    // End of variables declaration//GEN-END:variables
    //sdhduzGGGGGGG
    @Override
    public void mouseClicked(MouseEvent me) {
        
    }
    @Override
    public void mousePressed(MouseEvent e) {
        paint = new IDraw(this.p_main.getGraphics());
        ix=e.getX();
        iy=e.getY();
        this.p_main.addMouseMotionListener(paint);
        System.out.println("Pressed");
        BufferedImage road = null;
            try {
                road = ImageIO.read( new URL("http://www.ber-ivo-ger.lima-city.de/textures/road.png"));
            } catch (IOException ex) {}
            
            this.p_main.getGraphics().drawImage(road, ix, iy, p_main);
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        this.p_main.removeMouseMotionListener(paint);
        System.out.println("Released");
    }
    @Override
    public void mouseEntered(MouseEvent me) {
        
    }
    @Override
    public void mouseExited(MouseEvent me) {
        
    }
    
    class IDraw implements MouseMotionListener {
        private Graphics panel;
        
        public IDraw (Graphics panel) {
            this.panel=panel;
        }
        
        @Override
        public void mouseDragged(MouseEvent me) {            
            panel.setColor(Color.white);
            panel.drawLine(ix, iy, ax, ay);            
            ax=me.getX();
            ay=me.getY();
            panel.setColor(Color.black);
            panel.drawLine(ix, iy, ax, ay);
            //panel.fillRect(ix-10, ix+10, iy-10, iy+10);
        }

        @Override
        public void mouseMoved(MouseEvent me) {
        }
    }
}
