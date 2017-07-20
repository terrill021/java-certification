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
public class HilosThread implements Runnable {
    
    public void run() {
        System.out.println("hola soy un hilo");
        System.out.println("nombre del hilo: "+Thread.currentThread().getName());
    }
}


