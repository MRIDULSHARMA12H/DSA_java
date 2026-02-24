package DP;

import java.util.Arrays;
import java.util.Scanner;

public class ClimbingStairs {
    public static int cl(int n , int[] dp){
        if( n == 0) return 1;
        if(n < 0) return 0;
        if(dp[n] != -1) return dp[n];
        dp[n] =  cl(n-1, dp) + cl(n-2, dp);
        return dp[n];
     }
     public static int tab(int n ){
        int [] dp2 = new int[n+1];
        dp2[0] = 1;
        for(int i = 1 ;i <= n ; i++){
            if( i == 1) dp2[i] = dp2[i-1];
            else dp2[i] = dp2[i -1] + dp2[i-2];
        }
        return dp2[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(cl(n,dp));
//        for tabulation
        System.out.println(tab( n));

    }
}
