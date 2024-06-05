/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insertsort;

/**
 *
 * @author Yash
 */
public class insertionSort {
    
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
    
    void insertionsort(int arr[]){
        int i, key, j;
        
        for(i = 1; i < arr.length; i++){
            key = arr[i];
            j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    //optimization
    int[] addElement(int arr[], int x){
        int n = arr.length;
        int[] newArr = new int[n + 1];
        
        int pos = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > x){
                pos = i;
                break;
            }
        }
        System.arraycopy(arr, 0, newArr, 0, pos);
        newArr[pos] = x;
        System.arraycopy(arr, pos, newArr, pos + 1, n - pos);
        return newArr;
    }
    
}
