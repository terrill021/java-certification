/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overload;

/**
 *
 * @author alejandro
 */
public class SobreCarga {

    static void metodo(byte b) {
        System.out.println("byte");
    }

    static void metodo(short b) {
        System.out.println("short");
    }

    static void go(Integer x) {
        System.out.println("Integer");
    }

    static void metodo(int i) {

        System.out.println("int");

    }

    static void metodo(long l) {
        System.out.println("long");

    }

    static void metodo(float f) {
        System.out.println("float");
    }

    static void metodo(double d) {
        System.out.println("double");
    }

   

        static void go(Byte x) {
            System.out.println("Long");
        }

   

    public static void main(String[] args) {
        byte b = 127;
        metodo(3.4);
        metodo(b);
        metodo(3d);
       
        go(b);
    }

}
