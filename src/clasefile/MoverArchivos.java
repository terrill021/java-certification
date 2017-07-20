/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasefile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.Reader;
import java.util.Scanner;

/**
 *
 * @author alejandro
 */
public class MoverArchivos {
    
    public static void main (String []args){
        String a = "";
        
       
        System.out.println(args.length);
        String args2[] = new String[10];
        args = args2;
        System.out.println(args.length);



        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la ruta completa del archivo a mover: ");
        String ruta = scanner.next();
        
        File archivo = new File(ruta);
        if(archivo.exists() && archivo.isFile()){
            System.out.println("archivo encontrado... ingrese la ruta a la que desea mover el archivo");
            ruta = scanner.next();
            File directorio = new File(ruta);
            
            if(directorio.exists() && directorio.isDirectory()){
                System.out.println("Ok el archivo se esta moviendo...");
                File oldir = new File(archivo.getParent(), archivo.getName());// es la ruta del archivo y el nombre del archivo
                File newdir = new File(directorio.getPath(), archivo.getName()); //es la ruta a la que se va a mover y se deja el mismo nombre del archivo
                
                System.out.println("Moviendo archivo \""+ archivo.getName()+"\" de: \"" + archivo.getParent()+"\" a \"" + directorio.getPath()+ "\"");
                
                oldir.renameTo(newdir);
                System.out.println("el archivo se ha movido correctamente... su nueva ruta es: \""+newdir.getAbsolutePath()+"\"");
            }else{
                 System.out.println("el directorio buscado no existe o no es un directorio valido");
            }
            
        }else{
             System.out.println("el archivo no existe o no es un archivo valido");
        }
    }
    
}
