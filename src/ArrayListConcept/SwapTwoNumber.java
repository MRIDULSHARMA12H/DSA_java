package ArrayListConcept;

import java.util.*;

public class SwapTwoNumber {
    public static  void Swap(ArrayList<Integer> list , int idx , int idx2){
        int temp = list.get(idx);
        list.set(idx ,  list.get(idx2));
        list.set(idx2 , temp);
        System.out.println(list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(9);
        list.add(3);
        list.add(8);
        list.add(5);
        System.out.println(list);
        int idx =1;
        int idx2 = 3;
        Swap(list,idx,idx2);
     }
}
