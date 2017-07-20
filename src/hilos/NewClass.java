/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author alejandro
 */
public class NewClass {

    public static void main(String args[]) {

       int i[][] = new int[5][];
       i[1]= new int[8];
       int []b[];
  
       int[][] a;
       String s = new String("abc");
       s = s+s;
       
    }

    public static void excepcion() {
        int i = 1;
        int j = 1;
        try {
            i++;
            j--;
            if (i / j > 1) {
                i++;
            }
        } catch (ArithmeticException e) {
            System.out.println(0);
            throw new ArithmeticException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(1);
        } catch (Exception e) {
            System.out.println(2);
        } finally {
            System.out.println(3);
        }

        System.out.println(4);
    }
}
