/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericosYColecciones;

import clases.PersonaLinkedHashSet;
import clases.PersonaTreeSet;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author alejandro
 */
public class LinkedHashMap {
    
    public static void main(String... a) throws InterruptedException {

        Map<PersonaLinkedHashSet, String> mapa = new java.util.LinkedHashMap<>();

        mapa.put(new PersonaLinkedHashSet(3, "alejandro3", "terrill3"), "java3");
        mapa.put(new PersonaLinkedHashSet(4, "alejandro4", "terrill4"), "java4");
        mapa.put(new PersonaLinkedHashSet(1, "alejandro1", "terrill1"), "java1");
        mapa.put(new PersonaLinkedHashSet(2, "alejandro2", "terrill2"), "java2");
        mapa.put(new PersonaLinkedHashSet(2, "alejandro2", "terrill2"), "java2 corregido");
       
       

        Iterator i = mapa.keySet().iterator();

        while (i.hasNext()) {
            PersonaLinkedHashSet key = (PersonaLinkedHashSet)i.next();
            System.out.println("clave: "+ key + "Valor: " + mapa.get(key));
            Thread.sleep(1000);
        }
        
//        for (String key : mapa.keySet()) {
//            System.out.printf("clave: %s valor: %s\n", key, mapa.get(key));
//        }
    }
}
