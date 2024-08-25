/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selectionsort;

/**
 *
 * @author Yash
 */
public class selectionsortTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        selectionSort sorter = new selectionSort();
        int[] arr = {64, 25, 12, 22, 11};
        
        System.out.println("Original array:");
        sorter.printarr(arr);

        sorter.selectMin(arr);

        System.out.println("Sorted array:");
        sorter.printarr(arr);
    }
    
}
