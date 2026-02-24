package Recursion;

public class DecreasingOrder {

    public static void Decrease(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        Decrease(n-1);
    }
    public static void main(String[] args) {
        int n = 10;

       Decrease(n);
    }
}
