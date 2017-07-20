/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericosYColecciones;

import clases.Persona;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import clases.Persona;

/**
 *
 * @author alejandro
 */
public class Comparator {
    
    public static void main(String ...a){
        
        List <Persona> lista = new ArrayList<>();
         Persona persona2 = new Persona(2, "Alters", "Software");
        Persona persona3 = new Persona(3, "MasterKey", "Proyecto");
        Persona persona = new Persona(1, "Alejandro", "Terrill");
        Persona persona4 = new Persona(4, "Obj4", "numb4");
        Persona persona5 = new Persona(5, "Obj5", "numb5");
       
        lista.add(persona5);
        lista.add(persona3);
        lista.add(persona4);        
        lista.add(persona);
        lista.add(persona2);
        
         Collections.sort(lista, new java.util.Comparator<Persona>() {

            @Override
            public int compare(Persona persona1, Persona persona2) {
                
                //ordenar ascendente
//                 if(persona1.getCedula()> persona2.getCedula()){
//                     return 1;
//                 }
//                 if(persona1.getCedula()<persona2.getCedula()){
//                     return -1;
//                 }
//                 return 0;
                
                //ordenar descendente
                
//                 if(persona1.getCedula()> persona2.getCedula()){
//                     return -1;
//                 }
//                 if(persona1.getCedula()< persona2.getCedula()){
//                     return 1;
//                 }
//                 return 0;
                
                //orden alfabetico
                //A-Za-z
                return persona1.getApellido().toLowerCase().compareTo(persona2.getApellido().toLowerCase());
                 
                //Z-Az-a
                //return persona2.getCc().compareTo(persona1.getCc());
             
            }
        });
         
        for(Persona person : lista){
            System.out.println(person.getId()+ "  "+person.getNombre()+ "  "+person.getApellido()+"\n ");
        }                
       
    }
}
