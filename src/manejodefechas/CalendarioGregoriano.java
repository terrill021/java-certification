/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodefechas;

import java.text.NumberFormat;
import java.util.GregorianCalendar;

/**
 *
 * @author alejandro
 */
public class CalendarioGregoriano {
    
    public static void main(String []qwe){
        GregorianCalendar calendar = new GregorianCalendar();
//        String tipocaledario = calendar.getCalendarType();
//        System.out.println("tipo caledario: "+tipocaledario);
        double d = Math.PI;
        System.out.println("pi: "+d);
        NumberFormat formatoNumero =  NumberFormat.getInstance();
        System.out.println("Numero maximo de decimales en el formato de numero: "+formatoNumero.getMaximumFractionDigits());
        System.out.println("pi con maximo 3 dcimales: "+ formatoNumero.format(d));
        formatoNumero.setMaximumFractionDigits(5);
        System.out.println("pi con maximo 5 dcimales: "+ formatoNumero.format(d));
        

    }
}
