/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author alejandro
 */
public class ClasePAttern {

    public static void main(String[] args) {
        matchesJopntionPAne();

    }

    public static void toPattern() {
        Pattern p = Pattern.compile("ababcdeab");
        Matcher m = p.matcher("ab");
        boolean b;
        b = m.matches();
        String result;
        result = b ? "ok" : "noOk";

        System.out.print(result);

        String s = new String("alejandro");

    }

    static void matchesJopntionPAne() {
        boolean b = true;
        do {
            String result = JOptionPane.showInputDialog("ingrese los datos: ");
            if (result.matches("[a-zA-Z]{3,10}")) {
                System.out.println("Correcto");
            } 
            else {
                System.out.println("Incorrecto");
                b = false;
            }
        } while (b);
    }

}
