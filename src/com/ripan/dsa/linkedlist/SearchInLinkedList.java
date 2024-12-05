package com.ripan.dsa.linkedlist;

/**
 * check whether a given element is present or not in the linked list.
 * return true if present or else false.
 */
public class SearchInLinkedList {

    public boolean searchKey(Node head, int key) {
        // take a current node, so that later we have the access to head
        Node cur = head;

        while(cur != null) {
            if(cur.data == key)  return true;
            cur = cur.next;
        }
        // time: O(n)
        // element not found
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 3};

        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);

        int key = 39;

        boolean isPresent = new SearchInLinkedList().searchKey(head, key);
        System.out.println(isPresent);
    }
}
