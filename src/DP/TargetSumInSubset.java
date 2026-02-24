package DP;

import java.util.Scanner;

public class TargetSumInSubset {
    public static void print(boolean[][] dp){
        for(int i = 0 ; i< dp.length ; i++){
            for(int j = 0 ; j< dp[0].length ; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static boolean tab(int[]arr , int sum , int n){
        boolean [][] dp = new boolean [n+1][sum+1];
        for(int i=0 ; i< dp.length ; i++){
            dp[i][0]= true;
        }
        for(int j =1 ; j<dp[0].length ; j++){
            dp[0][j]= false;
        }
        for(int i =1 ; i<n+1 ;i++){
            for(int j = 1 ; j<sum+1 ; j++){
                int v = arr[i-1];
                if(v <= j && dp[i-1][j-v] == true){
                    dp[i][j] = true;
                }
                else if (dp[i-1][j]== true){
                    dp[i][j] = true;
                }
            }
        }
        print(dp);
        return dp[n][sum];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int targetSum = sc.nextInt();
        System.out.println(tab(arr,targetSum,n));
    }
}
