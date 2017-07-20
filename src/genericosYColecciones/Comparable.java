/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericosYColecciones;

import clases.Persona;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author alejandro
 */
public class Comparable {

    public static void main(String... a) {

        Persona persona0 = new Persona(1, "AA", "ingeniero1");
        Persona persona1 = new Persona(2, "BB", "ingeniero2");
        Persona persona2 = new Persona(3, "CC", "ingeniero3");
        Persona persona3 = new Persona(4, "DD", "ingeniero4");
        Persona persona4 = new Persona(5, "ZZ", "ingeniero5");

        List<Persona> lista = new LinkedList<>();

        lista.add(persona2);
        lista.add(persona3);
        lista.add(persona0);
        lista.add(persona1);
        lista.add(persona4);
        
        System.out.printf("lista antes de ser ordenada\n");
        for (Persona persona : lista) {
            System.out.printf("id: %d nombre: %s apellido: %s\n", persona.getId(), persona.getNombre(), persona.getApellido());
        }

        Collections.sort(lista); //ordeno la lista

        //lista despues de ser ordenada
        System.out.printf("\n\nlista despues de ser ordenada\n");

        for (Persona persona : lista) {
            System.out.printf("id: %d nombre: %s apellido: %s\n", persona.getId(), persona.getNombre(), persona.getApellido());
        }

    }

}
