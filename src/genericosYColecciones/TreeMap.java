/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericosYColecciones;

import clases.PersonaTreeSet;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author alejandro
 */
public class TreeMap {
    
    public static void main(String... a) {

        Map<PersonaTreeSet, String> mapa = new java.util.TreeMap<>();

        mapa.put(new PersonaTreeSet(3, "alejandro3", "terrill3"), "java3");
        mapa.put(new PersonaTreeSet(4, "alejandro4", "terrill4"), "java4");
        mapa.put(new PersonaTreeSet(1, "alejandro1", "terrill1"), "java1");
        mapa.put(new PersonaTreeSet(2, "alejandro2", "terrill2"), "java2");
       
       

        Iterator i = mapa.keySet().iterator();

        while (i.hasNext()) {
            PersonaTreeSet key = (PersonaTreeSet)i.next();
            System.out.println("clave: "+ key + "Valor: " + mapa.get(key));
        }
        
//        for (String key : mapa.keySet()) {
//            System.out.printf("clave: %s valor: %s\n", key, mapa.get(key));
//        }
    }
     
}
