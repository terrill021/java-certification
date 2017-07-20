/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericosYColecciones;

import clases.Persona;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author alejandro
 */
public class Deque1 {
    
    public static void main(String ...d){
        
        Deque <Persona>deque = new ArrayDeque();
        
        deque.add(new Persona(1, "persona1", "ap1"));
        deque.push(new Persona(2, "persona2", "ap2"));
        
        deque.addFirst(new Persona(3, "persona3", "ap3"));
        deque.addLast(new Persona(4, "persona4", "ap4"));
        
        for (Persona deque1 : deque) {
            System.out.println(deque1);
            
        }
        
        
    }
}
