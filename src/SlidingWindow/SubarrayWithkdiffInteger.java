package SlidingWindow;

import java.util.*;

public class SubarrayWithkdiffInteger {
        public static int subarraysWithKDistinct(int[] nums, int k) {
            return solve(nums,k) - solve(nums,k-1);
        }
        public static int solve(int[] nums , int k){
            int left = 0;
            int count = 0;
            HashMap<Integer , Integer> map = new HashMap<>();

            for(int right = 0 ;right< nums.length ; right++){
                map.put(nums[right],map.getOrDefault(nums[right] , 0)+1);
                if(map.get(nums[right]) == 1){
                    k--;
                }
                while(k<0){
                    map.put(nums[left], map.get(nums[left])-1);
                    if(map.get(nums[left]) == 0){
                        k++;
                    }
                    left++;
                }
                count += (right-left)+1;
            }
            return count;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(subarraysWithKDistinct(nums,k));
    }
}
