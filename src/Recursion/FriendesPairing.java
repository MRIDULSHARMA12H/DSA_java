package Recursion;

import java.util.Scanner;

public class FriendesPairing {
    public static int pair(int n)
    {
        if(n==1|| n==2)
        {
            return n;
        }
        int single = pair(n-1);
        int pairing = (n-1) * pair(n-2);
        return single + pairing;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of freinds" + " ");
        int n = sc.nextInt();
        System.out.println(pair(n));
    }
}
