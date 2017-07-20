/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import tokenizer.UsoScanner;


/**
 *
 * @author alejandro
 */
public class App {
    
   public static void main(String ...a){
       Singleton s;
       s = Singleton.getInstance();
       s.mensaje();
       s.setMensaje("mensaje modificado");
       
       Singleton.getInstance().mensaje();
       
       
   }
}
