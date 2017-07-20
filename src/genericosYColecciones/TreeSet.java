/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericosYColecciones;

import clases.Persona;
import clases.PersonaLinkedHashSet;
import clases.PersonaTreeSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author alejandro
 */
public class TreeSet {

    public static void main(String... a) {

        Set<PersonaTreeSet> lista = new java.util.TreeSet<>();

        lista.add(new PersonaTreeSet(4, "DD", "ingeniero4"));
        lista.add(new PersonaTreeSet(1, "AA", "ingeniero1"));
        lista.add(new PersonaTreeSet(2, "BB", "ingeniero2"));
        lista.add(new PersonaTreeSet(3, "CC", "ingeniero3"));

        for (PersonaTreeSet persona : lista) {
            System.out.printf("id: %d nombre: %s apellido: %s\n", persona.getId(), persona.getNombre(), persona.getApellido());
        }
    }

}
