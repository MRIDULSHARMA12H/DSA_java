package ArrayListConcept;

import java.util.*;

public class PairSum_II {
    public static boolean Pair(ArrayList<Integer> list,int t){
        int bp = -1;  //braking point
        for(int i = 0 ; i< list.size();i++){
            if(list.get(i) > list.get(i+1)){
                bp= i;
                break;
            }
        }
        int lp = bp +1;
        int rp = bp;
        int n = list.size();
        while(lp != rp){
            if(list.get(lp) + list.get(rp) == t){
                return true;
            }
            if(list.get(lp) + list.get(rp) < t){
                lp = (lp +1)%n;
            }
            if(list.get(lp) + list.get(rp) > t){
                rp = (n+rp-1)%n;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(Pair(list,target));
    }
}
