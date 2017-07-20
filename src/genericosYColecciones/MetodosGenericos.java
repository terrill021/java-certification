/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericosYColecciones;

import java.util.Collections;

/**
 *
 * @author alejandro
 */
public class MetodosGenericos<T> {
     T value;
     public static <T> void generico(T t){
        System.out.println("metodo generico: " + t.getClass().getName());
        if(t instanceof String){
            System.out.println("es instancia de la clase String");           
            String [] o;
            o = (String []) t;
            System.out.println(java.util.Arrays.toString(o)); 
            
        }
    }
     
     public static void main (String ...a){
         generico(a);
     }
     
}
