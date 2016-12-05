/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movimientos;

import Metodos.*;
import componentes.*;
/**
 *
 * @author Alejandro
 */
public class Carro implements Runnable {
    carros car;
    public Carro(carros car){
      this.car = car;
    }
    @Override
    public void run() {
        while (true) {
        car.x += car.vx;
        car.y += car.vy;
        try{
            Thread.sleep(100);
        }catch (Exception ex) {
                
            }
        }
        
    }
    
}
