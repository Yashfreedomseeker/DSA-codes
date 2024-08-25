/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rabbit;


/**
 *
 * @author Yash
 */
public class rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rabbitpairs rp = new rabbitpairs();
        int n = 12; // Number of months to calculate the rabbit pairs
        System.out.println("Number of rabbit pairs after " + n + " months: " + rp.fibonacciRabbits(n));
    }
    
}
