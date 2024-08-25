/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quicksort;

/**
 *
 * @author Yash
 */
public class quickSort {
    public static void quickSort(int[] A, int low, int high) {
        if (low < high) {
            int pi = partition(A, low, high);
            quickSort(A, low, pi - 1);
            quickSort(A, pi + 1, high);
        }
    }

    public static int partition(int[] A, int low, int high) {
        int pivot = A[high]; 
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (A[j] <= pivot) {
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[i + 1];
        A[i + 1] = A[high];
        A[high] = temp;

        return i + 1; 
    }
    public static void printArray(int[] A) {
        for (int i : A) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
