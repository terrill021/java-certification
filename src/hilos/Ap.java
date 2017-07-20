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
class Ap {
    
    public static void main(String ...a) throws InterruptedException{
        HilosThread hilo = new HilosThread();
        Thread thread = new Thread(hilo);
        thread.setName("alejandro");
        //thread.start();
        thread.join();// se ejecuta en el hilo main y hace que el hilo main no se ejeucte hasta que el hilo "alejandro" haya terminado
       
        String hiloMain = Thread.currentThread().getName();
        System.out.println("hilo en main: "+hiloMain);
    }
}
