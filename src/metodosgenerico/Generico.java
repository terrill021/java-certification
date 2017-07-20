/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosgenerico;

/**
 *
 * @author alejandro
 */
public class Generico <T> {
    
    T object;
    
    public T getObject (){
       return object; 
    }
    
    public void setObject (T t){
        this.object = t;
    }
    
    public <R> void go(R r){
        
    }
    
    public void verTipo(){
        
        System.out.println(object.getClass().getName());
    }
    
}
