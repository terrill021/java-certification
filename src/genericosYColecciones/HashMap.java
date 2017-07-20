/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericosYColecciones;

import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author alejandro
 */
public class HashMap {

    public static void main(String... a) {

        Map<Integer, String> mapa = new java.util.LinkedHashMap<>();

        mapa.put(2, "java");
        mapa.put(3, "mapa");
        mapa.put(4, "hashmap");
        mapa.put(10, "hashmap10");
        mapa.put(1, "alejandro");
        mapa.put(1, "alejandroT");

        Iterator i = mapa.keySet().iterator();

        while (i.hasNext()) {
            int key = (int)i.next();
            System.out.printf("clave: %d valor: %s\n", key, mapa.get(key));
        }
        
//        for (String key : mapa.keySet()) {
//            System.out.printf("clave: %s valor: %s\n", key, mapa.get(key));
//        }
    }
}
