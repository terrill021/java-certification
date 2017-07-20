/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author alejandro
 */
public class Probarconcurrencia {

    public static void main(String[] GF) {

        Concurrencia.ManejoCuenta prueba = new Concurrencia().new ManejoCuenta();
        
        Thread hilo1 = new Thread(prueba);
        Thread hilo2 = new Thread(prueba);
        hilo1.setName("alejandro");
        hilo2.setName("otro");
        
        hilo1.start();
        hilo2.start();
    }
}
