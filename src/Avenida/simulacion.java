/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Avenida;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;
import componentes.*;
import Movimientos.*;
import java.awt.Container;
import java.awt.Menu;
import java.awt.MenuBar;
import javax.swing.*;

/**
 *
 * @author Alejandro
 */
public class simulacion extends JFrame implements KeyListener {

    Image bg = Toolkit.getDefaultToolkit().getImage("src/Imagenes/mapa.jpg");
    Parametros Pr = new Parametros();
    public boolean inicio = false;
    private int Ancho = 660;
    private int Largo = 385;
    semaforos sm1;
    semaforos sm2;
    semaforos sm3;
    carros carro;
    Carro carmv1;
   

    public simulacion() {
        super("Simulacion");
        this.setDefaultCloseOperation(3);
        this.setSize(Ancho, Largo);
        this.setLocation(450, 120);
        this.setVisible(true);
        this.setResizable(false);
        this.createBufferStrategy(2);
        this.addKeyListener(this);

        Componentes();

    }

    public void programaEventos() {

    }

    private void Componentes() {
        sm2 = new semaforos(318, 244);
        sm1 = new semaforos(300, 255);
        sm3 = new semaforos(318, 190);
        carro = new carros(290, 240, 1, 0);
        carmv1 = new Carro(carro);
        Thread hcar1 = new Thread(carmv1);
        hcar1.start();
        while (true) {
            Pantalla();

        }
        

    }

    private void Pantalla() {

        BufferStrategy bf = this.getBufferStrategy();
        Graphics g = null;

        try {
            g = bf.getDrawGraphics();
            g.drawImage(bg, 0, 0, this);

            semaforo2(g);
            semaforo1(g);
            semaforo3(g);
            carro1(g);
        } finally {
            g.dispose();
        }
        bf.show();

        Toolkit.getDefaultToolkit().sync();
    }

    private void semaforo2(Graphics g) {
        g.setColor(Color.yellow);
        g.fillRect(sm2.y, sm2.ancho, 15, 40);
    }

    private void semaforo1(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(sm1.y, sm1.ancho, 15, 30);
    }

    private void semaforo3(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(sm3.y, sm3.ancho, 15, 40);

    }

    private void carro1(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(carro.x, carro.y, 20, 20);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                Pr.setVisible(true);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public static void main(String[] args) {
        new simulacion();
    }

}
