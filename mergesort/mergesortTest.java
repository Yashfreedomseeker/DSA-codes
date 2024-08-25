/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mergesort;

/**
 *
 * @author Yash
 */
public class mergesortTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mergeSort ms = new mergeSort();
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        
        System.out.println("Original array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        
        ms.mergeSort(array);
        
        System.out.println("\nSorted array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    
}
