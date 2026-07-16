package SlidingWindow;

import java.util.HashMap;
import java.util.Scanner;

public class KdistinctCharacters {
    public static int longestsubString(String s, int k) {
        int n = s.length();
        int l =0;
        int r =0;
        int maxlen =0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(r<n){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            if(map.size()>k){
                map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)-1);
                if(map.get(s.charAt(l))==0){map.remove(s.charAt(l));}
                l++;
            }
            if(map.size()<=k){
                int len = r-l+1;
                maxlen = Math.max(maxlen,len);
            }
            r++;
        }
        return maxlen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(longestsubString(s, k));
    }
}
