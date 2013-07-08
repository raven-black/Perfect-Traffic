/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Ivo
 */
public class Knotenpunkt {
    private Knotenpunkt NF;
    private int sx;
    private int sy;
    private int ex;
    private int ey;
    private int[] richtung;
    
    public Knotenpunkt( int sx, int sy, int ex, int ey, int[] richtung) {
        this.sx=sx;
        this.sy=sy;
        this.ex=ex;
        this.ey=ey;
        this.richtung=richtung;
    }
    
    public Knotenpunkt getNF(){
        return this.NF;
    }
    public void setNF(Knotenpunkt neuerNF){
        NF=neuerNF;
    }
    
    public int getY () {
        return this.sy;
    }
    public void setY (int Y) {
        this.sy=Y;        
    }
    
    public int getX () {
        return this.sx;
    }
    public void setX (int X) {
        this.sx=X;        
    }
    
    public int getOldX() {
        return this.ex;
    }
    public void setOldX(int newOldX) {
        this.ex=newOldX;
    }
    
    public int getOldY() {
        return this.ey;
    }
    public void setOldY(int newOldY) {
        this.ey=newOldY;
    }
}