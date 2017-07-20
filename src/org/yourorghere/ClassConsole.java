/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import java.io.Console;

/**
 *
 * @author alejandro
 */
public class ClassConsole {
    
    public static void main(String args[]){
        
        Console consola = System.console();
        String a = consola.readLine("usuario: ");
         char [] b = consola.readPassword("passwoord: ");
         
         System.out.println(a);
    }
    
}
