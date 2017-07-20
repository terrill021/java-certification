/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesinternas;

/**
 *
 * @author alejandro
 */
public class InnerClass {
    
    private String mensaje = "hola mundo";
        
    public class Inner{
        void mensaje(){
            System.out.println("hola metodo de inner class: " + mensaje);
        }        
    }
    
    void clase(){
       final String metodo="hola metodo clase";
        
       class metodo{
            String msjMetodo = metodo+ "hola clase metodo" + mensaje;
            
        }
    }
    
}
