/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericosYColecciones;

import clases.Persona;
import clases.PersonaLinkedHashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author alejandro
 */
public class LinkedHashSet {

    public static void main(String... a) {

        //linkedHashSet ordena segun el orden de agreagacion a la lista
        Set<PersonaLinkedHashSet> lista = new java.util.LinkedHashSet<>();

        lista.add(new PersonaLinkedHashSet(4, "DD", "ingeniero4"));
        lista.add(new PersonaLinkedHashSet(1, "AA", "ingeniero1"));
        lista.add(new PersonaLinkedHashSet(2, "BB", "ingeniero2"));
        lista.add(new PersonaLinkedHashSet(3, "CC", "ingeniero3"));
        lista.add(new PersonaLinkedHashSet(3, "CC", "ingeniero3"));

        for (PersonaLinkedHashSet persona : lista) {
            System.out.printf("id: %d nombre: %s apellido: %s\n", persona.getId(), persona.getNombre(), persona.getApellido());
        }
    }

}
