package Subarraysconcept;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> s = new HashSet<>();
        int n = nums.length;
        for(int i = 0 ; i <n-2 ; i++){
            int low = i+1;
            int high = n-1;
            while(low < high){
                int sum = nums[i] + nums[low]+ nums[high];
                if(sum == 0){
                    s.add(Arrays.asList(nums[i] , nums[low] , nums[high]));
                    low++;
                    high--;
                }
                else if(sum <0){
                    low++;
                }
                else{
                    high --;
                }
            }
        }
        ans.addAll(s);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(threeSum(nums));
    }
}
