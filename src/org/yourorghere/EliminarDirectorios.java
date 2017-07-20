/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author alejandro
 */
public class EliminarDirectorios {

    private static final String ruta = "C:\\Users\\alejandro\\Downloads\\Compressed\\alejandro";

    public static void main(String[] args) {
        metodJfileChoser();

    }

    static void metodJfileChoser() {
        JFileChooser ventana = new JFileChooser();
        ventana.setVisible(true);
        int op = ventana.showOpenDialog(null);
        if (op == JFileChooser.APPROVE_OPTION) {
            File file = ventana.getSelectedFile();
            if (file.isDirectory()) {
                System.out.print("es un directorio");
            } else if (file.isFile()) {
                manejadorDeArchivos(file);
            } else {
                System.out.print("que coño es esto??");
            }

        }
    }

    static private void manejadorDeArchivos(File file) {
        System.out.print("es un archivo");

        File parent = file.getParentFile(); //obtiene la carpeta contenedora de un archivo
        if (parent.isDirectory()) {
            System.out.println(parent.getPath()); // obtiene
            manejadorDeDirectorios(parent);
        }

    }

    private static void manejadorDeDirectorios(File parent) {
        System.out.println("es un directorio");

        int op = JOptionPane.showConfirmDialog(null, "esta seguro que desea borrar todos los archivos de la ruta : " + parent.getAbsolutePath(), ".:::ATENCION:::.", JOptionPane.YES_NO_OPTION);

        if (op == 0) {
            File[] files = parent.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    if (!file.delete()) {//si no puede borrar el directorio, tiene archivos
                        manejadorDeDirectorios(file);//recursividad
                    } 
                } else if (file.isFile()) {
                    file.delete(); // borra el archivo
                }
            }
        }
    }
}
