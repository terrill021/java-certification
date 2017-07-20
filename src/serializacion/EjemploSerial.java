/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

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

class Collar implements Serializable{
   public String largo;
}
class Animal {
    String grupo;
}
class Perro extends Animal implements Serializable {
    public String nombre;
    public String  describcion;
    public Collar collar;
}

class SerializaPerro {
    
    static public String serializar(Perro perro) throws FileNotFoundException, IOException {
        String ruta = "perroserializado.txt";
        FileOutputStream archivo = new FileOutputStream(ruta);
        ObjectOutputStream serializador = new ObjectOutputStream(archivo);
        serializador.writeObject(perro);
        serializador.close();
        return ruta;
    }

    static public Perro deserializar() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream abrir = new FileInputStream("perroserializado.txt");
        ObjectInputStream lector = new ObjectInputStream(abrir);
        Perro perroL = (Perro) lector.readObject();
        lector.close();
        return perroL;
    }
}

public class EjemploSerial {
    public static void main(String[] args) {
        try {
            Perro perro = new Perro();
            perro.nombre = "rex";
            perro.describcion = "pastor aleman";
            perro.collar = new Collar();
            perro.collar.largo="30cm";
            perro.grupo = "mamifero";

            SerializaPerro.serializar(perro); // serializa al perro
            Perro pdeserializado = SerializaPerro.deserializar();
            System.out.println("Nombre: " + pdeserializado.nombre + "\t describcion: " + pdeserializado.describcion+
                    "\tCollar: "+ pdeserializado.collar.largo + "\t Grupo: " + pdeserializado.grupo);

        } catch (IOException ex) {
            Logger.getLogger(EjemploSerial.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EjemploSerial.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
