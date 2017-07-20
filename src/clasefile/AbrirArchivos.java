/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasefile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author alejandro
 */
public class AbrirArchivos {
    
    public static void main(String []abc){
        
        JFileChooser seleccionador = new JFileChooser();
        int op = seleccionador.showOpenDialog(null);
        if(op == JFileChooser.APPROVE_OPTION){
            FileReader abrir = null;
            try {
                File file = seleccionador.getSelectedFile();
                abrir = new FileReader(file);
                BufferedReader lector = new BufferedReader(abrir);
                String contenido;
                while((contenido = lector.readLine())!=null){
                    System.out.println(contenido);
                }
                
            } catch (FileNotFoundException ex) {
                
            }catch (IOException e){
                
            }
            finally {
                try {
                    abrir.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            
        }
    }
}
