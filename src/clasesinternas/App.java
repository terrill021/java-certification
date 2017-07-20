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
public class App {
    
    public static void main(String ...s){
        InnerClass innerClass = new InnerClass();
        InnerClass.Inner in = innerClass.new Inner();
        
        InnerClass.Inner inner = new InnerClass().new Inner();
//        in.mensaje();
//        inner.mensaje();
        
        
        InnerClass inj  = new InnerClass(){};
        //inj.new Inner.mensaje();
        
        anonimas a = new anonimas(){
            
            @Override
            public void mensaje(){
                System.out.println("he socbrescrito el mensaje");
            }
        
            public void mensaje2(){
                System.out.println("mensaje 2");  
            }
        };
        
        //a.mensaje();
      
        Interface inter = new Interface() {
            @Override
            public void mensaje() {
                System.out.println("hola meundo");            }
            
            void mensaje2(){
                
            }
        };
        
        inter.mensaje();
       
    }
}
