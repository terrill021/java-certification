
package genericosYColecciones;

import clases.Persona;

/**
 *
 * @author alejandro
 */
public class Stack {
    
    public static void main(String ...a) throws InterruptedException{
        
    java.util.Stack <Persona> pila = new java.util.Stack<>();
    pila.push(new Persona(1, "persona1", "ap1"));
    pila.push(new Persona(2, "persona2", "ap2"));
    pila.push(new Persona(3, "persona3", "ap3"));
    pila.push(new Persona(4, "persona4", "ap4"));
    pila.push(new Persona(5, "persona5", "ap5"));
    pila.push(new Persona(6, "persona6", "ap6"));
    
        for (Persona persona : pila) {
            System.out.println(persona);
        }
        
        System.out.println("\nbucar: "+ pila.search(new Persona(4, "", "")));
        
        while(!pila.isEmpty()){
            Thread.sleep(1000);
            System.out.println("\nAtendiendo a: " + pila.pop());
        }
    }
}
