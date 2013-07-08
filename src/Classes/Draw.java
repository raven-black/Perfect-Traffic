/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.event.*;
import GUI.*;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Ivo
 */
public class Draw implements MouseMotionListener {
    
    public boolean exit=false;
    private int ix,iy,ax,ay;
    private String object ="";
    GUI tab =new GUI();
    //Graphics panel = tab.getMain().getGraphics();
    
    /**
     *
     */
    public void run() {
        
        switch (this.object) {
            case "road":
                while (exit==false) {
                    
                }
            case "crossroad":
                while (!exit) {
                    
                }
            case "bridge":
                while (!exit) {
                    
                }
            default:
        }
    }
    public void terminate() {
        this.exit=true;
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        ax=me.getX();
        ay=me.getY();        
        //panel.setColor(Color.black);
        //panel.drawLine(ix, iy, ax, ay);
        System.out.println("Dragged"+ax+ay);
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        
    }
    
    public String getObject() {
        return this.object;
    }
    public void setObject(String newObject) {
        this.object=newObject;
    }
    public int getiX() {
        return this.ix;
    }
    public void setiX(int newiX) {
        this.ix=newiX;
    }
    public int getiY() {
        return this.iy;
    }
    public void setiY(int newiY) {
        this.iy=newiY;
    }
}
