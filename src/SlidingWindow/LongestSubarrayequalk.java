package SlidingWindow;

public class LongestSubarrayequalk {
    public static int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        int l =0;
        int r =0;
        int sum = 0;
        int maxlen =0;
        while(r<n){
            sum +=arr[r];
            if(sum >k){
                sum -=arr[l];
                l++;
            }
            if(sum<=k)  maxlen = Math.max(maxlen,r-l +1);
            r++;
        }
        return maxlen;

    }
    public static void main(String[] args) {
        int [] arr = {2,5,1,10,10};
        int k = 14;
        System.out.println(longestSubarray(arr,k));
    }
}
