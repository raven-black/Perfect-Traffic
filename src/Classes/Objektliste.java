package classes;
/**
 * @author Remo
 */
public class Objektliste {
    
    private Autoknoten Autoanfang;
    private Straßenknoten Straßenanfang;
    
    
    public void setAnfangAuto(Autoknoten neu){
        this.Autoanfang = neu;
    }
    public Autoknoten getAnfangAuto (){
        return this.Autoanfang;
    }
    
    public void addAuto(Autoknoten neu){
        if(Autoanfang==null){
            setAnfangAuto(neu);
        }
        else{
            Autoknoten aktuell=Autoanfang;
            while(aktuell.getNF()!=null)
            {
                aktuell=aktuell.getNF(); 
            }
            aktuell.setNF(neu);
        }
    }
    
    public void setAnfangStraße(Straßenknoten neu){
        this.Straßenanfang = neu;
    }
    public Straßenknoten getAnfangStraße (){
        return this.Straßenanfang;
    }
    
    public void addStraße(Straßenknoten neu){
        if(Straßenanfang==null){
            setAnfangStraße(neu);
        }
        else{
            Straßenknoten aktuell=Straßenanfang;
            while(aktuell.getNF()!=null)
            {
                aktuell=aktuell.getNF(); 
            }
            aktuell.setNF(neu);
        }
    }
    
    public void delAuto(Autoknoten alt){
        if(alt.getNF()==null){
            if(alt==Autoanfang){Autoanfang=null;}
            else{
                Autoknoten aktuell=Autoanfang;
                while(aktuell.getNF()!=alt){aktuell=aktuell.getNF();}
                aktuell.setNF(null);
            }
        }
        else{
            if(alt==Autoanfang){Autoanfang=alt.getNF();}
            else{
                Autoknoten aktuell=Autoanfang;
                while(aktuell.getNF()!=alt){aktuell=aktuell.getNF();}
                aktuell.setNF(alt.getNF());
            }
        }
    }
        
    public void delStraßen(Straßenknoten alt){
        if(alt.getNF()==null){
            if(alt==Straßenanfang){Straßenanfang=null;}
            else{
                Straßenknoten aktuell=Straßenanfang;
                while(aktuell.getNF()!=alt){aktuell=aktuell.getNF();}
                aktuell.setNF(null);
            }
        }
        else{
            if(alt==Straßenanfang){Straßenanfang=alt.getNF();}
            else{
                Straßenknoten aktuell=Straßenanfang;
                while(aktuell.getNF()!=alt){aktuell=aktuell.getNF();}
                aktuell.setNF(alt.getNF());
            }
        }
    }
    
    public Straßenknoten getLetzterStraße(){
        Straßenknoten aktuell=Straßenanfang;
        while(aktuell.getNF()!=null){
            aktuell=aktuell.getNF();
        }
        return(aktuell);
    }
    
    public Autoknoten getLetzterAuto(){
        Autoknoten aktuell=Autoanfang;
        while(aktuell.getNF()!=null){
            aktuell=aktuell.getNF();
        }
        return(aktuell);
    }
    
    public int getAnzahlStraßen(){
        Straßenknoten aktuell=Straßenanfang;
        int i=1;
        while(aktuell.getNF()!=null){
            aktuell=aktuell.getNF();
            i++;
        }
        return(i);
    }
    
    public int getAnzahlAutos(){
        Autoknoten aktuell=Autoanfang;
        int i=1;
        while(aktuell.getNF()!=null){
            aktuell=aktuell.getNF();
            i++;
        }
        return(i);
    }
    
    
        
}
