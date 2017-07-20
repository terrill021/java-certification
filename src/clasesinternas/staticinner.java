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
public class staticinner {
    
    static class estatica{
    void mensaje(){
        System.out.println("hola estatica");
    }
    }
    
    static class estaticaMain{
        
        static class inin{
         void mensaje(){
        System.out.println("hola inin");
    }}
        public static void main(String ...aa){
            estatica estatica = new estatica();
            estatica.mensaje();
            inin i = new inin();
            i.mensaje();
        }
    }
}
