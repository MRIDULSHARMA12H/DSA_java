package Recursion;
import java.util.Scanner;
public class IncreasingOrder {
    public static void Increase(int n)
    {
        if(n==0){
            return;
        }
        Increase(n-1);
        System.out.print(n+ " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        Increase(n);
    }
}
