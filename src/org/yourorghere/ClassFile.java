/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alejandro
 */
public class ClassFile {

    static char[] c = new char[80];

    public static void main(String[] args) {
        File file = new File("File");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("alejandro terrrill duarte \n Universidad de Cartagena \n Facultad de Ingenieria");
            fileWriter.flush();
            fileWriter.close();
            
            

            FileReader fileReader = new FileReader(file);
            int size = fileReader.read(c);
            System.out.print("numero de bytes es: " + size);
            for (char c : c) {
                System.out.print(c);
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            ex.printStackTrace();
        }

    }

}
