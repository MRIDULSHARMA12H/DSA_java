package QueueConcept;
import java.util.*;
public class Dequebasic {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(1);
        d.addFirst(2);
        d.addFirst(3);
        d.addLast(4);
        d.addLast(5);
        System.out.println(d);
//        d.removeFirst();
//        d.removeLast();
        System.out.println(d);
        System.out.println("first el = " + d.getFirst());
        System.out.println("last el = " + d.getLast());
    }
}
