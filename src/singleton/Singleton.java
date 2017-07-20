
package singleton;

/**
 *
 * @author alejandro
 */
public class Singleton {
    
    private static Singleton singleton;
    private  String mensaje="ok";
    
    private Singleton(){
        
    }
    
    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }
    static Singleton getInstance(){
        if(singleton==null){
            singleton = new Singleton();
        }
       return singleton;
    }
    
    public void mensaje(){
        System.out.println(mensaje);
    }
}
