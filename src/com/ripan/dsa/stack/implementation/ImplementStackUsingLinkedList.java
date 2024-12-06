package com.ripan.dsa.stack.implementation;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

class StackUsingLL {
    Node head; // This will act as the top of the stack
    int size; // This will track the size of the stack

    public StackUsingLL(){
        head = null;
        size = 0;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If stack is empty, new node becomes head
        } else {
            newNode.next = head; // Link new node to current head
            head = newNode; // Update head to new node
        }
        size++;
    }

    public int pop() {
        if (head == null) return -1; // Stack is empty
        int poppedValue = head.data; // Get value from top node
        head = head.next; // Update head to next node
        size--;
        return poppedValue;
    }

    public int peek() {
        if (head == null) return -1; // Stack is empty
        return head.data; // Return value from top node without removing it
    }

    public int getSize() {
        return size; // Return current size of stack
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class ImplementStackUsingLinkedList {
    public static void main(String[] args) {
        StackUsingLL sll = new StackUsingLL();

        sll.push(10);
        sll.push(20);
        sll.push(30);
        sll.push(40);
        sll.push(50);

        sll.display();

        System.out.println("Popped value: " + sll.pop());
        System.out.println("Top value: " + sll.peek());
        System.out.println("Current size: " + sll.getSize());

        sll.display();
    }
}