package com.ripan.dsa.linkedlist;

class DoublyNode{
    int data;
    DoublyNode next;
    DoublyNode prev;

    public DoublyNode(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class CovertArrayToDLL {

    public static void print(DoublyNode head){
        DoublyNode cur = head;
        while(cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
    }

    public static DoublyNode convertArrToDLL(int[] arr){
        DoublyNode head = new DoublyNode(arr[0]);
        DoublyNode temp = head;
        for(int i = 1; i < arr.length; i ++){
            DoublyNode newNode = new DoublyNode(arr[i]);
            temp.next = newNode;
            newNode.prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 6};

        DoublyNode head = convertArrToDLL(arr);
        print(head);

    }
}
