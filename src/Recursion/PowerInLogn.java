package Recursion;

import java.util.Scanner;

public class PowerInLogn {
    public static int pow(int x , int n)
    {
        if(n == 0)
        {
            return 1;
        }
        if(n %2 ==0)
        {
            return pow(x,n/2) * pow(x,n/2);
        }

        return x * pow(x,n/2) *  pow(x,n/2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(pow(x,n));

    }
}
