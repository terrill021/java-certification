/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericosYColecciones;

import clases.Persona;
import clases.PersonaExtend;
import clases.PersonaN;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import javax.swing.JButton;

/**
 *
 * @author alejandro
 */
public class ArrayLista {
    
    public static void main (String ...q){
        
        List <PersonaN> listaP = new ArrayList<>();
        
        listaP.add(new PersonaN(3, "persona3", "ap3"));
        listaP.add(new PersonaN(4, "persona4", "ap4")); 
        listaP.add(new PersonaN(1, "persona1", "ap1"));
        listaP.add(new PersonaN(2, "persona2", "ap2"));
        
        
        System.out.println("\nantes de ordenar la lista");

        //antes de ordenar el arraylist
        for(PersonaN p : listaP){
            System.out.println(p.toString());
        }
       
        // usar interfaz comparable o comparator
        Collections.sort(listaP, new java.util.Comparator<PersonaN>() {

            // si el entero es positivo quiere decir que el objeto 1 es despues del segundo en el orden en la lista
            // si el entero es negativo quiere decir que este objeto es de menor orden en la lista
            // si el entero es 0 quiere decir que este objeto es igual al otro
            @Override
            public int compare(PersonaN persona1, PersonaN persona2) {
                // ordenar de mayor a menor
                return persona1.getId() - persona2.getId();
            }
        }); // ordena la lista
        
        
        System.out.println("\nDespues de ordenar la lista");
        //despues de ordenar el array list
        for(PersonaN p : listaP){
            System.out.println(p.toString());
        }
        
       // Collections.binarySearch(listaP, new PersonaN(1, "alejandro", "terrill"));
        
        List<?> lista = new ArrayList<PersonaExtend>();
                
    }
}
