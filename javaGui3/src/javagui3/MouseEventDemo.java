/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui3;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author ajid
 */
public class MouseEventDemo extends Frame implements MouseListener,MouseMotionListener{
    
    TextField tf;
    public MouseEventDemo(String title){
     super(title);
     
     tf=new TextField(60);
     addMouseListener(this);
    }
    
    public void launchFrame(){
      
       add(tf, BorderLayout.SOUTH);
       setSize(300,300);
       setVisible(true);
    }
    
    public static void main(String[] args){
        
        MouseEventDemo me= new MouseEventDemo("Close Window Example");
        me.launchFrame();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
      //To change body of generated methods, choose Tools | Templates.
      String msg = "Mouse Cliked";
      tf.setText(msg);
    }

    @Override
    public void mousePressed(MouseEvent e) {
      //To change body of generated methods, choose Tools | Templates.
      String msg = "Mouse Pressed";
      tf.setText(msg);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    //To change body of generated methods, choose Tools | Templates.
     String msg = "Mouse Released";
     tf.setText(msg);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    //To change body of generated methods, choose Tools | Templates.
     String msg = "Mouse Entered";
      tf.setText(msg);
    }

    @Override
    public void mouseExited(MouseEvent e) {
     //To change body of generated methods, choose Tools | Templates.
      String msg = "Mouse Exited";
      tf.setText(msg);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    //To change body of generated methods, choose Tools | Templates.
    String msg = "Mouse Dragged at " + e.getX() + "," + e.getY();
    tf.setText(msg);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    //To change body of generated methods, choose Tools | Templates.
    
    String msg = "Mouse Moved";
      tf.setText(msg);
    }
    
}
