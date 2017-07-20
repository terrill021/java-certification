/*
 * Listar los archivos en un directorio
 */
package clasefile;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author alejandro
 */

public class ListarArchivos {
    
   public static void main(String []abc){
        
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ingrese una ruta de una carpeta: ");
       String ruta = scanner.next();
       File carpeta = new File(ruta);
       if(carpeta.exists() && carpeta.isDirectory()){
          File[]files =carpeta.listFiles();
           for (File file : files) {
               System.out.println(file.getName()+ " \t es un directorio? "+ file.isDirectory() + "\t es un archivo? " +file.isFile());
           }
       }else{
           System.out.println("La ruta no existe o no es una carpeta valida ");           
       }
    }
}
