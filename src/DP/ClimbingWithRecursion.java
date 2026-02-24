package DP;

public class ClimbingWithRecursion {
    public static int cl(int n){
        if(n == 0){
            return 1;
        }
        if(n <0){
            return 0;
        }
        return cl(n-1)+cl(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(cl(n));
    }
}
