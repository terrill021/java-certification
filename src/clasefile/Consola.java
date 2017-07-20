/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasefile;

import java.io.Console;

/**
 *
 * @author alejandro
 */
public class Consola {

    public static void main(String[] args) {
        Console console = System.console();
        String username = console.readLine("Username: ");
        char[] password = console.readPassword("Password: ");
        if (username.equals("admin") && String.valueOf(password).equals("secret")) {
            console.printf("Bienvenido");
        } else {
            console.printf("Error en login o password");
        }
    }
}
