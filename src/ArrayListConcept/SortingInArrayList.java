package ArrayListConcept;
import java.util.*;
public class SortingInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(9);
        list.add(3);
        list.add(8);
        list.add(7);
        list.add(4);
        for(int i = 0 ; i< list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        Collections.sort(list);
        for(int i = 0 ; i< list.size();i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
