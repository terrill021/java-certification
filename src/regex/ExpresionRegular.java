/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author alejandro
 */
public class ExpresionRegular {
    
    public static void main(String ...a){
        String []arreglo=null;
        
        Pattern pattern = Pattern.compile(";");
        long ini = System.currentTimeMillis(); 
        for(int i =0; i<1000; i++){
        arreglo = pattern.split("alejandro;terrill;duarte");
        }
        
        for (String a1 : arreglo) {
            System.out.println(a1+"-");
        }
        long fin = System.currentTimeMillis();   
        
        System.out.println(fin-ini);
        
        ////////////////////////////////////////////////////
        System.out.println("");
        long ini2 = System.currentTimeMillis(); 
        for(int i =0; i<1000; i++){
        arreglo = "alejandro;terrill;duarte".split(";");
        }
        
        for (String a1 : arreglo) {
            System.out.println(a1+"-");
        }
        long fin2 = System.currentTimeMillis();   
        
        System.out.println(fin2-ini2);
        

    }
}
