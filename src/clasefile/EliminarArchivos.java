/*
 * eliminar archivos
 */
package clasefile;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author alejandro
 */
public class EliminarArchivos {

    public static void main(String[] a) {
        JFileChooser seleccionador = new JFileChooser("c://");
        
        seleccionador.setDialogTitle("Selecciona una ruta para eliminar su contenido");
        int result = seleccionador.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = seleccionador.getSelectedFile();
            if (file.isFile()) {
                System.out.println("Se ha seleccionado un archivo, su ruta es: " + file.getPath());
                System.out.println("Se elimino el archivo? (true=si, false =no) " + file.delete());
            } else if (file.isDirectory()) {
                System.out.println("Se ha seleccionado un directorio: su ruta es " + file.getPath());
                
            }

        }

    }
}
