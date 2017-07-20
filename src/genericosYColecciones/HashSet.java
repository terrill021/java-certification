/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericosYColecciones;

import clases.Persona;
import java.util.Set;

/**
 *
 * @author alejandro
 */
public class HashSet {
    
    public static void main (String ...as){
        
        Set <Persona>lista = new java.util.TreeSet<>();
        lista.add(new Persona(1, "alejandro", "terrill"));
        lista.add(new Persona(4, "alejandro", "terrill"));
        lista.add(new Persona(2, "java", "world"));
        lista.add(new Persona(6, "java", "world"));
        lista.add(new Persona(3, "set", "HashSet"));
        lista.add(new Persona(9, "set", "HashSet"));
        lista.add(new Persona(9, "set", "HashSet"));
        lista.add(new Persona(2, "alejandro", "terrill"));
        
        
        for (Persona persona : lista) {
            System.out.println(persona.getId()+"-"+persona.getNombre()+"-"+persona.getApellido());
        }
    }
}
