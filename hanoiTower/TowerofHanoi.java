/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hanoiTower;

/**
 *
 * @author Yash
 */
public class TowerofHanoi {

    public static void solveHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disc 1 from " + source + " to " + destination);
            return;
        }
        
        solveHanoi(n - 1, source, destination, auxiliary);
        System.out.println("Move disc " + n + " from " + source + " to " + destination);
        solveHanoi(n - 1, auxiliary, source, destination);
    }

    
}

