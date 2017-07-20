/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import java.text.DateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author alejandro
 */
public class ManejoFechas {

    public static void main(String[] args) {
        /* Date d1 = new Date(); // un trillon
         System.out.println("fecha actual: " + d1.toString());
         d1.setTime(d1.getTime() + 1 * 24 * 60 * 60 * 1000); // Se suma un dia
         System.out.println("nueva fecha: " + d1.toString());*/

        System.out.println(args.length);
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime() + "\n" + calendar.getCalendarType());

        Locale locale = new Locale("español");
        DateFormat dateFormat = DateFormat.getDateInstance();
        Date date = calendar.getTime();

        System.out.println("\n\n" + dateFormat.format(date));
        System.out.println("\n\n");

        ejemploDeDateFormat();
    }

    static void ejemploDeDateFormat() {

        Calendar ca = Calendar.getInstance();
        Date d1 = ca.getTime();
        System.out.println(d1);//imprime la hora asi, Sat Feb 06 22:12:34 COT 2016
        DateFormat[] dfa = new DateFormat[6];
        dfa[0] = DateFormat.getInstance();
        dfa[1] = DateFormat.getDateInstance();
        dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
        dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
        dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);
        for (DateFormat df : dfa) {
            System.out.println(df.format(d1));
            System.out.println("");
        }
    }
    
    
}
