/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokenizer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alejandro
 */
public class UsoScanner {

    public static void main(String[] a) {

        leerDelTeclado();
        //promediarNumeros();
        //leerDeUnArchivo();
    }

    static void promediarNumeros() {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        int contador = 0;
        while (scanner.hasNextDouble()) {
            contador++;
            suma += scanner.nextDouble();
        }

        System.out.println("promedio es: " + (double) suma / (contador));
    }

    static void leerDelTeclado() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            if (scanner.hasNextInt()) {
                System.out.println("int: " + scanner.nextInt());
                continue;
            }
            if (scanner.hasNextDouble()) {
                System.out.println("Double: " + scanner.nextDouble());
                continue;
            }
            if (scanner.hasNextBoolean()) {
                System.out.println("Boolean: " + scanner.nextBoolean());
                continue;
            }
            String cad = scanner.next();
            System.out.println("String: " + cad);
            if (cad.equals("fin")) {
                break;
            }

        }
    }

    private static void leerDeUnArchivo() {

        try {
            File file = new File("alejandro.txt");
            file.createNewFile();
            FileWriter escritor = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(escritor);
            bw.write("1, 2,     3, fin");
            bw.flush();
            escritor.close();

            Scanner scanner = new Scanner(file);
            scanner.useDelimiter(", *");
            double suma = 0;
            while (scanner.hasNextDouble()) {
                suma += scanner.nextDouble();
            }
            System.out.println(suma);
        } catch (IOException ex) {
            Logger.getLogger(UsoScanner.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
