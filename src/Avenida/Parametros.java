/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Avenida;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Alejandro
 */
public class Parametros extends JDialog implements ActionListener{
    
    JButton Prestar;
    Container Contenido;
    JTextField Nombre,Cliente;
    JLabel Nom,Clien;
    JComboBox TiBus;
    String[] Bus = {"Nombre","IDLibro"};
    //////////////////////////////////7
    public Parametros(){
    this.setTitle("Prestamos");
    this.setSize(300,200);
    this.setLocation(400, 100);
    this.setLayout(null);
    this.setResizable(false);
    Contenedor();
    
    }
    private void Contenedor() {
        Contenido = getContentPane();
        Contenido.setLayout(null);
        //////////////////////////////////77
        Clien = new JLabel("ID Del Cliente:");
        Clien.setVisible(true);
        Clien.setLocation(18,60);
        Clien.setSize(150,25);
        Contenido.add(Clien);
        ////////////////////////////////////
        Prestar = new JButton("Prestar");
        Prestar.setVisible(true);
        Prestar.setLocation(100, 140);
        Prestar.setSize(100,30);
        Prestar.addActionListener(this);
        Contenido.add(Prestar);
        //////////////////////////
        TiBus = new JComboBox(Bus);
        TiBus.setSelectedIndex(0);
        TiBus.setVisible(true);
        TiBus.setLocation(170,40 );
        TiBus.setSize(100,20);
        Contenido.add(TiBus);
        //////////////////////////////////77
        Nom = new JLabel("Nombre O ID Del Libro:");
        Nom.setVisible(true);
        Nom.setLocation(18,18);
        Nom.setSize(200,25);
        Contenido.add(Nom);
        /////////////////////////////////
        Nombre = new JTextField();
        Nombre.setVisible(true);
        Nombre.setLocation(18, 37);
        Nombre.setSize(150,25);
        Contenido.add(Nombre);
        /////////////////////////////////
        Cliente = new JTextField();
        Cliente.setVisible(true);
        Cliente.setLocation(18,87);
        Cliente.setSize(150,25);
        Contenido.add(Cliente);
        
    }
    
    public void Predetermindado(){
    Nombre.setText(null);
    Cliente.setText(null);
    TiBus.setSelectedIndex(0);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       
        }
   }