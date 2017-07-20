/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author alejandro
 */
public class SobreEscrituraMetodos {
    
    public void metodo0(){
        
    }   
    static void metodo1(){
        
    }   
   final void metodo2(){
        
    }   
   protected void metodo3(){
        
    }   
    private void metodo4(){
        
    }   
    
    
}

class PruebaSobrecritura extends SobreEscrituraMetodos{
    
    @Override
    public void metodo0(){
        metodo2();
        
    }
    
   
    
    @Override
    public void metodo3(){
        
    }
    
   
    
}
