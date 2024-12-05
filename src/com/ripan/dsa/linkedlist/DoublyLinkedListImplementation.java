package com.ripan.dsa.linkedlist;

class ListNode {
    int data;
    ListNode prev;
    ListNode next;

    public ListNode(int data){
        this.data = data;
        prev = null;
        next = null;
    }
}

class DoublyLinkedList{
    ListNode head = null; // initially assign head to null
    int len = 0; // initially doubly linked list is empty, so length is 0

    public void displayList(){
        // currentNode is use to traverse through the list to print the elements
        // we don't want to loose the access of head
        ListNode cur = head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void addFirst(int data){
        ListNode cur = head;
        ListNode newNode = new ListNode(data);

        newNode.next = cur; // make new node point to current head
        if(cur != null) cur.prev = newNode; // make current head point to its previous node
        head = newNode; // update head to new node
        len++; // increment the length
    }

    public void addLast(int data){
        ListNode cur = head;
        ListNode newNode = new ListNode(data);

        // moving the current node to the last element
        while(cur.next != null){
            cur = cur.next;
        }

        cur.next = newNode; // make the current node point to newNode, which is last node.
        newNode.prev = cur; // make newNode point to current node
        len ++;
    }

    public void addAt(int data, int index){
        ListNode cur = head;
        ListNode newNode = new ListNode(data);

        // moving the current node to the index-1-1th element
        for(int i = 0; i < index-1-1; i ++){
            cur = cur.next;
        }

        newNode.next = cur.next; // make the newNode point to the current of the next node
        ListNode curAfter = cur.next; // create this node to store the current after node
        if(curAfter != null) curAfter.prev = newNode; // make the current after node point to the newNode
        newNode.prev = cur; // make the newNode point to the current node
        cur.next = newNode; // make the current node point to the newNode
        len ++; //
    }

    /**
     * @method deleteFirst()
     * Deletes the first element of the doubly linked list.
     * delete head
     */
    public void deleteFirst() {
        if (head == null) return;

        if (head.next == null) { // only one element in the list
            head = null; // set head to null
        } else {
            head = head.next; // move head to next node
            head.prev = null; // set previous pointer of new head to null
        }

        len--; // decrease length
    }

    public void deleteLast() {
        if (head == null) return;
        if(head.next == null){
            head = null; // single element
        } else{
            // more than one element
            // first, need to find the tail of the doubly linked list
            ListNode tail = head;
            while(tail.next != null){
                tail = tail.next;
            }
            // whatever the element present before the last element.
            // its next should point to null.
            tail.prev.next = null;
            // tail will at the last position
            tail.prev = null; // make the previous of tail no null, so that it don't have any connection to its previous element.
        }
        len --;
    }

    public void deleteAt(int index) {
        // Check if the list is empty
        if (head == null) return;

        // Check if index is out of range
        // while operation, if it happens then no error statement will come
        // if we want then we can throw exception or write an error message.
        if (index < 0 || index > len) return;

        ListNode cur = head;
        int cnt = 0;

        // Traverse to find the node at the specified index
        while (cur != null && cnt < index) {
            cnt++;
            if(cnt == index) break;
            cur = cur.next; // else move to the next node
        }

        ListNode back = cur.prev; // Previous element of the current element
        ListNode front = cur.next; // Next element of the current element

        if (back == null) {
            // This is the first element
            deleteFirst(); // Call deleteFirst() method
        } else if (front == null) {
            // This is the last element
            deleteLast(); // Call deleteLast() method
        } else {
            // Node is in between
            back.next = front; // Link previous node to next node
            front.prev = back; // Link next node to previous node
        }

        len--; // Decrease length after successful deletion
    }
    public int length(){ return len; }
}
public class DoublyLinkedListImplementation {
    public static void main(String[] args) {

        DoublyLinkedList dl = new DoublyLinkedList();

        System.out.println("Adding elements at first: ");
        dl.addFirst(10);
        dl.addFirst(20);
        dl.addFirst(30);
        dl.displayList();

        System.out.println("Adding elements at last: ");
        dl.addLast(40);
        dl.addLast(50);
        dl.displayList();

        System.out.println("Adding elements 100 at index: 4");
        dl.addAt(100, 4);
        dl.displayList();

        System.out.println("Delete first element or head");
        dl.deleteFirst();
        dl.displayList();

        System.out.println("Delete last element or tail");
        dl.deleteLast();
        dl.displayList();

        System.out.println("Delete at index 2");
        dl.deleteAt(2);
        dl.displayList();

        System.out.println("current length: "+dl.length());
    }
}
