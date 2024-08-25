/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rabbit;

/**
 *
 * @author Yash
 */
public class rabbitpairs {
    public static int fibonacciRabbits(int n) {
        if (n <= 1) {
            return n; // Base case: return n if n is 0 or 1
        } else {
            return fibonacciRabbits(n - 1) + fibonacciRabbits(n - 2);
        }
    }
}
