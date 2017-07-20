/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recolectordebasura;

import java.util.Date;

/**
 *
 * @author alejandro
 */
public class Recolector {

    public static void main(String[] args) {
        Date date;
        
        Runtime rt = Runtime.getRuntime();
        System.out.print("Memoria total: " + rt.totalMemory());
        System.out.print("\nMemoria libre: " + rt.freeMemory());

        for (int i = 0; i < 6000000; i++) {
            date = new Date();
            date = null;
        }

        System.out.print("\nMemoria libre dsps del for: " + rt.freeMemory());
        rt.gc();
                System.out.print("\nMemoria libre desps del gc: "+rt.freeMemory());


    }

}
