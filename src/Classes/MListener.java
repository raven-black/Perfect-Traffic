/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.event.*;
import GUI.*;

/**
 *
 * @author Ivo
 */
public class MListener implements MouseListener {
    
    private boolean running=false;
    private String object;
    
    
    @Override
    public void mousePressed(MouseEvent e) {
        Draw paint = new Draw();
        paint.setiX(e.getX());
        paint.setiY(e.getY());
        paint.setObject(this.object);
        GUI tab =new GUI();
        //tab.getMain().addMouseMotionListener(paint);
        System.out.println("Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
               
    }
    
    public String getObject() {
        return this.object;
    }
    public void setObject(String newObject) {
        this.object=newObject;
    }
}
