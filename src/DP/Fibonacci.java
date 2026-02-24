package DP;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        int [] dp = new int [n+1];
        System.out.println(fibb(n ,dp));

    }

    private static int fibb(int n, int[] dp) {
        if(n ==0 || n ==1){
            return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = fibb(n-1 , dp) + fibb(n-2 , dp);
        return dp[n];
    }
}
