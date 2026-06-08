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
    public static int oprationrec(Node head , int key){
        Node temp = head;
        if(temp == null){
            return -1;
        }
        if(temp.data == key){
            return 0;
        }
        int idx = oprationrec(temp.next , key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public static int recSearch(int key){
        return oprationrec(head , key);
    }
    public static void deleteNthNodeFromEnd(int n){
        Node temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        if(size == n){
            head = head.next;
            return;
        }
        int i = 1;
        int iTofind = size - n;
        Node prev = head;
        while(i < iTofind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }
     public Node finfMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
     }
     public boolean checkplindrome(){
        if(head == null || head.next == null){
            return false;
        }
        Node mid =  finfMid(head);
        Node prev = null;
        Node curr = mid;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        while (right != null){
            if(left.data != right.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
     }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(1);
//        ll.addLast(5);
//        ll.addLast(6);
//        ll.addLast(7);
//        ll.addMid(2,9);
//        ll.addMid(6,10);
//        ll.print();
//        ll.removeFirst();
//        ll.removeLast();
        ll.print();
//        System.out.println(ll.size);
//        System.out.println(ll.itrSearch(9));
//        System.out.println(ll.itrSearch(10));
//        ll.deleteNthNodeFromEnd(3);
        System.out.println(ll.checkplindrome());
    }
}
