package ArrayListConcept;
import  java.util.*;
public class Syntex {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

//        add element

        list.add(1); // the time complexity of this is O(1).
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
//        list.add(1 , 9);  //O(n)
        System.out.println(list);

//        get operation -> O(1)

//        int element = list.get(2);
//        System.out.println(element);

//        remove operation -O(n);

//        list.remove(2);
//        System.out.println(list);

//        Set operation -> O(n)

//        list.set(2,10);
//        System.out.println(list);

//        Contains operation -> O(n), they return true and false

//        System.out.println(list.contains(1));
//        System.out.println(list.contains(6));

//        Size in arrayList
          System.out.println(list.size());

          for(int i = 0 ; i<list.size() ; i++){
              System.out.print(list.get(i) + " ");
          }
          System.out.println();

//        print reverse of a  ArrayList
        for(int i = list.size() -1 ; i>=0 ; i-- ){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

}
