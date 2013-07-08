package classes;
/**
 * @author Remo
 */
public class Autoknoten {
    
    private Autoknoten NF;            //zeigt Nachfolger in einer Liste
    public void setNF(Autoknoten a){
        this.NF = a; 
    }
    public Autoknoten getNF(){
        return this.NF;
    }
    
    private int zugehoerigkeit;         //Welches Auto fährt auf welcher Straße?
    public int getzugehoerigkeit(){
        return this.zugehoerigkeit;
    }
    public void setzugehoerigkeit(int indentifikation){
        this.zugehoerigkeit=indentifikation;
    }
    
    private double kmh;                 //Geschwindigkeit des Autos
    public double getkmh(){
        return this.kmh;
    }
    public void setkmh(double geschwindigkeit){
        this.kmh=geschwindigkeit;
    }
    
    private double xziel;               //Mit y-Koordinate der Punkt des Zieles(auf die nächstliegende Straße umgerechnet)
    public double getxziel(){
        return this.xziel;
    }
    public void setxziel(double xKoordinate){
        this.xziel=xKoordinate;
    }
        
    private double yziel;               //Mit x-Koordinate der Punkt des Zieles(auf die nächstliegende Straße umgerechnet)
    public double getyziel(){
        return this.yziel;
    }
    public void setyziel(double yKoordinate){
        this.yziel=yKoordinate;
    }
    
    private String naechste_strasse;    //nächste Straße links rechts oder geradeaus(wird jedes mal ne zusammen gerechnet)
    public String getnaechste_strasse(){
        return this.naechste_strasse;
    }
    public void setnaechste_strasse(String naechste_richtung){
        this.naechste_strasse=naechste_richtung;
    }
    
    private double xrichtung;           //Ergibt zusammen mit der y-Richtung den Vektor in der das Auto fährt
    public double getxrichtung(){
        return this.xrichtung;
    }
    public void setxrichtung(double xvektor){
        this.xrichtung=xvektor;
    }
    
    private double yrichtung;           //Ergibt zusammen mit der x-Richtung den Vektor in der das Auto fährt
    public double getyrichtung(){
        return this.yrichtung;
    }
    public void setyrichtung(double yvektor){
        this.yrichtung=yvektor;
    }
    
    private double beschleunigung;      //Die Beschleunigung des Autos mit der es anfärht/beschleunigt(größer 1) oder abbremst(dann kleiner 1)
    public double getbeschleunigung(){
        return this.beschleunigung;
    }
    public void setbeschleunigung(double wert){
        this.beschleunigung=wert;
    }
    
    private double laenge;              //Autolänge(vorerst festgelegt)
    public double getlaenge(){
        return this.laenge;
    }
    public void setlaenge(){
        this.laenge=4;
    }
    
    private double x;                   //Die x-Koordinate des Objektes(Bei Kreuzungen mit y-Koordinate ein Eckpunkt)(geht vom Mittelpunkt des Autos aus)
    public double getx(){
        return this.x;
    }
    public void setx(double xKoordinate){
        this.x=xKoordinate;
    }
    
    private double y;                   //Die y-Koordinate des Objektes(Bei Kreuzungen mit x-Koordinate ein Eckpunkt)(geht vom Mittelpunkt des Autos aus)
    public double gety(){
        return this.y;
    }
    public void sety(double yKoordinate){
        this.y=yKoordinate;
    }
    
    private double breite;              //Autobreite(vorerst festgelegt)
    public double getbreite(){
        return this.breite;
    }
    public void setbreite(){
        this.breite=2;
    }
    
}
