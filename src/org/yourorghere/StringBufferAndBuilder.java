/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

/**
 *
 * @author alejandro
 */
public class StringBufferAndBuilder {
    public static void main(String abc[]){
        StringBuilder sb = new StringBuilder("radar");
        sb.reverse();
        System.out.println(sb.toString().toUpperCase());
    }
}
