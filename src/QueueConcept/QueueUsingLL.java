package QueueConcept;

public class QueueUsingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        static class Queuell{
            static  Node head = null;
            static  Node tail = null;
            public static boolean isEmpty(){
                return head == null && tail == null;
            }
//            add
            public static void add(int data){
                Node newNode = new Node(data);
                if(head == null){
                    head = tail = newNode;
                    return;
                }
                else{
                    tail.next = newNode;
                    tail = newNode;
                }
            }
//            remove
            public static int remove(){
                if(isEmpty()){
                    System.out.println("Queue is empty");
                    return -1;
                }
                int front = head.data;
//                single element
                if(head == tail){
                    tail = head = null;
                }
                else{
                    head = head.next;
                }
                return front;
            }
//            Peek
            public static int peek(){
                if(isEmpty()){
                    System.out.println("Queue is empty");
                    return -1;
                }
                return head.data;
            }
        }

    public static void main(String[] args) {
        Queuell q = new Queuell();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();

        }
    }
}
