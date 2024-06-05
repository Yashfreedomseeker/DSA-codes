/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertsort;

/**
 *
 * @author Yash
 */
public class insertionSortTest {

   
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {1,9,5,3,6,2,8,7};
        insertionSort is = new insertionSort();
        is.insertionsort(a);
        is.printarr(a);
        int[] x = is.addElement(a, 4);
        is.printarr(x);
    }
    
}
