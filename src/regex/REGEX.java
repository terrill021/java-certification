/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author alejandro
 */
public class REGEX {
    
    public static void main(String ...a){
                        //0123456789  
        String entrada = "asd xxxx edpo edwom xxxx de´xxxx xxxx";
        java.util.regex.Pattern pattern = Pattern.compile("xxxx", Pattern.CASE_INSENSITIVE);
        
        Matcher matcher= pattern.matcher(entrada);
       
        System.out.println(matcher.groupCount());
        while(matcher.find()){
        System.out.println("posicion incial: " + matcher.start() + " posicion final: " + matcher.end());
        System.out.println("group " + matcher.group());
        }
        
        
        System.out.println();
    
}
}