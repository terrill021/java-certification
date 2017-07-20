/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosgenerico;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author alejandro
 */
public class App {
    
    public static void main(String []d){
        
        List <Integer>lista = new Vector<>();
        lista.add(23);
        lista.add(24);
        lista.add(25);
        lista.add(26);
        System.out.println("lista de numeros");
        recorrerLista(lista);

        List <String> listaString = new ArrayList<>();
        listaString.add("AA");
        listaString.add("BB");
        listaString.add("CC");
        listaString.add("DD");
        System.out.println("\nLista String");
        recorrerLista(listaString);
        
        List <Generico> generico = new ArrayList<>();
        generico.add(new Generico());
        generico.add(new Generico());
        generico.add(new Generico());
        System.out.println("\nlista generico");
        recorrerLista(generico);

        
    }
    
    static void recorrerLista(List<? extends Object> lista){
        for(Object o:lista){
            System.out.println(o);
        }
    }
    
    
}
