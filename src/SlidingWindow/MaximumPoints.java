package SlidingWindow;

import java.util.Scanner;

//Maximum points you can obtains from cards
public class MaximumPoints {
    public static int maxPoints(int[] arr , int k) {
        int n = arr.length;
        int lsum = 0;
        int rsum = 0;
        for(int i =0; i<k ; i++){
            lsum += arr[i];
        }
        int maxsum =  lsum;
        int rlen = n-1;
        for(int i = k-1;i>=0 ;i--){
            lsum -= arr[i];
            rsum += arr[rlen];
            rlen--;
            maxsum = Math.max(maxsum,lsum+rsum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxPoints(arr,k));
    }
}
