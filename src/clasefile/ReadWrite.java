/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasefile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author alejandro
 */
public class ReadWrite {

    public static void main(String[] ab) {
        File carpeta = new File("carpeta");
        System.out.println("carpeta creada? " + carpeta.mkdir()); //creo la ruta??
        File archivo = new File(carpeta, "archivo.txt");
        try {
            // System.out.println("se creo el archivo?"+ archivo.createNewFile());
            FileWriter escritor = new FileWriter(archivo); // 1. creo una referencia de tipo FileWriter llamada
            //escritor 2. construyo un elemento FileWriter 3. creo el archivo en el disco llamado archivo.txt
            PrintWriter superEscritor = new PrintWriter(escritor);
            superEscritor.println("Hola mundo");
            superEscritor.println("Esto es java!!!");
            superEscritor.flush();
            superEscritor.close();
            
            // leer lo que esta en el archivo
            //char[] array = new char[500];
            FileReader lector = new FileReader("fileWrite1.txt");
            BufferedReader slector = new BufferedReader(lector);
            //int numCaracteres = lector.read(array); //lee todo el archivo, se le pasa un array de tipo char, devuelve el numero de bytes leidos
           // System.out.println("numero de caracteres leidos: " + numCaracteres);
            String contenido = slector.readLine();
            
            System.out.println("El contenido es: \n"+contenido);
            lector.close();
//            for (char b : array) {
//                System.out.print(b);
//            }

        } catch (IOException ex) {
            System.out.println("Sin permisos para usar esta ruta");
        }

    }
}
