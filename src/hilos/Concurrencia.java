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
public class Concurrencia {

    class Cuenta {
        private float saldo;

        public Cuenta() {
            saldo = 50f;
        }

        public synchronized void retirar() {
            if (getSaldo() > 0) {
                saldo = -5;
                System.out.println("Retiro exitoso- saldo = " +getSaldo());
            } else {
                System.out.println("sin sufucientes fondos");
            }
        }
        public float getSaldo() {
            return saldo;
        }

    }

    class ManejoCuenta implements Runnable {

        Cuenta cuenta = new Cuenta();

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " esta haciendo un retiro");
                cuenta.retirar();
            }
        }
    }
    
  
    
 

}
