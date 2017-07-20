/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alejandro
 */
public class ClassSerializable {

    static class Cat implements Serializable {
            
        String Nombre;
        float peso;

        public Cat(String Nombre, float peso) {
            this.Nombre = Nombre;
            this.peso = peso;
        }          
        
    }

    public static void main(String[] abc) {
        Cat gato = new Cat("novato", 2f);
        try {
            FileOutputStream fos = new FileOutputStream("prueba.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(gato);
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ClassSerializable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClassSerializable.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileInputStream fis = new FileInputStream("prueba.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Cat c = (Cat) ois.readObject();
            System.out.println(c.Nombre+" "+ c.peso);// 4
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


