/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alejandro
 */
public class FileDirectory {

    public static void main(String args[]) {

        File directorio = new File("directorio");
        boolean es = directorio.mkdir();
        File archivo = new File(directorio, "archivo.txt");
        try {
            archivo.createNewFile();

            FileWriter fw = new FileWriter(archivo);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("welcome!! \n a la programacion en Java!");
            pw.flush();
            pw.close();

            FileReader fr = new FileReader(archivo);
            //BufferedReader br = new BufferedReader(fr);
            char c[] = new char[50];
            fr.read(c);
            System.out.print(c);
        } catch (IOException ex) {
            // ocurrio un error
            ex.printStackTrace();
        }
        

    }

}
