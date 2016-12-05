/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Avenida;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;

/**
 *
 * @author Alejandro
 */
public class simulacion extends JFrame implements KeyListener {
    Image bg = Toolkit.getDefaultToolkit().getImage("src/Imagenes/mapa.jpg");
   
    public boolean inicio = false;
    private int Ancho=660;
    private int Largo = 385;
   
  
    
    public simulacion(){
        super("Simulacion");
        this.setDefaultCloseOperation(3);
        this.setSize(Ancho,Largo);
        this.setLocation(450,120);
        this.setVisible(true);
        this.setResizable(false);
        
        this.createBufferStrategy(2);
        this.addKeyListener(this);
        
        Componentes();
       
        
    }
    private void Componentes() {
        
        while (true) {
            Pantalla();
            
        }
       
       
    }    
     private void Pantalla() {
        
        BufferStrategy bf = this.getBufferStrategy();
        Graphics g = null;
       
        try {
            g = bf.getDrawGraphics();
            g.drawImage(bg, 0,0,this);
            
           
        } finally {
           g.dispose();
        }
        bf.show();
             
        Toolkit.getDefaultToolkit().sync();
    }
     private void DibujoLogo(Graphics g){
           
   }
    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            inicio = true;
        }
       
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
      public static void main(String[] args) {
        new simulacion();
    }

    
}
