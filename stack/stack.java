/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

import java.util.Arrays;

/**
 *
 * @author Yash
 */
public class stack {
    int[] arr;
    int capacity;
    int top;
    
    public void Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;  
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == capacity-1;
    }
    public void push(int x){
        if (isFull()){
            System.out.println("Stack is full.");
            System.exit(1);
        }
        arr[++top] = x;
        System.out.println(x+" pushed to the stack");
        System.out.println(Arrays.toString(arr));
    }
    public void pop(){
        int[] ar = new int[capacity];
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            System.exit(1);
        }
        for(int i = 0; i<top; i++){
            ar[i] = arr[i];
            //System.out.println(Arrays.toString(ar));
        }
        System.out.println(arr[top--]+" is popped out of stack");
        System.out.println(Arrays.toString(ar));
    }
    
    public int peek(){
        return arr[top];
    }
    
    public void printarr(){
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
  
}
