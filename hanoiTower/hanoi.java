/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hanoiTower;

import static hanoiTower.TowerofHanoi.solveHanoi;

/**
 *
 * @author Yash
 */
public class hanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 5;
        solveHanoi(n, 'A', 'B', 'C'); 
    }
    
}
