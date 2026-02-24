package ArrayListConcept;

import java.util.*;

public class MaximumInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(7);
        list.add(5);
        list.add(8);
        list.add(2);
        System.out.println(list);
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i< list.size() ; i++){
//            if(list.get(i) >max){
//                max = list.get(i);
//            }
            max = Math.max(max , list.get(i));
        }
        System.out.println(max);
    }
}
