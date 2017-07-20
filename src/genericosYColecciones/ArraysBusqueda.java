/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericosYColecciones;

import java.util.Arrays;
/**
 *
 * @author alejandro
 */
public class ArraysBusqueda {
    
    public static void main(String ...as){
        
        String []array = new String[]{ "CC", "DD", "FF", "AA"};
        Arrays.sort(array);
        for (String value : array) {
            System.out.println("Array ordenado:"+ value);
        }
        
        int index =  Arrays.binarySearch(array, "BB");
        
        System.out.println("index: "+ index);        
    }
}
