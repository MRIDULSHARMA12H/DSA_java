package Subarraysconcept;

import java.sql.SQLOutput;

public class MaximumSum {
    public static int maxsum(int[] arr){
        int n= arr.length;
        int max=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<n;i++){
            currsum+=arr[i];
            if(currsum < 0){
                currsum=0;
            }
            max=Math.max(max,currsum);
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxsum(arr));
    }

}
