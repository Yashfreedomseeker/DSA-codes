/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlists;

/**
 *
 * @author Yash
 */
public class linkedlistTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        linkedList list = new linkedList();

        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtPosition(2, 15);
        System.out.println("List after insertions:");
        list.printarr();

        int searchValue = 15;
        int position = list.search(searchValue);
        if (position != -1) {
            System.out.println("Element " + searchValue + " found at position: " + position);
        } else {
            System.out.println("Element " + searchValue + " not found in the list.");
        }
        
        list.deleteFromBeginning();
        System.out.println("List after deleting from beginning:");
        list.printarr();

        list.deleteFromEnd();
        System.out.println("List after deleting from end:");
        list.printarr();

        list.deleteFromPosition(2);
        System.out.println("List after deleting from position 2:");
        list.printarr();
        
        dlinkedLists dlist = new dlinkedLists();
        
        dlist.insertAtBeginning(10);
        dlist.insertAtEnd(20);
        dlist.insertAtEnd(30);
        dlist.insertAtPosition(2, 15);
        System.out.println("Doubly List after insertions:");
        dlist.printListForward();

        int searchVal = 15;
        int dposition = dlist.search(searchVal);
        if (dposition != -1) {
            System.out.println("Element " + searchVal + " found at position: " + dposition);
        } else {
            System.out.println("Element " + searchVal + " not found in the list.");
        }

        list.deleteFromBeginning();
        System.out.println("Doubly List after deleting from beginning:");
        dlist.printListForward();

        list.deleteFromEnd();
        System.out.println("Doubly List after deleting from end:");
        dlist.printListForward();

        list.deleteFromPosition(2);
        System.out.println("Doubly List after deleting from position 2:");
        dlist.printListForward();

        System.out.println("Doubly List printed backward:");
        dlist.printListBackward();
        
        stackusingLL stack = new stackusingLL();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack();

        System.out.println("Top element is " + stack.peek());

        stack.pop();
        stack.printStack();

        stack.pop();
        stack.pop();
        stack.pop(); 
    }
    
    
}
