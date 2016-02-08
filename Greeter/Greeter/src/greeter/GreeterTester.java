/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeter;

/**
 *
 * @author beland
 */
public class GreeterTester 
{    
    //main method
    public static void main(String[] args) 
    { 
        // change name of one to change the name of the other
        Greeter friend = new Greeter("Friend");
        Greeter pal = friend;
        friend.setName("Pal");
        System.out.println(friend.sayHello());
        
        // swap Beatrice and Noah to say hello to Noah instead of Beatrice
        Greeter beatrice = new Greeter("Beatrice");
        Greeter noah = new Greeter("Noah");
        beatrice.swapNames(noah);
        System.out.println(beatrice.sayHello());
    }
}

