/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericosYColecciones;

import clases.Persona;
import clases.PersonaTreeSet;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author alejandro
 */
public class PriorityQueue1 {

    public static void main(String... a) throws InterruptedException {

        Queue<PersonaTreeSet> fila = new PriorityQueue<>();
        
        fila.offer(new PersonaTreeSet(4, "persona4", "ap4"));
        fila.offer(new PersonaTreeSet(2, "persona2", "ap2"));
        fila.offer(new PersonaTreeSet(3, "persona3", "ap3"));
        fila.offer(new PersonaTreeSet(1, "persona1", "ap1"));
        fila.offer(new PersonaTreeSet(7, "persona7", "ap7"));
        fila.offer(new PersonaTreeSet(6, "persona6", "ap6"));
        fila.offer(new PersonaTreeSet(5, "persona5", "ap5"));

//        for (PersonaTreeSet persona : fila) {
//            System.out.println(persona);
//        }
        
        while(!fila.isEmpty()){
        System.out.println("atendiendo a : "+ fila.peek()+"...");
        Thread.sleep(2000);
        System.out.println("usuario: "+ fila.poll()+"atendido \n");
        

        }
    }
}
