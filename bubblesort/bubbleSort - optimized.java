/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bubblesort;

/**
 *
 * @author Yash
 */
public class bubbleSort {
    
    public void printarr(int[] arr){
        int n = arr.length;
        int i;
        for(i = 0; i < n; ++i){
            System.out.print(arr[i]);
            if(i < n - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    
    public void bubblesort(int[] arr){
        int i;
        int j;
        int n = arr.length;
        int swap;
        int c = 0;
        
        for(i = 0; i < n-1; i++){
            for(j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = swap;
                    c = c + 1; //keeping count of swappings
                }
            }
            if(c == 0){
                System.out.println("The array is already sorted");
                break;
            }
        }
    }
    
    
}
