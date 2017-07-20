/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labeledunlabeled;

/**
 *
 * @author alejandro
 */
public class NewClass {
    
    public static void main(String []ad){
        
        label:
        for(;;){
            while (true){
                System.out.println("hello");
                break label;
            }
        }
        System.out.println("good bye");
    }
}
