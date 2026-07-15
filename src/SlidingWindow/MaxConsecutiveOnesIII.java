package SlidingWindow;

import java.util.Scanner;

public class MaxConsecutiveOnesIII {
    public static int longestOne(int[] arr , int k) {
        int l =0;
        int r=0;
        int maxlen =0;
        int zero =0;
        while(r<arr.length){
            if(arr[r] == 0)zero++;
            if(zero >k){
                if(arr[l] == 0)zero--;
                l++;
            }
            if(zero <=k) {
                int len = r - l + 1;
                maxlen = Math.max(maxlen, len);
            }
            r++;
        }
        return maxlen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(longestOne(arr,k));
    }
}
