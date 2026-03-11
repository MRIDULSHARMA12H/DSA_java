package LinkedListConcept;

import java.sql.SQLOutput;

public class LinkedList {
    public static  class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
//    for addFirst
    public static void addFirst(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = newnode;
            tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
//    for addLast
    public static void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail  = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
//    For print
    public static void print(){
        if(head == null){
            System.out.println("LinkedList  is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
//    for addMid
    public static void addMid(int idx , int data){
        if(head == null){
            addFirst(9);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while( i < idx-1){
            temp = temp.next;
            i++;
        }
//        i = idx-1 , temp -> prev;
        newNode.next = temp.next;
        temp.next = newNode;
    }
//    remove First
    public static int removeFirst(){
        if(size ==0){
            System.out.println("LinkedList is empty");
            return -1;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
//    remove last
    public static int removeLast(){
        if(size ==0){
            System.out.println("LinkedList is empty");
            return -1;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        Node prev = head;
        for(int i = 0 ; i< size-2 ; i++){
            prev = prev.next;
        }
        int val = prev.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
//    for itrativeSearch
    public static int itrSearch(int key){ //O(n)
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addMid(2,9);
//        ll.print();
//        ll.removeFirst();
        ll.removeLast();
        ll.print();
//        System.out.println(ll.size);
        System.out.println(ll.itrSearch(9));
        System.out.println(ll.itrSearch(10));
    }
}
