/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quicksort;

import static quicksort.quickSort.printArray;
import static quicksort.quickSort.quickSort;

/**
 *
 * @author Yash
 */
public class quicksortTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] A = {10, 7, 8, 9, 1, 5};
        int n = A.length;

        System.out.println("Original array:");
        printArray(A);

        quickSort(A, 0, n - 1);

        System.out.println("Sorted array:");
        printArray(A);
    }
}
