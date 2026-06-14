package LinkedListConcept;

public class DoublyLL {
        public class Node {
            int data;
            Node next;
            Node prev;

            public Node(int data) {
                this.data = data;
                this.next = null;
                this.prev = null;
            }
        }

        public static Node head;
        public static Node tail;
        public static Node prev;
        public static int size;

        //         AddFirst
        public void Addfirst(int data) {
            size++;
            Node newnode = new Node(data);
            if (head == null) {
                head = tail = newnode;
                return;
            }
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
//        AddLast
        public void Addlast(int data){
            size++;
            Node newNode = new Node(data);
            if(tail == null){
                head = tail = newNode;
            }
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " <-> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
//        removeFirst
        public int removeFirst(){
            if(head == null){
                System.out.println("The list is empty");
                return -1;
            }
            int val = head.data;
            if(size == 1){
                head = tail = null;
                size--;
                return val;
            }
            head = head.next;
            head.prev = null;
            size--;
            return val;
        }
//        removeLast
        public int removeLast(){
            if(head == null){
                System.out.println("The list is empty");
                return -1;
            }
            if(size == 1){
                int val = tail.data;
                tail = head = null;
                size--;
                return val;
            }
            int val = tail.data;
            tail = tail.prev;
            tail.next = null;
            size--;
            return val;
        }
        public void reverse(){
            Node curr = head;
            Node prev = null;
            Node next = null;
            while(curr != null){
                next = curr.next;
                curr.next = prev;
                curr.prev = next;
                prev = curr;
                curr = next;
            }
            head = prev;
        }
        public static void main(String[] args) {
            DoublyLL dl = new DoublyLL();
            dl.Addlast(1);
            dl.Addlast(2);
            dl.Addlast(3);
            dl.Addlast(4);
            dl.Addlast(5);
            dl.print();
//            dl.removeLast();
            dl.reverse();
            dl.print();
//            System.out.println(dl.size);
        }

}
