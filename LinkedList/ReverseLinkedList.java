package com.LinkedList;

public class ReverseLinkedList {
    private node head;
    private node tail;
    private int size;
    public ReverseLinkedList(){
        this.size =0;
    }
    private class node{
        private int value;
        private node next;

        public node(int value) {
            this.value = value;
        }

        public node(int value, node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void display(){
        node display = head;
        while(display != null){
            System.out.print(display.value);
            if(display.next != null){
                System.out.print("-> ");
            }
            display = display.next;
        }
        System.out.println();
    }
    public void insertFirst(int value){
        node newNode = new node(value);
        newNode.next = head;
        head = newNode;

        if(tail == null){
            tail = head;
        }
        size++;
    }
    public void insertLast(int value){
        node newNode = new node(value);
        tail.next = newNode;
        tail = newNode;

        if(head == null){
            head = tail;
        }
        size++;
    }
    public void recursiveReverse(node current){
        if (current ==  tail){
            head = tail;
            return;
        }
        recursiveReverse(current.next);
        tail.next = current;
        tail = current;
        tail.next = null;
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.insertFirst(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.display();

        list.recursiveReverse(list.head);
        list.display();
    }
}
