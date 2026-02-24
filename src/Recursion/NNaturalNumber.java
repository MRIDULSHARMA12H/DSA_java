package Recursion;

import java.util.Scanner;

public class NNaturalNumber {
    public static int NaturalNo(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else{
            return NaturalNo(n-1)+n;
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(NaturalNo(n));
    }
}
