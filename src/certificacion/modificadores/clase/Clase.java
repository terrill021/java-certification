/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certificacion.modificadores.clase;

/**
 *
 * @author alejandro
 */
public class Clase {

    final static public int a = 1;
    public int publica;
    private int privada;
    protected int protegida;
    int defecto;

     Clase(){
        
    }
     static  final  strictfp public void modificadoresDeMetodos() {
        int a;
    }
    
    public void setProtegida(int pro){
        this.protegida = pro;
    }
    
    
}

//class Acceso {
//
//    Clase s = new Clase();
//   
//    void provar() {
//        s.publica = 0;
//        s.protegida=0;
//        s.defecto = 0;
//        
//    }
//}
