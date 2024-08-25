/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlists;

/**
 *
 * @author Yash
 */
public class dlinkedLists {
    Node head; 

    // Node class
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            data = d;
            prev = null;
            next = null;
        }
    }

    public void insertAtBeginning(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
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
        newNode.prev = last;
    }

    public void insertAtPosition(int position, int newData) {
        if (position < 1) {
            System.out.println("Position should be >= 1.");
            return;
        }

        Node newNode = new Node(newData);
        if (position == 1) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 1; i < position - 1; i++) {
            if (current != null) {
                current = current.next;
            } else {
                System.out.println("Position out of range.");
                return;
            }
        }

        if (current != null) {
            newNode.next = current.next;
            newNode.prev = current;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
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
        if (head != null) {
            head.prev = null;
        }
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

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.prev.next = null;
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
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        Node current = head;
        for (int i = 1; i < position - 1; i++) {
            if (current != null) {
                current = current.next;
            } else {
                System.out.println("Position out of range.");
                return;
            }
        }

        if (current != null && current.next != null) {
            current.next = current.next.next;
            if (current.next != null) {
                current.next.prev = current;
            }
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
        return -1; // return -1 if the value is not found
    }

    public void printListForward() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public void printListBackward() {
        if (head == null) {
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        while (last != null) {
            System.out.print(last.data + " -> ");
            last = last.prev;
        }
        System.out.println("null");
    }

}
