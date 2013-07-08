/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Ivo
 */
public class Liste {
    private Knotenpunkt Start;
    private Knotenpunkt aktuell;
    private boolean treffer;
    private int Treffer;
    
    public Liste(){
        Start=null;
        aktuell=null;
        treffer=false;
        Treffer=0;
    }    
    public void add(Knotenpunkt neu){
        if(Start==null){
            Start=neu;
            aktuell=neu;
        }
        else{
            aktuell=Start;
            while(aktuell.getNF()!=null){
                aktuell=aktuell.getNF();
            }
            aktuell.setNF(neu);
            aktuell=aktuell.getNF();
        }
    }
    
    public Knotenpunkt getStart(){      
      return this.Start;
    }
    public void setStart(Knotenpunkt neuesstart) {
        Start=neuesstart;
    }
    
    public Knotenpunkt getaktuell(){
        return this.aktuell;
    }
    public void setaktuell(Knotenpunkt neuesaktuell){
        aktuell=neuesaktuell;
    }
    
    public int getTreffer() {
        return this.Treffer;
    }
    public void setTreffer(int neuTreffer) {
        Treffer=neuTreffer;
    }
    
    public boolean getTrefferBoolean() {
        return this.treffer;
    }
    public void setTrefferBoolean(boolean apfel) {
        this.treffer=apfel;
    }
    
    public Knotenpunkt getLetzter() {
      while (aktuell.getNF()!=null) {
            aktuell=aktuell.getNF();
        }      
      return(aktuell);
    }
    public Knotenpunkt getVG(Knotenpunkt x) {        
        aktuell=Start;
        if (aktuell!=x) {
            while (aktuell.getNF()!=x) {
            setaktuell(aktuell.getNF());
            }
        }
        return(aktuell);
    }
    
    /*public boolean checkKoords (Knotenpunkt p, int width, int height) {
        aktuell=Start;
        boolean back=true;
        int x=p.getX(), y=p.getY(), r=p.getRadius();
        while (aktuell.getNF()!=null && back) {
            int xa=aktuell.getX(), ya=aktuell.getY(), ra=aktuell.getRadius();
            if ((((x-xa)*(x-xa)+(y-ya)*(y-ya))<=((ra+r)*(ra+r))) || ((x>=width-r) && (y>=height-r))) {
                back=false;
            }
            aktuell=aktuell.getNF();
        }
        return back;
    }*/
}