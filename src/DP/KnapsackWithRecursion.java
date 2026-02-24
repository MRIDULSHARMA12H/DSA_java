package DP;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class KnapsackWithRecursion {
    public static int kk(int[] val , int [] wt , int W , int n){
        if(W == 0 || n ==0){
            return 0;
        }
        if(wt[n-1] <= W){
            int ans1 = val[n-1] + kk(val,wt ,  W - wt[n-1], n-1 );
//            exclude
            int ans2 =  kk(val , wt ,W , n-1);
            return Math.max(ans1,ans2);
        }
        else{
            return kk(val , wt ,W , n-1);
        }
    }
//    with memoization
    public static int memo(int[] val , int [] wt , int W , int n , int[] [] dp){
        if(W ==0 || n == 0) return 0;
        if(dp[n][W]!= -1) return dp[n][W];
        if(wt [n-1] <= W){
            int ans1 = val[n-1] + memo(val , wt ,  W - wt[n-1] , n-1 , dp );
            int ans2 = memo(val , wt , W , n-1, dp);
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        }
        else{
             dp[n][W] =  memo(val , wt , W , n-1, dp);
             return dp[n][W];
        }
    }
    public static int tab(int[] val , int[] wt , int W , int n){
        int [][] dp = new int[n+1][W+1];
        for(int i = 0 ; i< dp.length ; i++){
            dp[i][0] = 0;
        }
        for(int j = 0 ; j< dp[0].length ; j++){
            dp[0][j] = 0;
        }
        for(int i =1 ; i< n+1 ; i++){
            for(int j = 1  ; j< W+1 ; j++){
                int v = val[i-1];
                int we = wt[i-1];
                if(we <= j){
                    dp[i][j]  =  Math.max(v + dp[i-1][j-we] , dp[i-1][j]) ;
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        print(dp);
        return dp[n][W];


    }
    public static void print(int[][] dp){
        for(int i = 0 ; i< dp.length ; i++){
            for(int j = 0 ; j< dp[0].length ; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the value of bag weight : ");
        int W = sc.nextInt();
        int [] val = new int [n];
        int [] wt = new int [n];
        for(int i =0 ; i< n ; i++){
            val[i] = sc.nextInt();
        }
        for(int i =0 ; i< n ; i++){
            wt[i] = sc.nextInt();
        }
        System.out.println(kk(val,wt,W, val.length));

        int [] [] dp = new int [n +1][W+1];
        for(int i = 0 ; i< dp.length ; i++ ){
            for(int j = 0 ; j < dp[0].length ; j++ ){
                dp[i][j] = -1;
            }
        }
        System.out.println(memo(val,wt,W,n , dp));
        System.out.println(tab(val,wt,W,n));
    }

}
