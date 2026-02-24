package Recursion;

import java.util.Scanner;

public class TillingProblem {
    public static int Tilling(int n)
    {
//        base
        if( n==0 || n==1)
        {
            return 1;
        }
        // choice
//        int vartical = Tilling(n-1);
//        int horizontal = Tilling(n-2);
//        return vartical + horizontal;
        return Tilling(n-1) + Tilling(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of floor " + " ");
        int n = sc.nextInt();
        System.out.println(Tilling(n));

    }
}
