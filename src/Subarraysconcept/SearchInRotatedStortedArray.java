package Subarraysconcept;

import java.util.Scanner;

public class SearchInRotatedStortedArray {
    public static int search(int[] nums, int target) {
        int n= nums.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[low] <= nums[mid]){
                if(target >= nums[low] && target <= nums[mid]){
                    high = mid;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(target >= nums[mid+1] && target<= nums[high]){
                    low = mid+1;
                }else{
                    high = mid;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(search(nums,target));
    }
}
