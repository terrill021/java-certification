/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author alejandro
 */
public class NewClass {

    public static void main(String[] args) {
        System.out.println("el tamaño de string args es: " + args.length);

        String cad;
        cad = (false) ? "se hizo true" : "se hizo false";
        System.out.println(cad);

        // Operadores a nivel de bit pero usados para evaluar operaciones booleanas (si viene en el examen)
        //el | evalua las dos expresiones si o si
        int z = 5;
        if (++z > 5 | ++z > 6) {
            z++; // z = 8 after this code
        }
        System.out.println("es igual a: " + z);

        z = 5;
        if (++z > 5 || ++z > 6) {
            z++; // z = 7 after this code
        }
        System.out.println("es igual a: " + z);

        boolean isTrue = true;
        outer:
        for (int i = 0; i < 5; i++) {
            while (isTrue) {
                System.out.println("Hello");
                break outer; // Sale del outer y continua la
// siguiente linea System.out.println("Good-Bye");
            } // end of inner while loop
            System.out.println("Outer loop."); // Won't print
        } // end of outer for loop
        System.out.println("Good-Bye");
        
        z=12;
        assert (z<0):"z";
        
       String []x = new String[3];
       System.out.println(x.length);

    }

}
