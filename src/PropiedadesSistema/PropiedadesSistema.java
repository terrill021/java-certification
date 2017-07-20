/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PropiedadesSistema;

import java.util.Properties;

/**
 *
 * @author alejandro
 */
public class PropiedadesSistema {
    public static void main(String ...a){
        
        Properties propiedades = System.getProperties();
        propiedades.list(System.out);
        
    }
    
}
