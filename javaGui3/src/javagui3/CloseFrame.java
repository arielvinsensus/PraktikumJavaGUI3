/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui3;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author ajid
 */
public class CloseFrame extends Frame implements WindowListener{
    
    Label label;
    
    public CloseFrame(String title){
     super(title);
     label = new Label("Close The frame");
     this.addWindowListener(this);
    }
    
    public void LaunchFrame(){
      setSize(300,300);
      setVisible(true);
    }
    
    public static void min(String[] args){
    
        CloseFrame cf= new CloseFrame("Close Window Example");
        cf.LaunchFrame();
        
    }
    

    @Override
    public void windowOpened(WindowEvent e) {
    //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
    //To change body of generated methods, choose Tools | Templates.
     setVisible(false);
     System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
    //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
    //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
    //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
     //To change body of generated methods, choose Tools | Templates.
    }
    
}
