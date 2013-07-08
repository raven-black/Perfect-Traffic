package GUI;

import classes.Autoknoten;
import classes.Objektliste;
import classes.Straßenknoten;

public class GUI extends javax.swing.JFrame {
private Objektliste Auto;
private Objektliste Straße;
    public GUI() {
        initComponents();
    }

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}