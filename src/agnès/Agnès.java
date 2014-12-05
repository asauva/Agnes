/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agnès;

/**
 *
 * @author Agnès
 */
public class Agnès {
static int i = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello word");
        System.out.println("joyeux noel");
       Rabbit rabbit = new Rabbit("bob", 5);
       while(i <= 10){
            rabbit.talk();
       i=i+1;
       }
    }
    
}
