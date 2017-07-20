/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprimirformato;

/**
 *
 * @author alejandro
 */
public class PrintF {
    public static void main (String []s){
        
        System.out.printf("un numero entero %d y unb booleano %b .\n", 12, true);
        System.out.printf("un numero flotante %(2.1f y un String %3s .\n", -12.399, "alejandro");
        
    } 
}
