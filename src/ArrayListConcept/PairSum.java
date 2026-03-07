package ArrayListConcept;
import java.util.*;
public class PairSum {
//    public static boolean Pair(ArrayList<Integer> list , int target){  // Brute force
//        for(int i = 0 ; i< list.size(); i++){
//            for(int j = i+1 ; j<list.size() ; j++){
//                if(list.get(i) + list.get(j) == target){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    public static boolean Pairs(ArrayList<Integer> list , int t){  //2Pointer
        int lp = 0;
        int rp = list.size()-1;

        while(lp<rp){
            if(list.get(lp) + list.get(rp) == t){
                return true;
            }
            if(list.get(lp) + list.get(rp) > t){
                rp--;
            }
            if(list.get(lp) + list.get(rp) < t){
                lp++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 6;
        System.out.println(Pairs(list,target));
    }
}
