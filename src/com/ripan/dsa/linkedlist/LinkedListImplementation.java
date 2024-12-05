package com.ripan.dsa.linkedlist;

/**
 * In this class we will implement the linked list
 * Implement all the methods to add and delete elements from the linked list
 */

class Node {
    int data; // data or value of the linked list
    Node next; // next, pointer to the next node

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

/**
 * @class: SinglyLinkedList
 * This class implements methods for linked list operations.
 * <br>
 * add- addFirst(), addLast(), addAt()
 * <br>
 * delete - deleteFirst(), deleteLast(), deleteAt()
 * <br>
 * length()
 * display()
 */
class SinglyLinkedList {
    private int len = 0; // initialize the length, which is empty for now
    private Node head = null;

    /**
     * @method addFirst()
     * It will add an element at the front of the linked list.
     * @param data
     */
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // make new node point to current head
        head = newNode; // update head to new node
        len++;
    }

    /**
     * @method addLast()
     * It will add an element at the last position of the linked list.
     * @param data
     */
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) { // if list is empty, set head to new node
            head = newNode;
        } else {
            Node cur = head;
            while (cur.next != null) { // reach to last node
                cur = cur.next;
            }
            cur.next = newNode; // link last node to new node
        }
        len++;
    }

    /**
     * @method addAt()
     * Adds an element at a specified index in the linked list.
     * @param data The data to be added.
     * @param index The index at which to add the element.
     */
    public void addAt(int data, int index) {
        if (index < 0 || index > len) return; // index out of bounds
        if (index == 0) {
            addFirst(data); // handle adding at head
            return;
        }
        if (index == len) {
            addLast(data); // handle adding at end
            return;
        }

        Node newNode = new Node(data);
        Node cur = head;

        for (int i = 0; i < index - 1; i++) { // reach (index-1)th node
            cur = cur.next;
        }

        newNode.next = cur.next; // link new node to current's next node
        cur.next = newNode; // link current node to new node
        len++;
    }

    /**
     * @method deleteFirst()
     * Deletes the first element of the linked list.
     */
    public void deleteFirst() {
        if (head != null) { // check if list is not empty
            head = head.next; // move head to next node
            len--;
        }
    }

    /**
     * @method deleteLast()
     * Deletes the last element of the linked list.
     */
    public void deleteLast() {
        if (head == null) return; // check if list is empty

        if (head.next == null) { // only one element in list
            head = null;
        } else {
            Node cur = head;
            while (cur.next.next != null) { // reach second last node
                cur = cur.next;
            }
            cur.next = null; // remove last node by setting next of second last to null
        }
        len--;
    }

    /**
     * @method deleteAt()
     * Deletes an element at a specified index in the linked list.
     * @param index The index of the element to be deleted.
     */
    public void deleteAt(int index) {
        if (index < 0 || index >= len) return; // index out of bounds

        if (index == 0) {
            deleteFirst(); // handle deleting from head
            return;
        }

        if (index == len - 1) {
            deleteLast(); // handle deleting from end
            return;
        }

        Node cur = head;

        for (int i = 0; i < index - 1; i++) { // reach (index-1)th node
            cur = cur.next;
        }

        cur.next = cur.next.next; // bypass deleted node
        len--;
    }

    /**
     * @method displayList()
     * Displays all elements in the linked list.
     */
    public void displayList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node cur = head;

        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }

        System.out.println();
    }

    /**
     * @method length()
     * Returns the number of elements in the linked list.
     */
    public int length() {
        return len;
    }
    /**
     * public int getLength(Node head) {
     *         int len = 0;
     *         Node cur = head;
     *         while(cur!= null){
     *             len ++;
     *             cur = cur.next;
     *         }
     *         return len;
     *     }
     */
}

/**
 * @class LinkedListImplementation
 * Main class to demonstrate linked list operations.
 */
public class LinkedListImplementation {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Add elements at the front
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        System.out.print("After adding first: ");
        list.displayList();

        // Add elements at the last
        list.addLast(40);
        list.addLast(60);
        System.out.print("After adding last: ");
        list.displayList();

        // Add element at a specific index
        list.addAt(100, 4);
        System.out.print("After adding at index 4: ");
        list.displayList();

        // Delete first element
        list.deleteFirst();
        System.out.print("After deleting first: ");
        list.displayList();

        // Delete last element
        list.deleteLast();
        System.out.print("After deleting last: ");
        list.displayList();

        // Delete element at a specific index
        list.deleteAt(2);
        System.out.print("After deleting at index 2: ");
        list.displayList();

        System.out.println("Length of the linked list: " + list.length());
    }
}