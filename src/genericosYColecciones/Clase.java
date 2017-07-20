/*
 *genenricos
 */
package genericosYColecciones;

import java.io.IOException;
import java.util.Date;

/**
 *
 * @author alejandro
 */
public class Clase<T> {
   
    private T objeto;
    
    public Clase (T objeto){        
        this.objeto = objeto;
    }
    
    public void imprimirTipo(){
        System.out.println("T es de tipo: "+ this.objeto.getClass().getName());
    }
    
    public static void main(String ...a) throws IOException{
        
        Clase objeto = new Clase(new Date());
        objeto.imprimirTipo();
        
    }
}
