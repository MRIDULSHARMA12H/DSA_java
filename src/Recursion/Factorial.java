package Recursion;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Factorial
{
    public static int Fact(int n){
        if(n==1)
        {
            return 1;
        }
        else
        {
            return Fact(n-1)*n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fact(n));
    }
}
