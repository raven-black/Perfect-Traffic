package classes;
/**
 * @author Remo
 */
public class Straßenknoten {
    
    private Straßenknoten NF;            //zeigt Nachfolger in einer Liste
    public void setNF(Straßenknoten a){
        this.NF = a; 
    }
    public Straßenknoten getNF(){
        return this.NF;
    }
    
    private int indentifikation;        //Identifikationsnummer für jedes Objekt?
    public void setindentifikation(int nummer){
        this.indentifikation = nummer; 
    }
    public int getindentifikation(){
        return this.indentifikation;
    }
    
    private double straßenauslastung;  //Länge der Straße durch Autos
    public double getstraßenauslastung(){
        return this.straßenauslastung;
    }
    public void setstraßenauslastung(){
         this.straßenauslastung=(Math.pow((this.x2-this.x),2)+Math.pow((this.y2-this.y),2))/this.autos_auf_straße;//Länge der Straße mit Hilfe des Satz des Pythagoras ausgerechnet
    }
    
    private int autos_auf_straße;      //Anzahl der Autos,die auf einer Straße fahren(wird jedes Mal neuausgerechnet), ist ein Zwischenwert mit dem weitergerechnet wird(Straßenauslastung und routensuche)
    public int getautos_auf_straße(){
        return this.autos_auf_straße;
    }
    public void setautos_auf_straße(int menge){
        this.autos_auf_straße=menge;
    }
    
    private int stehende_Autos;         //Stehende Autos auf einer Straße(an einer Kreuzung)
    public int getstehende_Autos(){
        return this.stehende_Autos;
    }
    public void setstehende_Autos(int menge){
        this.stehende_Autos=menge;
    }
    
    private double x;                   //Die x-Koordinate des Objektes(Bei Kreuzungen mit y-Koordinate ein Eckpunkt)(Anfang der Straße)
    public double getx(){
        return this.x;
    }
    public void setx(double xKoordinate){
        this.x=xKoordinate;
    }
    
    private double y;                   //Die y-Koordinate des Objektes(Bei Kreuzungen mit x-Koordinate ein Eckpunkt)(Anfang der Straße)
    public double gety(){
        return this.y;
    }
    public void sety(double yKoordinate){
        this.y=yKoordinate;
    }
    
     private double x2;                  //Die x-Koordinate des Objektes(Bei Kreuzungen mit y-Koordinate der gegenüberliegende Eckpunkt)(Ende der Straße)
    public double getx2(){
        return this.x2;
    }
    public void setx2(double x2Koordinate){
        this.x2=x2Koordinate;
    }
    
    private double y2;                  //Die y-Koordinate des Objektes(Bei Kreuzungen mit x-Koordinate der gegenüberliegende Eckpunkt)(Ende der Straße)
    public double gety2(){
        return this.y2;
    }
    public void sety2(double y2Koordinate){
        this.y2=y2Koordinate;
    }
    
    private double breite;              //Straßenbreite(immer 2 Spurig)
    public double getbreite(){
        return this.breite;
    }
    public void setbreite(){
        this.breite=6;
    }
    
}
