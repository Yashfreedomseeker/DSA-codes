/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlists;

/**
 *
 * @author Yash
 */
public class linkedList {
    Node head; 

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    public void insertAtBeginning(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public void insertAtPosition(int position, int newData) {
        if (position < 1) {
            System.out.println("Position should be >= 1.");
            return;
        }

        Node newNode = new Node(newData);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node previous = head;
        for (int i = 1; i < position - 1; i++) {
            if (previous != null) {
                previous = previous.next;
            } else {
                System.out.println("Position out of range.");
                return;
            }
        }

        if (previous != null) {
            newNode.next = previous.next;
            previous.next = newNode;
        } else {
            System.out.println("Position out of range.");
        }
    }

    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
    }

    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public void deleteFromPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (position < 1) {
            System.out.println("Position should be >= 1.");
            return;
        }

        if (position == 1) {
            head = head.next;
            return;
        }

        Node previous = head;
        for (int i = 1; i < position - 1; i++) {
            if (previous != null) {
                previous = previous.next;
            } else {
                System.out.println("Position out of range.");
                return;
            }
        }

        if (previous != null && previous.next != null) {
            previous.next = previous.next.next;
        } else {
            System.out.println("Position out of range.");
        }
    }
    public int search(int value) {
        Node currentNode = head;
        int position = 1;
        while (currentNode != null) {
            if (currentNode.data == value) {
                return position;
            }
            currentNode = currentNode.next;
            position++;
        }
        return -1;
    }
    public void printarr() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

}
